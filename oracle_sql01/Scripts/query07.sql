/*
 * 집합 연산자
 *     - 2 개 이상의 Record Set 결과를 하나의 Record Set 결과로 만드는 연산자
 *     - UNION, UNION ALL, INTERSECT, MINUS 연산자가 있다.
 * 
 * UNION
 *     - 합집합
 *     - 중복 안됨 -> 중복된 결과는 하나만 반영함
 * 
 * UNION ALL
 *     - 합집합
 *     - 중복 허용 -> 중복된 결과 까지 전부 반영됨
 * 
 * INTERSECT
 *     - 교집합
 * 
 * MINUS
 *     - 차집합
 */
SELECT JOB_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (10, 20)
MINUS
SELECT JOB_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (10, 30);

/*
 * GROUPING SETS
 *     - GROUP BY 로 집계한 여러 Record Set 결과를 하나의 Record Set 결과로 합칠 때 사용.
 */

SELECT DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY GROUPING SETS(DEPARTMENT_ID, JOB_ID
                      , (DEPARTMENT_ID, JOB_ID));

/*
 * 위의 GROUPING SETS 는 아래의 형태로 풀어 쓸 수 있다.
 */
SELECT DEPARTMENT_ID
     , NULL AS JOB_ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY DEPARTMENT_ID
UNION
SELECT NULL AS DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY JOB_ID
UNION
SELECT DEPARTMENT_ID
     , JOB_ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY DEPARTMENT_ID, JOB_ID;

