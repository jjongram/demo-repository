/*
 * PL/SQL
 *     - Procedural Language extention to SQL
 *     - SQL 문장에서 변수의 정의, 조건문, 반복문 등의 프로그래밍 언어에서
 *       지원하는 기능을 일부 지원하는 것
 * 
 * PL/SQL 구조
 *     DECLARE
 *         변수 정의 영역(생략 가능)
 *     BEGIN
 *         실행 영역
 *     EXCEPTION
 *         예외 처리 영역(생략 가능)
 *     END;
 */

/* SET 은 sqlplus 전용 명령어이기 때문에 DBeaver 에서 안됨 */
SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello PL/SQL');
END;


/*
 * 기본 변수 사용 방법
 */
DECLARE
    NUM1 NUMBER := 10;
    NUM2 NUMBER;
BEGIN
	NUM2 := 5;
	DBMS_OUTPUT.PUT_LINE(NUM1 + NUM2);
END;

DECLARE
    STR1 VARCHAR2(10) := '문자열';
    STR2 CHAR(10);
BEGIN
	STR2 := 'String';
    DBMS_OUTPUT.PUT_LINE(STR1 || '|');
    DBMS_OUTPUT.PUT_LINE(STR2 || '|');
END;

/*
 * 조회 결과 출력하기
 */
DECLARE
    pID NUMBER;
    pNAME VARCHAR2(50);
BEGIN
    SELECT EMPLOYEE_ID
         , FIRST_NAME || ' ' || LAST_NAME
      INTO pID, pNAME
      FROM EMPLOYEES
     WHERE EMPLOYEE_ID = :id;
    DBMS_OUTPUT.PUT_LINE(pID || '|' || pNAME);
END;


/*
 * IF 문 사용하기
 */
DECLARE
    NUM NUMBER;
BEGIN
	NUM := :num;
    IF(NUM > 10) THEN
        DBMS_OUTPUT.PUT_LINE('NUM 값은 10 보다 큽니다.');
    ELSIF(NUM = 10) THEN
        DBMS_OUTPUT.PUT_LINE('NUM 값은 10 입니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('NUM 값은 10 보다 작습니다.');
    END IF;
END;


/*
 * 반복문 사용하기
 */
BEGIN
    FOR N IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(N || ' 번째 반복 입니다.');
    END LOOP;
END;

BEGIN
    FOR N IN REVERSE 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(N || ' 번째 반복 입니다.');
    END LOOP;
END;

DECLARE
    CNT NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE(CNT || ' 번째 반복 입니다.');
        CNT := CNT + 1;
        IF(CNT > 5) THEN
            EXIT;
        END IF;
    END LOOP;
END;

DECLARE
   CNT NUMBER := 1;
BEGIN
    WHILE CNT <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(CNT || ' 번째 반복 입니다.');
        CNT := CNT + 1;
    END LOOP;
END;


DECLARE
    ST_ID NUMBER := 100;
    ED_ID NUMBER := 109;
    ID NUMBER;
    NAME VARCHAR2(50);
BEGIN
    FOR C_ID IN ST_ID..ED_ID LOOP
        SELECT EMPLOYEE_ID, CONCAT(FIRST_NAME, ' ' || LAST_NAME)
          INTO ID, NAME
          FROM EMPLOYEES
         WHERE EMPLOYEE_ID = C_ID;
        DBMS_OUTPUT.PUT_LINE(ID || '|' || NAME);
    END LOOP;
END;


/*
 * INSERT / UPDATE / DELETE 문 사용하기
 */
CREATE TABLE TEST1(
       ID NUMBER PRIMARY KEY
     , NAME VARCHAR2(30)
     , AGE NUMBER
);

BEGIN
	/*
	 * SQLplus 에서는 아래의 형식을 사용
	 * INSERT INTO TEST1 VALUES(&id, '&name', &age);
	 */
    INSERT INTO TEST1 VALUES(:id, :name, :age);
    COMMIT;
END;

DECLARE
    CNAME VARCHAR2(30);
    CAGE NUMBER;
    SID NUMBER;
BEGIN
	SID := :select_id;
    CNAME := :change_name;
    CAGE := :change_age;
    UPDATE TEST1
       SET NAME = CNAME
         , AGE = CAGE
     WHERE ID = SID;
    COMMIT;
END;



DECLARE
    VID NUMBER;
    VNAME VARCHAR2(30);
    VAGE NUMBER;
    CNT NUMBER;
BEGIN
	VID := :id;
    VNAME := :name;
    VAGE := :age;
    
    SELECT COUNT(*)
      INTO CNT
      FROM TEST1
     WHERE ID = VID;
    
    IF(CNT > 0) THEN
        UPDATE TEST1
           SET NAME = VNAME
             , AGE = VAGE
         WHERE ID = VID;
        DBMS_OUTPUT.PUT_LINE('ID:' || VID || ' 데이터를 수정하였습니다.');
    ELSE
        INSERT INTO TEST1 VALUES(VID, VNAME, VAGE);
       DBMS_OUTPUT.PUT_LINE('ID:' || VID || ' 데이터를 추가하였습니다.');
    END IF;
    COMMIT;
END;

/*
 * EXCEPTION 사용
 */
DECLARE
    VID NUMBER;
    VNAME VARCHAR2(30);
    VAGE NUMBER;
BEGIN
	VID := :id;
    VNAME := :name;
    VAGE := :age;
    
    INSERT INTO TEST1 VALUES(VID, VNAME, VAGE);
    DBMS_OUTPUT.PUT_LINE('ID:' || VID || ' 데이터를 추가하였습니다.');
    COMMIT;
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        UPDATE TEST1
           SET NAME = VNAME
             , AGE = VAGE
         WHERE ID = VID;
        DBMS_OUTPUT.PUT_LINE('ID:' || VID || ' 데이터를 수정하였습니다.');
    COMMIT;
END;

















