/*
 * 프로시져로 다음의 기능이 동작하도록 한다.
 * 
 * LOGIN 테이블 생성한다.
 *     USERNAME : 사용자 ID가 저장될 컬럼
 *     PASSWORD : 패스워드가 저장될 컬럼
 *     TRY_CNT : 시도횟수가 저장될 컬럼
 *     LOGIN_LOCK : 로그인 잠김 유무가 저장될 컬럼
 *     LOCK_DATE : 로그인이 잠긴 날짜가 저장될 컬럼
 * 
 * USERNAME 과 PASSWORD 를 입력 받을 수 있는 PL/SQL 구문을 작성하여
 * 패스워드를 잘못 입력하여 최대 입력 횟수 3번을 초과한 경우 더 이상
 * 로그인을 수행할 수 없도록 만드는 PL/SQL을 작성하시오.
 * 
 * 추가 기능
 *     - 로그인이 잠긴 시점을 기록해 두었다가 5분의 시간이 지난 이후에는
 *       다시 로그인을 시도할 수 있도록 하세요.
 */
CREATE OR REPLACE PROCEDURE PROC_LOGIN(
       IN_USERNAME IN VARCHAR2
     , IN_PASSWORD IN VARCHAR2
)
IS
    EXISTS_USER NUMBER;
    CUSERNAME VARCHAR(25);
    CPASSWORD VARCHAR2(25);
    RCNT NUMBER;
    CLOGIN_LOCK CHAR(4);
    CLOCK_DATE DATE;
BEGIN
    SELECT COUNT(*)
      INTO EXISTS_USER
      FROM LOGIN
     WHERE USERNAME = IN_USERNAME;
      
    IF(EXISTS_USER = 0) THEN
        /* 계정 정보가 없습니다. */
        DBMS_OUTPUT.PUT_LINE('계정 정보가 존재하지 않습니다.');
    ELSE
        /* 계정 정보가 있습니다. */
        SELECT USERNAME, PASSWORD, TRY_CNT, LOGIN_LOCK, LOCK_DATE
          INTO CUSERNAME, CPASSWORD, RCNT, CLOGIN_LOCK, CLOCK_DATE
          FROM LOGIN
         WHERE USERNAME = IN_USERNAME;
        
        IF CLOGIN_LOCK = 'LOCK' AND SYSDATE < (CLOCK_DATE + INTERVAL '5' MINUTE) THEN
            DBMS_OUTPUT.PUT_LINE('계정이 잠겨있습니다. '
                || TO_CHAR((CLOCK_DATE + INTERVAL '5' MINUTE), 'YYYY.MM.DD HH24:MI:SS')
                || ' 이후에 다시 시도하세요.');
        ELSE
            IF(IN_PASSWORD = CPASSWORD) THEN
                /* 패스워드가 일치 합니다. */
                DBMS_OUTPUT.PUT_LINE('로그인에 성공하였습니다.');
                UPDATE LOGIN
                   SET TRY_CNT = 0
                     , LOGIN_LOCK = NULL
                 WHERE USERNAME = IN_USERNAME;
            ELSE
                /* 패스워드가 일치하지 않습니다. */
                DBMS_OUTPUT.PUT_LINE('로그인에 실패하였습니다.');
            
                IF RCNT + 1 = 3 THEN
                    DBMS_OUTPUT.PUT_LINE('로그인 시도 3회 실패하였습니다. 계정이 5분간 잠김니다.');
                    UPDATE LOGIN
                       SET LOGIN_LOCK = 'LOCK'
                         , LOCK_DATE = SYSDATE
                     WHERE USERNAME = IN_USERNAME;
                ELSE
                    DBMS_OUTPUT.PUT_LINE('남은 로그인 횟수: ' || TO_CHAR(3 - (RCNT + 1)) || '회 남았습니다.');
                    UPDATE LOGIN
                       SET TRY_CNT = TRY_CNT + 1
                     WHERE USERNAME = IN_USERNAME;
                END IF;
            END IF;
        END IF;
    END IF;
END;

BEGIN
    PROC_LOGIN('test', 'test1');
END;

SELECT * FROM LOGIN;
SELECT * FROM USER_ERRORS;



