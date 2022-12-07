/*
 * DQL : SELECT 구문
 *       데이터베이스의 테이블에 저장된 데이터를 조회하기 위해 사용
 *       조회 결과로 Record Set을 반환하게 된다.
 *       Record Set에는 Record 가 포함되어 있으며, 이 Record 는 0개가 나올 수 있다.
 */
SELECT * FROM EMPLOYEES;

/*
 * - SELECT 구문에는 SELECT 절, FROM 절, WHERE 절, ORDER BY 절 등으로 구성되어 있다.
 * - SELECT 절에는 Record Set 에 포함시킬 컬럼정보를 작성한다.
 * - FROM 절에는 데이터를 조회할 테이블명을 작성한다.
 * - WHERE 절에는 테이블에 저장된 데이터 중 특정 조건에 해당하는 데이터만 Record Set으로
 *   포함시키기 위해 사용한다.
 * - ORDER BY 절은 최종 Record Set의 데이터를 특정 컬럼을 기준으로 정렬하기 위해 사용한다.
 */
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID >= 200;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID >= 200
 ORDER BY LAST_NAME DESC;

/*
 * SELECT 절에 사용한 컬럼명은 Record Set 으로 반환할 때 새로운 별칭을 부여하여
 * 반환할 수 있다.
 */
SELECT EMPLOYEE_ID 사번
     , FIRST_NAME 이름
     , LAST_NAME 성
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID AS 사번
     , FIRST_NAME AS 이름
     , LAST_NAME AS 성
  FROM EMPLOYEES;

SELECT EMPLOYEE_ID AS "사원 번호"
     , FIRST_NAME AS 이름
     , LAST_NAME AS 성
  FROM EMPLOYEES;


/*
 * SELECT 절에 명시하는 컬럼은 다른 컬럼과 조합해서 하나의 컬럼으로 반환할 수 있다. 
 */
SELECT EMPLOYEE_ID 사번
     , FIRST_NAME || ' ' || LAST_NAME 이름
  FROM EMPLOYEES;

/*
 * SELECT 절에 명시하는 컬럼과 숫자 리터럴과 연산을 수행할 수 있다.
 */
SELECT EMPLOYEE_ID 사번
     , SALARY * 12 급여
  FROM EMPLOYEES;

/*
 * 중복값(Record에 대한 중복)을 제거한 Record Set 을 반환할 수 있다. 
 */
SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES;



/*
 * WHERE 절
 *     - 테이블에 있는 데이터 중 Record Set 에 포함할 데이터를 선별하기 위한 조건이 사용
 *     - 조건식이 사용이 되며, 조건식에는 다양한 연산자를 활용하게 된다.
 * 
 * 연산자
 *     1. 비교 연산자
 *     2. 논리 연산자
 *     3. 산술 연산자
 *     4. IS NULL, IS NOT NULL
 *     5. LIKE
 *     6. IN, NOT IN
 *     7. BETWEEN ... AND ... / NOT BEWEEN ... AND ...
 *     8. 연결 연산자 -> ||
 */

/*
 * 비교 연산자
 *     같다 : =
 *     크다 : >
 *     작다 : <
 *     크거나 같다 : >=
 *     작거나 같다 : <=
 *     다르다 : !=, <>
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY >= 12000;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE FIRST_NAME > 'K';

/*
 * 논리 연산자 : 다른 조건식의 결과로 반환된 true, false 에 대한 연산을 수행
 *     AND : 모든 결과가 true 일 때 해당하는 Record를 Record Set에 반영
 *     OR  : 하나라도 true 일 때 해당하는 Record를 Record Set에 반영
 *     NOT : 선택된 Record 가 아닌 Record를 Record Set에 반영
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY < 2500 AND SALARY > 2000;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY < 2200 OR SALARY > 22000;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE NOT(SALARY < 2200 OR SALARY > 22000);


/*
 * BETWEEN 연산자
 *     - 지정한 범위에 해당하는 데이터를 조회하기 위한 연산으로 사용
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY BETWEEN 2000 AND 2500;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE FIRST_NAME BETWEEN 'A' AND 'C';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE NOT BETWEEN '1999-01-01' AND '1999-12-31';

/*
 * IN 연산자
 *     - 연속되지 않은 범위에 대한 연산으로 사용
 *     - 소괄호 안에 해당하는 값과 일치하는 Record 만 Record Set에 포함된다.
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY IN (2000, 3000, 4000, 5000);

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE SALARY NOT IN (2000, 3000, 4000, 5000);

/*
 * LIKE 연산자
 *     - 문자열에 대한 패턴 검색을 하기 위해 사용
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE 'Ca%';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE '%ra';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE '%ra%';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE '________';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
  FROM EMPLOYEES
 WHERE LAST_NAME LIKE 'S_______';

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , JOB_ID
  FROM EMPLOYEES
 WHERE JOB_ID LIKE '%\____' ESCAPE '\';

/*
 * IS NULL, IS NOT NULL
 *     - NULL 데이터를 가지는 혹은 가지지 않은 Record 를 조회하기 위해 사용하는 연산자
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NULL;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT = NULL;


SELECT * FROM DEPARTMENTS;

SELECT * FROM JOBS;

SELECT * FROM JOB_HISTORY;

SELECT * FROM LOCATIONS;

SELECT * FROM COUNTRIES;

SELECT * FROM REGIONS;