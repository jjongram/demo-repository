/*
 * PROCEDURE 객체
 *     - PL/SQL 구문을 사용하여 만든 객체
 *     - 함수와 비슷하게 프로시져를 호출(EXEC 명령어 사용)하여 언제든 사용할 수 있다.
 *     - 함수처럼 프로시져 내부에 값을 전달하거나 외부로 값을 내보낼 수 있다.
 *       (값을 내보낼 때의 작업은 반환 작업이 아니다.)
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE1
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('프로시져 실행!!!');
END;

BEGIN
    PROC_SAMPLE1;
END;


/*
 * 프로시져에서 사용할 변수 정의
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE2
IS
    VAR NUMBER := 0;
BEGIN
    DBMS_OUTPUT.PUT_LINE('프로시져 실행!!!' || VAR);
END;

BEGIN
    PROC_SAMPLE2;
END;


/*
 * 프로시져 내부로 값 전달하기
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE3(X IN NUMBER, Y IN VARCHAR2)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('외부에서 전달 받은 X=' || X);
    DBMS_OUTPUT.PUT_LINE('외부에서 전달 받은 Y=' || Y);
END;

BEGIN
    PROC_SAMPLE3(10, '문자열');
END;


/*
 * 프로시져 외부로 값 내보내기
 */
CREATE OR REPLACE PROCEDURE PROC_SAMPLE4(X OUT NUMBER)
IS
BEGIN
    X := 10;
    DBMS_OUTPUT.PUT_LINE('내보낼 값을 설정하였습니다.');
END;

DECLARE
    Y NUMBER;
BEGIN
    PROC_SAMPLE4(Y);
    DBMS_OUTPUT.PUT_LINE(Y || ' 값을 받았습니다.');
END;


CREATE OR REPLACE PROCEDURE PROC_SAMPLE5(NUM1 IN NUMBER, NUM2 IN NUMBER, RES OUT NUMBER)
IS
BEGIN
    RES := NUM1 + NUM2;
    DBMS_OUTPUT.PUT_LINE('더하기 계산이 완료되었습니다.');
END;

DECLARE
    Y NUMBER;
BEGIN
    PROC_SAMPLE5(10, 20, Y);
    DBMS_OUTPUT.PUT_LINE(Y);
END;

SELECT * FROM USER_ERRORS;