/*
 * DEPARTMENTS 테이블에 총원(TOTAL) 컬럼을 추가하여 부서별 인원을 기록할 수 있도록 수정한다.
 * 
 * 사원 추가(PROC_ADD_EMPLOYEE) 프로시져를 생성하여 사원을 추가할 때 다음의 기능이 동작하도록 한다.
 *     - EMPLOYEES 테이블에 사원을 추가할 수 있는 최소한의 정보를 이용하여 프로시져가 동작하게 한다.
 *     - 추가된 사원의 부서에 맞추어 DEPARTMENTS 테이블의 TOTAL 컬럼의 총원을 증가시키도록 한다.
 * 
 * 사원 수정(PROC_MOD_EMPLOYEE) 프로시져와 사원 삭제(PROC_DEL_EMPLOYEE) 프로시져를 생성하여 다음의 기능이
 * 동작하도록 한다.
 *     - EMPLOYEES 테이블의 사원정보를 수정/삭제 할 수 있는 최소한의 정보를 이용하여 프로시져가 동작하게 한다.
 *     - 사원의 정보를 수정할 때는 급여, 직무, 부서 만 수정할 수 있게 한다.
 *     - 수정/삭제된 사원의 부서에 맞추어 DEPARTMENTS 테이블의 TOTAL 컬럼의 총원을 증가 혹은 감소 시키도록 한다.
 */
ALTER TABLE DEPARTMENTS ADD TOTAL NUMBER DEFAULT(0);

UPDATE DEPARTMENTS D1
   SET TOTAL = (SELECT COUNT(*)
                  FROM EMPLOYEES E JOIN DEPARTMENTS D2
                    ON E.DEPARTMENT_ID = D2.DEPARTMENT_ID
                 WHERE D2.DEPARTMENT_ID = D1.DEPARTMENT_ID);

CREATE OR REPLACE PROCEDURE PROC_ADD_EMPLOYEE(
       IN_FNAME IN VARCHAR2
     , IN_LNAME IN VARCHAR2
     , IN_JOB_ID IN VARCHAR2
     , IN_DEPT_ID IN NUMBER
     , OUT_EMP_ID OUT NUMBER
)
IS
    EMP_ID NUMBER;
    EMP_SALARY NUMBER;
    EXISTS_JOB NUMBER;
    EXISTS_DEPT NUMBER;
BEGIN
	SELECT MAX(EMPLOYEE_ID) + 1 INTO EMP_ID FROM EMPLOYEES;
    SELECT COUNT(*) INTO EXISTS_JOB FROM JOBS WHERE JOB_ID = IN_JOB_ID;
    SELECT COUNT(*) INTO EXISTS_DEPT FROM DEPARTMENTS WHERE DEPARTMENT_ID = IN_DEPT_ID;
    IF EXISTS_JOB = 1 AND EXISTS_DEPT = 1 THEN
        SELECT MIN_SALARY INTO EMP_SALARY FROM JOBS WHERE JOB_ID = IN_JOB_ID;
        INSERT INTO EMPLOYEES(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE
                            , JOB_ID, SALARY, DEPARTMENT_ID)
               VALUES(EMP_ID, IN_FNAME, IN_LNAME, CONCAT(SUBSTR(UPPER(IN_FNAME), 1, 1), UPPER(IN_LNAME)), SYSDATE
                    , IN_JOB_ID, EMP_SALARY, IN_DEPT_ID);
        
        UPDATE DEPARTMENTS
           SET TOTAL = TOTAL + 1
         WHERE DEPARTMENT_ID = IN_DEPT_ID;
        
        OUT_EMP_ID := EMP_ID;
        
        COMMIT;
    END IF;
END;

DECLARE
    EMP_ID NUMBER;
BEGIN
    PROC_ADD_EMPLOYEE('Chul Su', 'Kim', 'IT_PROG', 60, EMP_ID);
    DBMS_OUTPUT.PUT_LINE(EMP_ID || '번 사원이 추가되었습니다.');
END;

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 217;
SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = 60;



-- 급여, 직무, 부서 만 수정
CREATE OR REPLACE PROCEDURE PROC_MOD_EMPLOYEE(
       IN_EMP_ID IN NUMBER
     , IN_SALARY IN NUMBER
     , IN_JOB_ID IN VARCHAR2
     , IN_DEPT_ID IN NUMBER
)
IS
    EXISTS_EMP NUMBER;
    OLD_DEPT_ID NUMBER;
