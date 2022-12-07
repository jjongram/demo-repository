/*
 * 웹 사이트에 사용할 회원 관리용 테이블을 생성하고 다음의 요구사항에 적합한 SQL 문과 ORACLE 객체를 생성한다.
 *     - 일반 사용자는 웹사이트 이용을 위해 회원 가입을 진행해야 한다.
 *     - 회원 가입은 즉시 이루어 지지 않으며, 관리자의 승낙을 통해서만 이루어져야 한다.
 *     - 회원 가입에 필요한 정보는 닉네임과 이메일만 있으면 된다.(관리를 위해서 추가 정보가 필요하지만 사용자가
 *       입력하는 정보는 닉네임과 이메일 뿐이다.)
 *     - 회원 가입을 요청한 사용자는 관리자의 승낙 이후 전달되는 메일 메시지 안의 암호를 통해 로그인을 할 수 있다.
 *     - 최초 로그인을 시도하는 회원은 필수적으로 암호를 변경해야 하며, 암호를 변경할 때는 회원이 사용할 암호만
 *       있으면 된다.
 * 
 * 테이블은 총 3개의 테이블을 생성하도록 한다.
 *     - 회원 테이블 : 회원으로 가입된 사용자의 정보가 기록되는 테이블
 *     - 회원 요청 테이블 : 회원 가입을 위해 가입 요청 정보가 기록되는 테이블
 *     - 접속 이력 테이블 : 로그인 및 로그아웃한 회원의 접속 시간을 기록하기 위한 테이블
 */
CREATE TABLE REQ_ACCOUNTS(
       ID NUMBER PRIMARY KEY
     , NICKNAME VARCHAR2(35) UNIQUE
     , EMAIL VARCHAR2(100) UNIQUE
     , ISALLOW CHAR(1) DEFAULT('N') CHECK (ISALLOW IN ('N', 'Y'))
     , REQDATE DATE DEFAULT(SYSDATE)
);
CREATE SEQUENCE SEQ_REQ_ACCOUNTS NOCACHE;

CREATE TABLE ACCOUNTS(
       ID NUMBER PRIMARY KEY
     , NICKNAME VARCHAR2(35) UNIQUE
     , EMAIL VARCHAR2(100) UNIQUE
     , PASSWORD VARCHAR2(100) NOT NULL
     , LOGINDATE DATE NOT NULL
);

CREATE SEQUENCE SEQ_ACCOUNTS NOCACHE;

CREATE TABLE ACCOUNTS_ACCESS_LOG(
       ID NUMBER PRIMARY KEY
     , AID NUMBER REFERENCES ACCOUNTS(ID)
     , LOGTYPE VARCHAR2(8) CHECK (LOGTYPE IN ('LOGIN', 'LOGOUT'))
     , LOGDATE DATE DEFAULT(SYSDATE)
);

CREATE SEQUENCE SEQ_ACCOUNTS_ACCESS_LOG NOCACHE;


/*
 * 회원 가입을 위한 요청 SQL 구문
 */
INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL)
       VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'hyun', 'abhyuni@gmail.com');
INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL)
       VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'kim', 'kim@gmail.com');
INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL)
       VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'lee', 'lee@gmail.com');
INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL)
       VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'park', 'park@gmail.com');
INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL)
       VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'tester2', 'test2@gmail.com');
SELECT * FROM REQ_ACCOUNTS;

/*
 * 회원 가입 요청을 승낙하기 위한 SQL 구문
 */
UPDATE REQ_ACCOUNTS
   SET ISALLOW = 'Y'
 WHERE ID = 2
   AND ISALLOW = 'N';

UPDATE REQ_ACCOUNTS
   SET ISALLOW = 'Y'
 WHERE ID IN (1, 3)
   AND ISALLOW = 'N';

UPDATE REQ_ACCOUNTS
   SET ISALLOW = 'Y'
 WHERE REQDATE BETWEEN TO_DATE('20221128') AND TO_DATE('20221201')
   AND ISALLOW = 'N';
  
