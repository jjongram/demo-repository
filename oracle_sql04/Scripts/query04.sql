/*
 * 부서가 있는 위치를 출력할 때 COUNTRY_ID 가 아닌 COUNTRY_NAME 이
 * 출력 되도록 SUBQUERY 를 사용하세요.(COUNTRIES 테이블 활용)
 */
SELECT D.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
     , (SELECT COUNTRY_NAME
          FROM COUNTRIES
         WHERE COUNTRY_ID = L.COUNTRY_ID) AS COUNTRY_NAME
  FROM DEPARTMENTS D
  JOIN LOCATIONS L
    ON D.LOCATION_ID = L.LOCATION_ID
 WHERE D.MANAGER_ID IS NOT NULL
 ORDER BY 1;

/*
 * 사원에게 부여된 직무중 가장 많이 부여된 직무 상위 3개의 TITLE 을 조회 하시오. 
 */
SELECT ROWNUM AS 순위
     , 직원수
     , (SELECT JOB_TITLE FROM JOBS WHERE JOB_ID = J.JOB_ID) AS JOB_TITLE
  FROM (SELECT COUNT(*) AS 직원수
             , JOB_ID
          FROM EMPLOYEES
         GROUP BY JOB_ID
         ORDER BY 1 DESC) J
 WHERE ROWNUM <= 3;


SELECT ROWNUM AS 순위
     , J1.직원수
     , J2.JOB_TITLE
  FROM (SELECT COUNT(*) AS 직원수
             , JOB_ID
          FROM EMPLOYEES
         GROUP BY JOB_ID
         ORDER BY 1 DESC) J1
  JOIN JOBS J2
    ON J1.JOB_ID = J2.JOB_ID
 WHERE ROWNUM <= 3;

/*
 * 가장 많이 부여된 직무 상위 3개가 어떤 부서에 소속되어 있는지 부서명을 조회하시오.
 */
SELECT DISTINCT E.DEPARTMENT_ID
     , D.DEPARTMENT_NAME
  FROM EMPLOYEES E
  JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
 WHERE E.JOB_ID IN (SELECT JOB_ID
                      FROM (SELECT COUNT(*) AS 직원수
                                 , JOB_ID
                              FROM EMPLOYEES
                             GROUP BY JOB_ID
                             ORDER BY 1 DESC)
                     WHERE ROWNUM <= 3);


/*
 * 급여를 가장 많이 받는 직원 5명이 어떤 국가(COUNTRIES)에서 일하고 있는지 국가명을
 * 조회하시오.
 */
SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.LAST_NAME
     , C.COUNTRY_NAME
  FROM EMPLOYEES E
  JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
  JOIN LOCATIONS L
    ON D.LOCATION_ID = L.LOCATION_ID
  JOIN COUNTRIES C
    ON L.COUNTRY_ID = C.COUNTRY_ID
 WHERE E.EMPLOYEE_ID IN (SELECT EMPLOYEE_ID
                           FROM (SELECT EMPLOYEE_ID
                                      , SALARY
                                   FROM EMPLOYEES
                                  ORDER BY SALARY DESC)
                          WHERE ROWNUM <= 5);

/*
 * 가장 최근에 입사한 사원 5명이 소속되어 있는 부서를 찾아 조회하세요.
 */
SELECT DEPARTMENT_ID
     , DEPARTMENT_NAME
  FROM DEPARTMENTS
 WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                           FROM (SELECT *
                                   FROM EMPLOYEES
                                  ORDER BY HIRE_DATE DESC)
                          WHERE ROWNUM <= 5);