BEGIN
	SELECT COUNT(*)
	  INTO EXISTS_EMP
	  FROM EMPLOYEES
	 WHERE EMPLOYEE_ID = IN_EMP_ID;
	
	IF EXISTS_EMP = 1 THEN
	    IF IN_SALARY <> -1 THEN
	        UPDATE EMPLOYEES
	           SET SALARY = IN_SALARY
	         WHERE EMPLOYEE_ID = IN_EMP_ID;
	    END IF;
	    
	    IF IN_JOB_ID IS NOT NULL THEN
	        UPDATE EMLOYEES
	           SET JOB_ID = IN_JOB_ID
	         WHERE EMPLOYEE_ID = IN_EMP_ID;
	    END IF;
	   
	    IF IN_DEPT_ID <> -1 THEN
	        SELECT DEPARTMENT_ID
	          INTO OLD_DEPT_ID
	          FROM EMPLOYEES
	         WHERE EMPLOYEE_ID = IN_EMP_ID;
	        
	        UPDATE EMPLOYEES
	           SET DEPARTMENT_ID = IN_DEPT_ID
	         WHERE EMPLOYEE_ID = IN_EMP_ID;
	        
	        UPDATE DEPARTMENTS
	           SET TOTAL = TOTAL + 1
	         WHERE DEPARTMENT_ID = IN_DEPT_ID;
	        
	        UPDATE DEPARTMENTS
	           SET TOTAL = TOTAL - 1
	         WHERE DEPARTMENT_ID = OLD_DEPT_ID;
	    END IF;
	   
	    COMMIT;
	END IF;
END;

SELECT * FROM USER_ERRORS;

DECLARE
    EMP_ID NUMBER;
BEGIN
    PROC_MOD_EMPLOYEE(217, -1, NULL, -1);
END;

CREATE OR REPLACE PROCEDURE PROC_DEL_EMPLOYEE()
IS
BEGIN
END;


SELECT * FROM DEPARTMENTS;











/*
 * 특정 직무에 대한 급여 테이블을 일정 퍼센트 상승 및 감소를 시킨 경우 JOBS 테이블의 MIN_SALARY, MAX_SALARY 컬럼의 값과
 * EMPLOYEES 테이블에 동일 직무를 부여 받은 사원의 SALARY 컬럼의 값을 변경하는 PROCEDURE 를 생성한다.
 * 
 * 프로시져의 실행 결과로 몇개의 행이 반영되었는지 반환할 수 있게 한다.
 */

CREATE OR REPLACE PROCEDURE PROC_INC_JOB_SALARY(
       IN_JOB_ID IN VARCHAR2
     , IN_PERCENT IN NUMBER
     , OUT_ROW_COUNT OUT NUMBER
)
IS
    ROW_CNT NUMBER;
    UPPER_JOB_ID VARCHAR2(25);
BEGIN
	OUT_ROW_COUNT := 0;
    UPPER_JOB_ID := UPPER(IN_JOB_ID);
    IF IN_PERCENT > -1.0 AND IN_PERCENT < 1.0 THEN
        SELECT COUNT(*)
          INTO OUT_ROW_COUNT
          FROM JOBS
         WHERE JOB_ID = UPPER_JOB_ID;

        UPDATE JOBS
           SET MIN_SALARY = MIN_SALARY * (1 + IN_PERCENT)
             , MAX_SALARY = MAX_SALARY * (1 + IN_PERCENT)
         WHERE JOB_ID = UPPER_JOB_ID;
    
        SELECT COUNT(*)
          INTO ROW_CNT
          FROM EMPLOYEES
         WHERE JOB_ID = UPPER_JOB_ID;
    
        OUT_ROW_COUNT := OUT_ROW_COUNT + ROW_CNT;
   
        UPDATE EMPLOYEES
           SET SALARY = SALARY * (1 + IN_PERCENT)
         WHERE JOB_ID = UPPER_JOB_ID;
    END IF;
    COMMIT;
END;

DECLARE
    ROW_COUNT NUMBER;
BEGIN
    PROC_INC_JOB_SALARY('IT_PROG', 10, ROW_COUNT);
    DBMS_OUTPUT.PUT_LINE(ROW_COUNT || ' 개 행이 반영되었습니다.');
END;

SELECT * FROM USER_ERRORS;

DECLARE
    ROW_COUNT NUMBER;
BEGIN
    PROC_INC_JOB_SALARY('IT_PROG', 0.2, ROW_COUNT); /* 양수는 증가 */
    PROC_INC_JOB_SALARY('IT_PROG', -0.1, ROW_COUNT);/* 음수는 감소 */
    PROC_INC_JOB_SALARY('it_prog', 0.1, ROW_COUNT); /* 소문자도 처리 가능 */
    PROC_INC_JOB_SALARY('it', 0.1, ROW_COUNT);      /* 잘못된 JOB_ID 는 오류 없이 0개행 반영으로 종료 */
    PROC_INC_JOB_SALARY('IT_PROG', 10, ROW_COUNT);  /* -1.0 초과 ~ 1.0 미만 의 범위만 처리, 그 외 범위는 0개행 반영으로 종료 */
    DBMS_OUTPUT.PUT_LINE(ROW_COUNT || ' 개 행이 반영되었습니다.');
END;