/*
 * 가입 요청 처리가 안된 사용자 조회
 */
SELECT ID
     , NICKNAME
     , EMAIL
     , ISALLOW
     , REQDATE
  FROM REQ_ACCOUNTS
 WHERE ISALLOW = 'N';

SELECT ID
     , NICKNAME
     , EMAIL
     , ISALLOW
     , REQDATE
  FROM REQ_ACCOUNTS
 WHERE ISALLOW = 'N'
   AND REQDATE BETWEEN TO_DATE('20221101') AND TO_DATE('20221201');

/*
 * 요청이 승낙된 회원을 회원 테이블에 추가하기 위한 SQL 구문
 */
INSERT INTO ACCOUNTS(
    SELECT SEQ_ACCOUNTS.NEXTVAL
         , RA.NICKNAME
         , RA.EMAIL
         , 'temppassword'
         , SYSDATE
      FROM REQ_ACCOUNTS RA
      LEFT OUTER JOIN ACCOUNTS A
        ON RA.NICKNAME = A.NICKNAME
       AND RA.EMAIL = A.EMAIL
     WHERE RA.ISALLOW = 'Y'
       AND A.ID IS NULL
);

/*
 * 회원이 로그인 요청을 할 때 닉네임과 암호를 확인 하기 위한 조회
 */
SELECT ID
     , NICKNAME
     , EMAIL
     , LOGINDATE
  FROM ACCOUNTS
 WHERE NICKNAME = 'lee'
   AND PASSWORD = 'temppassword';

/*
 * 회원 확인 후 최근 로그인 시간 기록(LOG 테이블 포함)
 */
UPDATE ACCOUNTS
   SET LOGINDATE = SYSDATE
 WHERE NICKNAME = 'lee'
   AND PASSWORD = 'temppassword';
  
INSERT INTO ACCOUNTS_ACCESS_LOG
     VALUES(SEQ_ACCOUNTS_ACCESS_LOG.NEXTVAL
          , (SELECT ID
               FROM ACCOUNTS
              WHERE NICKNAME = 'lee'
                AND PASSWORD = 'temppassword')
          , 'LOGIN'
          , (SELECT LOGINDATE
               FROM ACCOUNTS
              WHERE NICKNAME = 'lee'
                AND PASSWORD = 'temppassword')
     );
    
    
SELECT * FROM ACCOUNTS WHERE NICKNAME = 'lee';
SELECT * FROM ACCOUNTS_ACCESS_LOG WHERE AID = (SELECT ID FROM ACCOUNTS WHERE NICKNAME = 'lee');

/*
 * 로그아웃 할 때 LOG 테이블에 기록
 */
INSERT INTO ACCOUNTS_ACCESS_LOG VALUES(SEQ_ACCOUNTS_ACCESS_LOG.NEXTVAL, 10, 'LOGOUT', SYSDATE);

/*
 * 회원이 암호 변경 요청을 했을 때 암호를 변경하기 위한 수정 구문
 */
UPDATE ACCOUNTS
   SET PASSWORD = 'passchange'
 WHERE NICKNAME = 'lee'
   AND PASSWORD = 'temppassword';

/*
 * 회원이 암호를 변경할 때 현재 사용했던 암호가 새로운 암호에 포함되지 않게 하기 위해서
 * 이전 암호가 새로운 암호에 포함되어있으면 조회가 되게 한다.
 */
SELECT *
  FROM ACCOUNTS A1
  JOIN (SELECT ID, NICKNAME, EMAIL, 'passchange1234' AS CPASSWORD
          FROM ACCOUNTS
         WHERE NICKNAME = 'lee'
           AND PASSWORD = 'passchange') A2
    ON A1.ID = A2.ID
 WHERE A1.NICKNAME = 'lee'
   AND A2.CPASSWORD LIKE '%' || A1.PASSWORD || '%';


/*
 * 로그인을 한 회원의 정보를 조회 할 때 몇 분 또는 몇 시간, 일, 개월, 년 만에
 * 접속을 했는지 포함하여 조회
 */

