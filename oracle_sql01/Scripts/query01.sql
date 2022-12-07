-- 한 줄 주석, 한 줄 주석 작성할 때 쿼리문 옆에 작성하지 마세요.
-- 쿼리문 윗줄 또는 아랫줄에 작성하세요.

/*
 * 블럭 주석
 */

-- SELECT Query 문장 예시.
-- SQL 문장은 반드시 세미콜론으로 끝내야 합니다.
SELECT 'Hello World' FROM DUAL;



/*
 * SYS 나 SYSTEM과 같은 관리자 계정이 아닌 일반 계정을 생성하여
 * Oracle 데이터베이스를 사용하기
 */

-- 계정 및 암호 생성
-- CREATE USER 계정명 IDENTIFIED BY 계정암호;
CREATE USER dev01 IDENTIFIED BY dev01;

-- 계정에 대한 권한(역할) 부여
-- GRANT 역할명1, 역할명2, ... TO 계정명;
GRANT RESOURCE, CONNECT
    , INSERT ANY TABLE, UPDATE ANY TABLE
    , DELETE ANY TABLE, CREATE VIEW
    , CREATE SESSION TO dev01;
   



-- 계정에 테이블 스페이스(임시 저장 공간) 할당
ALTER USER dev01 quota 10M ON USERS;

-- 계정 확인(주의: WHERE 절에 사용하는 계정명은 반드시 대문자로)
SELECT USERNAME FROM ALL_USERS WHERE USERNAME = 'DEV01';

-- 패스워드 변경
ALTER USER dev01 IDENTIFIED BY dev01;

-- 계정 삭제
DROP USER dev02 CASCADE;


