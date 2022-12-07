/*
 * 함수
 *     - 문자 함수 : 문자열에서 일부 문자열만 잘라내거나, 공백제거, 대소문자변환, 일부내용변경 등의
 *                   기능을 제공
 *     - 숫자 함수 : 소수점 처리에 대한 기능 제공
 *     - 날짜 함수 : 시스템날짜 생성 및 날짜에서 년, 월, 일 등의 정보를 추출하기 위한 기능 제공
 *     - 형변환 함수 : 문자 데이터를 숫자 데이터로 또는 그 반대로 변환하거나 문자 데이터를 날짜
 *                     데이터로 변환 또는 그 반대로 변환하기 위한 기능 제공
 *     - 그룹 함수 : Record Set 을 이용하여 전체 레코드 수, 최대값, 최소값 등의 정보를 얻을 수
 *                   있는 기능을 제공
 */

/*
 * 문자 함수
 */
SELECT EMAIL
     , LENGTH(EMAIL) AS 문자열길이
  FROM EMPLOYEES;

SELECT JOB_ID
     , INSTR(JOB_ID, '_') AS 문자위치
  FROM EMPLOYEES;

SELECT JOB_ID
     , SUBSTR(JOB_ID, 1, 2) AS 잘라내기1
     , SUBSTR(JOB_ID, 4) AS 잘라내기2
  FROM EMPLOYEES;

SELECT FIRST_NAME || ' ' || LAST_NAME AS 이름
     , UPPER(FIRST_NAME || ' ' || LAST_NAME) AS 대문자이름
     , LOWER(FIRST_NAME || ' ' || LAST_NAME) AS 소문자이름
     , INITCAP(FIRST_NAME || ' ' || LAST_NAME) AS 단어의첫번째문자만대문자
     , CONCAT(FIRST_NAME, LAST_NAME) AS 결합
  FROM EMPLOYEES;

SELECT EMAIL
     , RPAD(EMAIL, 20) AS 오른쪽에여백추가1
     , LPAD(EMAIL, 20) AS 왼쪽에여백추가1
     , RPAD(EMAIL, 20, '*') AS 오른쪽에여백추가2
     , LPAD(EMAIL, 20, '*') AS 왼쪽에여백추가2
  FROM EMPLOYEES;

SELECT TRIM(EMAIL || '      ') AS 이메일1
     , TRIM('      ' || EMAIL) AS 이메일2
     , EMAIL || '@emp.co.kr' AS 원본이메일형식
     , RTRIM(EMAIL || '@emp.co.kr', '@emp.co.kr') AS 도메인제거
     , LTRIM(EMAIL || '@emp.co.kr', EMAIL) AS 계정명제거
  FROM EMPLOYEES;

SELECT PHONE_NUMBER
     , REPLACE(PHONE_NUMBER, '.', '-') AS 전화번호
  FROM EMPLOYEES;

-- SUBSTR 함수와 그외 추가 문자 함수 이용하여 계정, 도메인을 분리하시오.
-- LTRIM, RTRIM 을 사용하지 않는다.
SELECT EMAIL || '@emp.co.kr' AS 원본이메일형식
     , SUBSTR(EMAIL || '@emp.co.kr', 1, INSTR(EMAIL || '@emp.co.kr', '@') - 1) AS 계정명
     , SUBSTR(EMAIL || '@emp.co.kr', INSTR(EMAIL || '@emp.co.kr', '@')) AS 도메인
  FROM EMPLOYEES;


/*
 * 숫자 함수
 */
SELECT ABS(-10) AS 절대값
     , MOD(10, 7) AS 나머지
     , ROUND(12.345, 1) AS 반올림1
     , ROUND(12.356, 1) AS 반올림2
     , ROUND(12.345, 2) AS 반올림3
     , ROUND(12.356, 2) AS 반올림4
     , FLOOR(12.345) AS 버림1
     , TRUNC(12.345, 1) AS 버림2
     , TRUNC(12.345, 2) AS 버림3
     , CEIL(12.345) AS 올림
  FROM DUAL;



/*
 * 날짜 함수
 */
SELECT SYSDATE AS 현재시스템날짜
     , SYSTIMESTAMP AS 현재시스템타임스탬프
  FROM DUAL;

SELECT EXTRACT(YEAR FROM SYSDATE) AS 년도
     , EXTRACT(MONTH FROM SYSDATE) AS 월
     , EXTRACT(DAY FROM SYSDATE) AS 일
     , EXTRACT(HOUR FROM SYSTIMESTAMP) AS 시
     , EXTRACT(MINUTE FROM SYSTIMESTAMP) AS 분
     , EXTRACT(SECOND FROM SYSTIMESTAMP) AS 초
  FROM DUAL;

SELECT ADD_MONTHS(SYSDATE, 1) AS "1개월뒤"
     , ADD_MONTHS(SYSDATE, 2) AS "2개월뒤"
  FROM DUAL

SELECT LAST_DAY(SYSDATE)
     , LAST_DAY(ADD_MONTHS(SYSDATE, 1))
     , LAST_DAY(ADD_MONTHS(SYSDATE, 2))
  FROM DUAL;

SELECT NEXT_DAY(SYSDATE, 1) AS "다음일요일"
     , NEXT_DAY(SYSDATE, 2) AS "다음월요일"
     , NEXT_DAY(SYSDATE, 3) AS "다음화요일"
     , NEXT_DAY(SYSDATE, 4) AS "다음수요일"
     , NEXT_DAY(SYSDATE, 5) AS "다음목요일"
     , NEXT_DAY(SYSDATE, 6) AS "다음금요일"
     , NEXT_DAY(SYSDATE, 7) AS "다음토요일"
  FROM DUAL;

