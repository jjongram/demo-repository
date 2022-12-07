/*
 * DDL
 *     - 데이터 정의어로 데이터를 저장하고 다루기 위한 객체를 생성(CREATE), 수정(ALTER), 삭제(DROP)
 *       하기 위한 구문을 제공한다.
 *     - ORACLE 에서 사용하는 객체들로는 TABLE, SEQUENCE, VIEW, USER, PROCEDUAL, FUNCTION 등이 있다.
 * 
 * TABLE 객체를 생성 하기 위한 구문
 *     CREATE TABLE <테이블명> (
 *            <컬럼명1> <데이터타입> [제약조건]
 *          , <컬럼명2> <데이터타입> [제약조건]
 *          ...
 *     );
 * 
 * 데이터 타입
 *     CHAR(크기)                   : 고정 길이 문자 타입, 크기는 바이트 단위로 입력,
 *                                    문자의 길이로 크기를 정하는 경우 'CHAR(크기 CHAR)' 형식으로 사용,
 *                                    최대 2000 Byte 까지 저장 가능, 한글은 3 Byte 로 처리됨
 *     VARCHAR2(크기)               : 가변 길이 문자 타입, 크기는 바이트 단위로 입력,
 *                                    문자의 길이로 크기를 정하는 경우 'VARCHAR2(크기 CHAR)' 형식으로 사용,
 *                                    최대 4000 Byte 까지 저장 가능, 한글은 3 Byte 로 처리됨
 *     NUMBER                       : 숫자 타입(실수도 숫자 타입에 포함됨)
 *     NUMBER(크기[, 소수점자릿수]) : 지정한 소수점 자리수의 실수 데이터 저장 가능
 *                                    NUMBER(5, 2) 의 경우 정수 3자리 소수점 2자리 범위로 저장 가능
 *     DATE                         : 날짜 타입
 * 
 *     LONG                         : 가변 길이 문자 타입, 2GB 까지 저장 가능
 *     LOB                          : 가변 길이 바이너리 타입, 2GB 까지 저장 가능
 *     BLOB                         : 대용량 데이터 저장용 객체, 4GB 까지 저장 가능(바이너리 타입)
 *     CLOB                         : 대용량 데이터 저장용 객체, 4GB 까지 저장 가능(문자 타입)
 *     TIMESTAMP                    : 타임스탬프 타입(날짜 타입 확장)
 * 
 * 제약 조건
 *     NOT NULL    : NULL 데이터 저장을 허용하지 않음
 *     UNIQUE      : 중복값 저자을 허용하지 않음
 *     PRIMARY KEY : NULL, 중복값 저장을 허용하지 않음(NOT NULL + UNIQUE 결합으로 Record 를 식별하기 위한
 *                   고유 식별 값으로 사용하기 위한 용도), 기본키 라고 한다.
 *     FOREIGN KEY : 참조하는 테이블의 컬럼의 값이 존재하는 경우에만 허용(다른 테이블의 값을 참조하여 관계를
 *                   형성하기 위한 용도), 외래키 라고 한다.
 *     CHECK       : 지정된 값만 저장할 수 있게 만드는 용도
 *     DEFAULT     : 기본값을 설정하여 데이터 추가 작업에 누락이 되어 있어도 기본값이 저장되도록 한다.
 *                   제약조건이 아니지만 제약조건이 작성되는 부분에 사용되어 여기에 작성함.
 * 
 * 위의 제약 조건을 위반하는 데이터의 추가/수정/삭제 작업이 이루어지는 경우 "제약조건 위반" 이라는 에러가
 * 발생하게 된다.
 * 
 * 제약 조건 작성 방법
 *     - 컬럼 레벨 : 컬럼명, 데이터 타입 옆에 작성하는 것
 *                   기본키, 유니크키, 외래키, NOT NULL, CHECK, DEFAULT 가 해당
 * 
 *     - 테이블 레벨 : 컬럼명, 데이터 타입 처럼 쉼표 이후에 작성하는 것
 *                     단 모든 컬럼정보를 작성 후 제약조건을 작성한다.
 *                     기본키, 유니크키, 외래키, CHECK 가 해당
 */
CREATE TABLE TEST1(
       COL1 NUMBER           PRIMARY KEY
     , COL2 CHAR(5 CHAR)     UNIQUE
     , COL3 VARCHAR2(10)     REFERENCES TEST2(REF1) ON DELETE CASCADE
     , COL4 DATE             NOT NULL
     , COL5 VARCHAR2(10)     CHECK(COL5 IN ('A', 'B'))
     , COL6 VARCHAR2(10)     DEFAULT('')
);
CREATE TABLE TEST3(
       COL1 NUMBER
     , COL2 VARCHAR2(10)
     , COL3 VARCHAR2(10)
     , COL4 DATE             NOT NULL
     , COL5 VARCHAR2(10)
     , COL6 VARCHAR2(10)     DEFAULT('')
     , PRIMARY KEY(COL1)
     , UNIQUE(COL2)
     , FOREIGN KEY(COL3) REFERENCES TEST2(REF1)
     , CHECK(COL5 IN ('A', 'B'))
);
CREATE TABLE TEST2(
       REF1 VARCHAR2(10) PRIMARY KEY
     , COL2 VARCHAR2(10)
);


