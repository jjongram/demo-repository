/*
 * INDEX 객체
 *     - SQL 명령문 중 조회에 대한 처리 속도를 향상 시키기 위해서 사용
 *     - 조회 속도는 빨라지지만 INSERT, UPDATE, DELETE 작업이 자주 이루어
 *       지는 경우 해당 작업에 대한 성능 저하가 이루어 진다.
 *     - INDEX 객체를 위한 추가 저장 공간이 필요하다.
 * 
 * 고유(UNIQUE) 인덱스
 *     - PRIMARY KEY, UNIQUE 제약 조건을 생성하면 자동으로 설정 함
 *     - 중복값이 포함될 수 없다.
 * 
 * 비고유(NONUNIQUE) 인덱스
 *     - 빈번하게 사용되는 일반 컬럼을 대상으로 인덱스를 생성
 * 
 * 결합(COMPOSITE) 인덱스
 *     - 두 개 이상의 컬럼으로 구성한 인덱스
 * 
 * 함수 기반(FUNCTION BASED) 인덱스
 *     - 산술 계산식 또는 함수식이 사용된 경우
 */

/* 비고유 인덱스 */
CREATE INDEX 인덱스명 ON 테이블명(컬럼명);

/* 고유 인덱스 */
CREATE UNIQUE INDEX 인덱스명 ON 테이블명(컬럼명);

/* 결합 인덱스 */
CREATE INDEX 인덱스명 ON 테이블명(컬럼명1, 컬럼명2);

/* 함수 기반 인덱스 */
CREATE INDEX 인덱스명 ON 테이블명(계산식 또는 함수식);

/* 인덱스 제거 */
DROP INDEX 인덱스명

/*
 * 인덱스 재구성
 *     테이블의 Reocrd 를 삭제해도 색인 정보는 남아 있기 때문에 이를 정리하기 위해 사용한다.
 */
ALTER INDEX 인덱스명 REBUILD;

/* 인덱스 확인 */
SELECT * FROM USER_IND_COLUMNS WHERE TABLE_NAME = 'DEPARTMENTS';


CREATE INDEX DEPT_NAME_IX ON DEPARTMENTS(DEPARTMENT_NAME);

SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'IT';

DROP INDEX DEPT_NAME_IX;

SELECT * FROM USER_IND_COLUMNS WHERE TABLE_NAME = 'EMPLOYEES';

CREATE INDEX EMP_SALARY_IX ON EMPLOYEES(SALARY * 12);

SELECT * FROM EMPLOYEES WHERE (SALARY * 12) = 120000;
SELECT * FROM EMPLOYEES WHERE SALARY = 12000;

DROP INDEX EMP_SALARY_IX;




