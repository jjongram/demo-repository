CREATE TABLE EMPS
AS
SELECT * FROM EMPLOYEES;

SELECT * FROM EMPS;

INSERT INTO EMPS(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
	      VALUES(207, '길동', '홍', 'asd', NULL, '2022-03-05', 'asd', 2800, NULL, NULL, 80);
	     
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'EMPS';
	     
SELECT * FROM EMPS WHERE JOB_ID = 'asd';

UPDATE EMPS
   SET PHONE_NUMBER = REPLACE(PHONE_NUMBER, '.', '-');

UPDATE EMPS
   SET EMAIL = CONCAT(EMAIL, '@emp.co.kr');
  
  
UPDATE EMPS
   SET EMAIL = 'GILDONG' || '@emp.co.kr'
     , DEPARTMENT_ID = 60
     , PHONE_NUMBER = '590-423-4561'
 WHERE FIRST_NAME ='길동';
  
DROP TABLE EMPS;

SELECT * FROM EMPS WHERE SALARY > 10000 AND EXTRACT(MONTH FROM HIRE_DATE)=6;

UPDATE EMPS
   SET SALARY = SALARY*0.75
 WHERE SALARY > 10000 AND HIRE_DATE < TO_DATE(19900101);

UPDATE EMPS
   SET SALARY = SALARY*1.1
 WHERE DEPARTMENT_ID IN (50, 60, 70);