/*
 * ALTER TABLE
 *     생성한 테이블의 이름을 변경하거나 컬럼명, 데이터 타입, 제약 조건등을 수정할 때 사용
 *     테이블에 데이터가 저장되어 있는 경우 수정 작업이 안될 수 있다.
 */

/* 테이블 이름 변경 */
CREATE TABLE TABLE_NAME(
       COLUMN1 NUMBER
);
ALTER TABLE TABLE_NAME RENAME TO TABLE_RENAME;
DROP TABLE TABLE_RENAME;


/* 컬럼명 변경 */
CREATE TABLE COLUMN_RENAME(
       ORIGIN NUMBER
);
ALTER TABLE COLUMN_RENAME RENAME COLUMN ORIGIN TO OTHER_NAME;
SELECT OTHER_NAME FROM COLUMN_RENAME;

DROP TABLE COLUMN_RENAME;

/* 컬럼 추가 */
CREATE TABLE ADD_COLUMN(
       COL1 NUMBER
);
ALTER TABLE ADD_COLUMN ADD COL2 VARCHAR2(10);
SELECT COL2 FROM ADD_COLUMN;

/* 테이블에 데이터가 있는 상태에서 추가 */
INSERT INTO ADD_COLUMN VALUES(1, 'A');
ALTER TABLE ADD_COLUMN ADD COL3 VARCHAR2(10);
SELECT COL3 FROM ADD_COLUMN;

DROP TABLE ADD_COLUMN;

/* 컬럼 타입 변경 */
CREATE TABLE CHANGE_TYPE(
       COL1 NUMBER
);
ALTER TABLE CHANGE_TYPE MODIFY COL1 VARCHAR2(10);
ALTER TABLE CHANGE_TYPE MODIFY COL1 DATE;

/* 테이블에 데이터가 있는 상태에서 변경 */
INSERT INTO CHANGE_TYPE VALUES(100);
ALTER TABLE CHANGE_TYPE MODIFY COL1 VARCHAR2(10);
ALTER TABLE CHANGE_TYPE MODIFY COL1 DATE;

DROP TABLE CHANGE_TYPE;

ALTER TABLE TEST5 DROP COLUMN COL4;
ALTER TABLE TEST5 DROP COLUMN COL5;


ALTER TABLE TEST3 ADD CONSTRAINT TEST3_COL1_PK PRIMARY KEY(COL1);
ALTER TABLE TEST3 ADD CONSTRAINT TEST3_COL2_UK UNIQUE(COL2);
ALTER TABLE TEST3 ADD CONSTRAINT TEST3_COL3_FK FOREIGN KEY(COL3) REFERENCES TEST5(ID);
ALTER TABLE TEST3 MODIFY COL4 CONSTRAINT TEST4_COL4_NN NOT NULL;
ALTER TABLE TEST3 MODIFY COL5 CONSTRAINT TEST3_COL5_CK CHECK(COL5 IN ('A', 'B'));

ALTER TABLE TEST3 RENAME CONSTRAINT TEST4_COL4_NN TO TEST3_COL4_NN;

ALTER TABLE TEST3 DROP CONSTRAINT TEST3_COL1_PK;
ALTER TABLE TEST3 DROP CONSTRAINT TEST3_COL2_UK DROP CONSTRAINT TEST3_COL3_FK;
ALTER TABLE TEST3 DROP CONSTRAINT TEST3_COL5_CK;

ALTER TABLE TEST3 MODIFY COL4 NULL;

SELECT * FROM USER_TABLES WHERE TABLE_NAME = 'TEST4';
SELECT * FROM USER_TAB_COLUMNS WHERE TABLE_NAME = 'TEST5';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'TEST3';




INSERT INTO TEST2 VALUES('A', 'Other1');
INSERT INTO TEST1 VALUES(1, 'A', 'A', SYSDATE);

DELETE FROM TEST2 WHERE REF1 = 'A';
DELETE FROM TEST1 WHERE COL2 = 'A';

SELECT * FROM TEST1;  SELECT * FROM TEST2;
SELECT * FROM USER_TABLES WHERE TABLE_NAME = 'TEST1';
SELECT * FROM USER_TAB_COLUMNS WHERE TABLE_NAME = 'TEST1';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'TEST1';

INSERT INTO TEST1 VALUES(NULL, 'C', 'B', NULL);

/*
INSERT INTO TEST1 VALUES('A', 'A', 'B', TO_DATE('20221114'));
INSERT INTO TEST1 VALUES(1, 'A', 'B', NULL);
INSERT INTO TEST1(COL1, COL3, COL5) VALUES(1, 'A', 'B');
INSERT INTO TEST1 VALUES(1, '한글다섯자', '한글다섯자', TO_DATE('20221114'));
INSERT INTO TEST1 VALUES(1, NULL, 'D', NULL);
*/
DROP TABLE TEST1;
DROP TABLE TEST2;
DROP TABLE TEST3;
