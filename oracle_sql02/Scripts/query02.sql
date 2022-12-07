/*
 * 지출내역서(가계부)를 위한 테이블을 만들어 본다.
 *     - 테이블 이름은 '지출내역서' 로 한다.
 *     - 컬럼은 ID, 날짜, 출입구분, 금액, 비고 로 만들어 사용한다.
 *     - 비고의 경우 한글 100자 까지 저장 가능하게 한다.
 *     - 출입구분은 '출', '입' 만 사용가능하게 한다.
 *     - ID 는 해당 Record 를 식별하기 위한 식별자로 사용할 것이다.
 */
CREATE TABLE 지출내역서(
       ID NUMBER             PRIMARY KEY
     , 날짜 DATE
     , 출입구분 CHAR(1 CHAR) CHECK(출입구분 IN ('출', '입'))
     , 금액 NUMBER
     , 비고 VARCHAR(100 CHAR)
);

SELECT * FROM USER_TABLES WHERE TABLE_NAME = '지출내역서';
SELECT * FROM USER_TAB_COLUMNS WHERE TABLE_NAME = '지출내역서';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = '지출내역서';

DROP TABLE 지출내역서;