SELECT MONTHS_BETWEEN(SYSDATE, ADD_MONTHS(SYSDATE, 5)) AS 개월차
  FROM DUAL;

SELECT SYSDATE AS 현재날짜
     , SYSDATE + INTERVAL '10' DAY AS "10일뒤"
     , SYSDATE - INTERVAL '10' DAY AS "10일전"
     , SYSDATE + INTERVAL '10' MONTH AS "10개월뒤"
     , SYSDATE - INTERVAL '10' MONTH AS "10개월전"
     , SYSDATE + INTERVAL '10' YEAR AS "10년뒤"
     , SYSDATE - INTERVAL '10' YEAR AS "10년전"
  FROM DUAL;
  
SELECT SYSDATE + INTERVAL '10' HOUR AS "10시간뒤"
     , SYSDATE - INTERVAL '10' HOUR AS "10시간전"
     , SYSDATE + INTERVAL '10' MINUTE AS "10분뒤"
     , SYSDATE - INTERVAL '10' MINUTE AS "10분전"
     , SYSDATE + INTERVAL '10' SECOND AS "10초뒤"
     , SYSDATE - INTERVAL '10' SECOND AS "10초전"
  FROM DUAL;
 
/*
 * 형변환 함수
 *     TO_CHAR(숫자 또는 날짜) : 문자로 변환
 *     TO_NUMBER(문자) : 숫자로 변환
 *     TO_DATE(숫자 또는 문자) : 날짜로 변환
 */
SELECT '1234' AS 문자타입
     , 1234 AS 숫자타입
     , SYSDATE AS 날짜타입
  FROM DUAL;

SELECT TO_CHAR(1234)
     , TO_CHAR(12.34)
     , TO_CHAR(SYSDATE)
  FROM DUAL;

SELECT TO_CHAR(123456, '999,999,999') AS A
     , TO_CHAR(123456, '000,000,000') AS B
     , TO_CHAR(123456.789, '999,999,999.99999') AS C
     , TO_CHAR(123456.789, '000,000,000.00000') AS D
  FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYYMMDD') AS A
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD') AS B
     , TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS C
     , TO_CHAR(SYSDATE, 'YYYY.MM.DD') AS D
     , TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"') AS E
  FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'HH:MI:SS') AS A
     , TO_CHAR(SYSDATE, 'HH24:MI:SS') AS B
     , TO_CHAR(SYSDATE, 'HH24"시" MI"분" SS"초"') AS C
  FROM DUAL;

SELECT TO_NUMBER('1234') AS A
     , TO_NUMBER('12.34') AS B
     , TO_NUMBER('1,000', '999,999') AS C
  FROM DUAL;

SELECT TO_DATE(20221111) AS A
     , TO_DATE('20221111') AS B
     , TO_DATE('2022/11/11') AS C
     , TO_DATE('2022-11-11') AS D
     , TO_DATE('2022.11.11') AS E
     , TO_DATE('2022년 11월 11일', 'YYYY"년" MM"월" DD"일"') AS F
  FROM DUAL;


/*
 * NVL 함수 : NULL 데이터를 다른 값으로 변환할 때 사용
 */
SELECT 10 * 2 AS 계산결과1
     , NVL(NULL, 10) * 2 AS 계산결과2
     , 10 * NVL(NULL, 2) AS 계산결과3
  FROM DUAL;

SELECT SALARY
     , COMMISSION_PCT
     , SALARY * NVL(COMMISSION_PCT, 0)
  FROM EMPLOYEES;


/*
 * DECODE 함수 : 값에 따라 사용할 값을 변경할 때 사용
 *               switch 문과 비슷한 역할 수행
 */
SELECT REGION_ID
     , DECODE(REGION_ID, 1, '유럽', 2, '아메리카', 3, '아시아', 4, '중앙아시아 및 아프리카', '호주')
     , REGION_NAME
  FROM REGIONS;

/*
 * CASE WHEN ... THEN ... END
 */
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , CASE WHEN SALARY >= 2000 AND SALARY < 5000 THEN '낮은급여'
            WHEN SALARY >= 5000 AND SALARY < 9000 THEN '중간급여'
            WHEN SALARY >= 9000 AND SALARY < 15000 THEN '높은급여'
            WHEN SALARY >= 15000 THEN '매우높은급여'
            ELSE '논외급여'
        END AS 급여구분
  FROM EMPLOYEES;


/*
 * 그룹 함수
 *     COUNT(컬럼명 또는 *) : 조회된 Record Set 의 Record 수를 반환
 *     MAX(컬럼명) : 조횐된 Record Set 에서 지정한 컬럼명의 값들 중 가장 큰값을 반환
 *     MIN(컬럼명) : 조횐된 Record Set 에서 지정한 컬럼명의 값들 중 가장 작은값을 반환
 *     AVG(컬럼명) : 조횐된 Record Set 에서 지정한 컬럼명의 값들의 평균을 반환
 *     SUM(컬럼명) : 조횐된 Record Set 에서 지정한 컬럼명의 값들의 총합을 반환
 */
SELECT COUNT(*) FROM EMPLOYEES;

SELECT MAX(EMPLOYEE_ID), MIN(EMPLOYEE_ID) FROM EMPLOYEES;
SELECT MAX(FIRST_NAME), MIN(FIRST_NAME) FROM EMPLOYEES;
SELECT MAX(HIRE_DATE), MIN(HIRE_DATE) FROM EMPLOYEES;

SELECT SUM(SALARY), AVG(SALARY) FROM EMPLOYEES;