/* 현재 시간으로 부터 2022년 12월 01일 00시 00분 00초 는 몇 시간, 몇 분, 몇 초 전인가. */
SELECT 시간
     , 분 - (시간 * 60) AS 분
     , 초 - (분 * 60) AS 초
  FROM (SELECT FLOOR((SYSDATE - TO_DATE('20221201')) * 24) AS 시간
             , FLOOR((SYSDATE - TO_DATE('20221201')) * 24 * 60) AS 분
             , FLOOR((SYSDATE - TO_DATE('20221201')) * 24 * 60 * 60) AS 초
          FROM DUAL);

/*
 * 회원 가입 요청을 승낙 -> 회원 테이블에 회원으로 등록
 */
CREATE OR REPLACE PROCEDURE PROC_ALLOW_ACCOUNT(
       IN_ID IN NUMBER
     , OUT_ID OUT NUMBER
)
IS
    VAR_NICKNAME VARCHAR2(35);
    VAR_EMAIL VARCHAR2(100);
BEGIN
    SELECT NICKNAME, EMAIL
      INTO VAR_NICKNAME, VAR_EMAIL
      FROM REQ_ACCOUNTS
     WHERE ISALLOW = 'N'
       AND ID = IN_ID;
    
    UPDATE REQ_ACCOUNTS
       SET ISALLOW = 'Y'
     WHERE ID = IN_ID;
    
    INSERT INTO ACCOUNTS VALUES(SEQ_ACCOUNTS.NEXTVAL, VAR_NICKNAME, VAR_EMAIL, 'temppassword', SYSDATE);
   
    OUT_ID := SEQ_ACCOUNTS.CURRVAL;
   
    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        OUT_ID := -1;
        DBMS_OUTPUT.PUT_LINE('회원으로 승낙할 데이터가 없습니다.');
        ROLLBACK;
END;

DECLARE
    ACCOUNT_ID NUMBER;
BEGIN
	INSERT INTO REQ_ACCOUNTS(ID, NICKNAME, EMAIL) VALUES(SEQ_REQ_ACCOUNTS.NEXTVAL, 'tester1', 'tester1@gmail.com');
    PROC_ALLOW_ACCOUNT(SEQ_REQ_ACCOUNTS.CURRVAL, ACCOUNT_ID);
    DBMS_OUTPUT.PUT_LINE(ACCOUNT_ID);
END;

/*
 * 로그인 시도 -> 계정 정보 확인 -> 있음 -> 로그인 시간 기록(ACCOUNTS, ACCOUNTS_ACCESS_LOG)
 *                                  없음 -> 로그인 시간 기록 안함.
 */
CREATE OR REPLACE PROCEDURE PROC_LOGIN_ACCOUNT(
       IN_NICKNAME IN  VARCHAR2
     , IN_PASSWORD IN  VARCHAR2
     , OUT_RESULT  OUT NUMBER
)
IS
    VAR_ID NUMBER;
    VAR_LOGDATE DATE := SYSDATE;
BEGIN
    SELECT ID
      INTO VAR_ID
      FROM ACCOUNTS
     WHERE NICKNAME = IN_NICKNAME
       AND PASSWORD = IN_PASSWORD;
      
    UPDATE ACCOUNTS
       SET LOGINDATE = VAR_LOGDATE
     WHERE ID = VAR_ID;
    
    INSERT INTO ACCOUNTS_ACCESS_LOG VALUES(SEQ_ACCOUNTS_ACCESS_LOG.NEXTVAL, VAR_ID, 'LOGIN', VAR_LOGDATE);
   
    OUT_RESULT := VAR_ID;
   
    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        OUT_RESULT := -1;
        DBMS_OUTPUT.PUT_LINE('닉네임 또는 암호가 잘못되었습니다.');
        ROLLBACK;
END;

DECLARE
    ACCOUNT_ID NUMBER;
BEGIN
    PROC_LOGIN_ACCOUNT('tester1', 'temppassword', ACCOUNT_ID);
    DBMS_OUTPUT.PUT_LINE(ACCOUNT_ID);
END;











