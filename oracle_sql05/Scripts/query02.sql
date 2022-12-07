/*
VIEW 객체
	- SELECT 문의 실행 결과를 저장한 가상 테이블
	- 테이블과 다르게 실제 데이터를 저장하고 있지는 않으나 실제 테이블을
	  사용하는 것과 동일하게 사용 가능
	- 복잡한 SELECT 구문을 VIEW 로 만들어 간단하게 사용하기 위해 사용할 수 있다.
*/

CREATE OR REPLACE VIEW V_EMP
AS
SELECT EMPLOYEE_ID AS EMP_ID
     , FIRST_NAME || ' ' || LAST_NAME AS EMP_NAME
     , EMAIL || '@emp.co.kr' AS EMAIL
     , SALARY
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES;
  
 SELECT * FROM V_EMP;
 
/*
VIEW 를 사용하여 INSERT, UPDATE, DELETE 작업을 할 수 있지만 다음의 경우에는
사용할 수 없다.
	1. VIEW 에 포함되지 않은 컬럼을 사용하는 경우
	2. VIEW 에 포함되지 않은 컬럼중 NOT NULL 제약조건이 있는 경우
	3. 산술 표현식으로 정의된 경우
	4. 그룹함수나 GROUP BY 절이 포함된 경우
	5. DISTINCT 키워드가 있는 경우
	6. JOIN 을 사용하여 여러 테이블이 결합된 경우
*/
CREATE OR REPLACE VIEW V_NOTICE
AS
SELECT N.ID 