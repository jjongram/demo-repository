-- 사원 테이블
SELECT * FROM EMPLOYEES;

-- 부서 테이블
SELECT * FROM DEPARTMENTS;

-- 직무/직급 테이블
SELECT * FROM JOBS;

-- 직무 변경 이력 테이블
SELECT * FROM JOB_HISTORY;

-- 지점 테이블
SELECT * FROM LOCATIONS;

-- 국가 테이블
SELECT * FROM COUNTRIES;

-- 대륙 테이블
SELECT * FROM REGIONS;

/*
 * 사원 테이블에서 SALARY 정보가 3,000 이하인 사원의 사번(EMPLOYEE_ID)
 * 이름(FIRST_NAME + LAST_NAME) 을 조회하세요.
 */
SELECT EMPLOYEE_ID 사번, FIRST_NAME || ' ' || LAST_NAME 이름 FROM EMPLOYEES WHERE SALARY < 3000;

/*
 * 사원 테이블에서 DEPARTMENT_ID 가 50 인 사원의 사번(EMPLOYEE_ID)
 * 이름(FIRST_NAME + LAST_NAME), 직무(JOB_ID) 를 조회하세요.
 */
SELECT EMPLOYEE_ID 사번
	 , FIRST_NAME || ' ' || LAST_NAME 이름
	 , JOB_ID 직무 
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 50;

/*
 * 부서 테이블에서 DEPARTMENT_NAME 의 값이 IT 가 포함된 결과를 조회하세요.
 * 부서ID(DEPARTMENT_ID), 부서명(DEPARTMENT_NAME) 컬럼만 Record Set 에 반환하세요.
 */
SELECT DEPARTMENT_ID 부서ID
	 , DEPARTMENT_NAME 부서명 
  FROM DEPARTMENTS 
 WHERE DEPARTMENT_NAME 
  LIKE '%IT%';

/*
 * 직무 테이블에서 JOB_TITLE 의 값에 Manager 가 포함된 결과를 조회하세요.
 * 직무ID(JOB_ID), 직무명(JOB_TITLE) 컬럼만 Record Set 에 반환하세요.
 */
 SELECT JOB_ID 직무ID
 	  , JOB_TITLE
   FROM JOBS
  WHERE JOB_TITLE LIKE '%Manager%';
 
 /*
 * 사원 테이블에서 MANAGER_ID 컬럼만을 조회 할 때 중복된 결과값이 나오지 않게 하세요.
 */
SELECT DISTINCT MANAGER_ID
  FROM EMPLOYEES;
 
/*
 * 사원 테이블에서 EMAIL 컬럼을 출력할 때 "@emp.co.kr" 이 추가로 붙어서 나오게 하세요.
 */
SELECT CONCAT(EMAIL, '@emp.co.kr')
  FROM EMPLOYEES;
/*
 * 사원 테이블에서 전화번호 형식이 xxx.xxx.xxxx 에 해당하는 정보만 Record Set 으로 반환되게 하세요.
 */
 SELECT PHONE_NUMBER
   FROM EMPLOYEES
  WHERE PHONE_NUMBER LIKE '___.___.____';

 /*
 * 사원 테이블에서 COMMISSION_PCT 가 NULL 이 아닌 데이터들만 조회되게 하고 SALARY 를 출력할 때
 * COMMISSION_PCT 가 포함된 SALARY 결과가 나오게 하세요.
 */
SELECT SALARY, COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;
/*
 * 사원 테이블에서 HIRE_DATE 가 2000년 01월 01일 부터 2000년 12월 31일 에 해당하는 Record 를 Record Set
 * 으로 반환할 때 HIRE_DATE 를 기준으로 내림차순 정렬이 되도록 하세요.
 */
SELECT HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN '2000-01-01' AND '2000-12-31'
ORDER BY HIRE_DATE DESC ;

/*
 * 부서별 직무가 어떠한 것들이 있는지 확인하기 위한 Record Set을 반환하세요.
 * 단 중복 데이터 및 NULL 데이터가 조회되지 않도록 하세요.
 */
SELECT DISTINCT JOB_ID
  FROM EMPLOYEES
 WHERE JOB_ID IS NOT NULL;