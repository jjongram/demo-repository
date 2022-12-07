/*
SEQUENCE 객체
	- 번호 발생기 객체
	- 정수값을 순차적으로 생성하는 객체
	- PRIMARY KEY로 사용하는 번호(ID) 등에 사용하여 정수값을 생성하기 위한
	  용도로 많이 사용
*/
CREATE SEQUENCE 시퀀스명
     START WITH 10
   INCREMENT BY 10
       MAXVALUE 300
       MINVALUE 10
          CYCLE 
          CACHE 5
;

DROP SEQUENCE 시퀀스명;

/*
 * NEXTVAL, CURRVAL 을 사용할 수 있는 명령어
 * 		1. SELECT 문 (서브쿼리 제외)
 * 		2. INSERT 문의 VALUES 절
 * 		3. INSERT 문의 SELECT
 * 		4. UPDATE 문의 SET 절
 * 
 * NEXTVAL, CURRVAL 을 사용할 수 없는 명령어
 * 		1. VIEW 의 SELECT 절
 * 		2. DISTINCT 키워드가 있는 SELECT 문
 * 		3. GROUP BY, HAVING, ORDER BY 절이 있는 SELECT
 * 		4. SELECT, DELETE, UPDATE 의 서브쿼리
 * 		5. DEFAULT 값
 */
SELECT 시퀀스명.NEXTVAL FROM DUAL;
SELECT 시퀀스명.CURRVAL FROM DUAL;

CREATE TABLE TEMP(
       ID NUMBER
);

INSERT INTO TEMP VALUES(시퀀스명.NEXTVAL);
SELECT * FROM TEMP;
DROP TABLE TEMP;

INSERT INTO TEMP VALUES(시퀀스명.NEXTVAL);
SELECT * FROM TEMP;
