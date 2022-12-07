/*
 * GROUP BY 절
 *     - 그룹 함수를 사용하여 그룹에 대한 집계를 나타낼 때 전체 그룹이 아닌
 *       특정 그룹에 대한 집계가 이루어 질 수 있도록 그룹을 묶어주는 역할 수행
 */
SELECT DEPARTMENT_ID
     , COUNT(*) AS 부서별총원
     , MAX(SALARY) AS 부서별최고급여액
     , MIN(SALARY) AS 부서별최저급여액
     , ROUND(AVG(SALARY), 2) AS 부서별평균급여액
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

SELECT JOB_ID
     , COUNT(*) AS 직무별총원
     , MAX(SALARY) AS 직무별최고급여액
     , MIN(SALARY) AS 직무별최저급여액
     , ROUND(AVG(SALARY), 2) AS 직무별평균급여액
  FROM EMPLOYEES
 GROUP BY JOB_ID;

SELECT DEPARTMENT_ID, JOB_ID
     , COUNT(*) AS "부서/직무별총원"
     , MAX(SALARY) AS "부서/직무별최고급여액"
     , MIN(SALARY) AS "부서/직무별최저급여액"
     , ROUND(AVG(SALARY), 2) AS "부서/직무별평균급여액"
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID, JOB_ID
 ORDER BY DEPARTMENT_ID;

SELECT DECODE(COMMISSION_PCT, NULL, '없다', '있다') AS 커미션유무
     , COUNT(*)
     , MAX(SALARY) AS 최고급여액
     , MIN(SALARY) AS 최저급여액
     , MAX(COMMISSION_PCT) AS 최고퍼미션퍼센트
     , MIN(COMMISSION_PCT) AS 최저퍼미션퍼센트
  FROM EMPLOYEES
 GROUP BY DECODE(COMMISSION_PCT, NULL, '없다', '있다');

/*
 * 부서별 커미션 유무와 커미션퍼센트 집계(MAX, MIN)
 */
SELECT DEPARTMENT_ID
     , DECODE(COMMISSION_PCT, NULL, '없다', '있다') AS 커미션유무
     , MAX(NVL(COMMISSION_PCT, 0)) AS 최고퍼미션퍼센트
     , MIN(NVL(COMMISSION_PCT, 0)) AS 최저퍼미션퍼센트
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID, DECODE(COMMISSION_PCT, NULL, '없다', '있다');


/*
 * 년도별 입사자 수를 구하세요.
 *     - 년도는 1980 년 부터 10년 단위로 묶여서 구할 수 있게 하세요.
 */
SELECT FLOOR(EXTRACT(YEAR FROM HIRE_DATE) / 10) * 10 AS 년대
     , COUNT(*)
  FROM EMPLOYEES
 GROUP BY FLOOR(EXTRACT(YEAR FROM HIRE_DATE) / 10) * 10;


/*
 * HAVING 절
 *     - 그룹에 대한 조건절로 사용한다.
 *     - WHERE 절에서 사용하는 조건은 GROUP BY 로 묶이기 전의 조건으로 사용
 */
SELECT DEPARTMENT_ID
     , COUNT(*) AS 부서별총원
     , MAX(SALARY) AS 부서별최고급여액
     , MIN(SALARY) AS 부서별최저급여액
     , ROUND(AVG(SALARY), 2) AS 부서별평균급여액
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY DEPARTMENT_ID
HAVING COUNT(*) <= 5
 ORDER BY 부서별총원;

SELECT JOB_ID
     , COUNT(*) AS 직무별총원
     , MAX(SALARY) AS 직무별최고급여액
     , MIN(SALARY) AS 직무별최저급여액
     , ROUND(AVG(SALARY), 2) AS 직무별평균급여액
  FROM EMPLOYEES
 GROUP BY JOB_ID
HAVING AVG(SALARY) >= 10000
 ORDER BY 직무별평균급여액 DESC;

/*
 * 부서별 전화번호 회선 사용 집계
 *     - 부서별로 전화번호 앞 3자리의 번호가 얼마나 사용되고
 *       있는지 집계를 하려고 한다.
 *     - 부서가 NULL 인 정보는 제외하고 구한다.
 *     - 부서별 사용하고 있는 회선 수가 1개 이하인 것은 집계에서 제외하도록 한다.
 */
SELECT DEPARTMENT_ID AS 부서ID
     , SUBSTR(PHONE_NUMBER, 1, 3) AS 전화번호앞3자리
     , COUNT(*) AS 회선수
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY DEPARTMENT_ID, SUBSTR(PHONE_NUMBER, 1, 3)
HAVING COUNT(*) > 1
 ORDER BY 1;

/*
 * ROLLUP 함수
 *     - GROUP BY 절에 사용하는 함수
 *     - 그룹으로 묶기 위한 조건이 1개 이상인 경우에 사용하며
 *       그룹에 대한 소계, 총계를 추가로 생성한다.
 *     - 함수에 작성한 컬럼 순서대로 1개 컬럼에 대한 집계, 2개 컬럼에 대한 집계를
 *       생성한다.
 */
SELECT DEPARTMENT_ID AS 부서ID
     , JOB_ID AS 직무ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY ROLLUP(DEPARTMENT_ID, JOB_ID)
 ORDER BY 2 NULLS FIRST, 1 NULLS FIRST;

/*
 * CUBE 함수
 *     - GROUP BY 절에 사용하는 함수
 *     - 그룹으로 묶기 위한 조건이 1개 이상인 경우에 사용하며
 *       그룹에 대한 소계, 총계를 추가로 생성한다.
 *     - 함수에 작성한 컬럼의 조합 가능한 모든 집계를 생성한다.
 */
SELECT DEPARTMENT_ID AS 부서ID
     , JOB_ID AS 직무ID
     , COUNT(*)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, JOB_ID)
 ORDER BY 1 NULLS FIRST;


/*
 * GROUPING 함수
 *     - ROLLUP, CUBE 함수를 사용하여 나타낸 집계에 대해 어떤 컬럼을 기준으로
 *       그룹화를 했는지 구분할 수 있도록 해주는 함수
 *     - 함수 실행 결과 0 이 나오면 해당 컬럼이 그룹화에 사용 되었음을 나타낸다.
 */
SELECT DEPARTMENT_ID AS 부서ID
     , JOB_ID AS 직무ID
     , COUNT(*)
     , CASE WHEN GROUPING(DEPARTMENT_ID) = 0 AND GROUPING(JOB_ID) = 0 THEN '부서/직무그룹'
            WHEN GROUPING(DEPARTMENT_ID) = 0 AND GROUPING(JOB_ID) = 1 THEN '부서그룹'
            WHEN GROUPING(DEPARTMENT_ID) = 1 AND GROUPING(JOB_ID) = 0 THEN '직무그룹'
            WHEN GROUPING(DEPARTMENT_ID) = 1 AND GROUPING(JOB_ID) = 1 THEN '총계'
        END AS 그룹구분
     , DECODE(
              GROUPING(DEPARTMENT_ID) * 10 + GROUPING(JOB_ID)
            , 0, '부서/직무'
            , 1, '부서'
            , 10, '직무'
            , 11, '총계') AS 디코드
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, JOB_ID)
 ORDER BY 1 NULLS FIRST;