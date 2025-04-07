SQL
==============
테이블의 구조(스키마)를 확인하는 명령어
DESC 테이블명;
영어와 한글의 바이트 크기가 다르다.
NCHAR 바이트 X 글자 수 O


### 계정
SQLPLUS / AS SYSDBA
오라클 데이터베이스에 SYSDBA 권한으로 접속하는 명령어

SHOW USER;
현재 접속한 사용자를 확인하는 명령어

conn scott(사용자계정) / tiger(비밀번호)
사용자가 비밀번호를 사용하여 오라클 DB에 로그인하는 명령어

conn sys as sysdba
최고 관리자(sys)가 sysdba권한을 사용하여 오라클 데이터베이스에 로그인하는 명령어

CREATE USER grenn IDENTIFIED BY 1234;
새로운 사용자(green)를 비밀번호(1234)와 함께 생성하는 SQL 명령어
IDENTIFIED : 해당 사용자의 비밀번호 설정

GRANT CONNECT, RESOURCE TO green;
green(사용자)에게 데이터베이스 접근 및 자원(테이블 생성 등) 사용 권한을 부여하는 명령어
GRANT	: 특정 사용자에게 권한을 부여
CONNECT	: 데이터베이스에 접속할 수 있는 권한
RESOURCE : 테이블, 시퀀스 등을 생성할 수 있는 권한
TO green	: green(사용자)에게 해당 권한을 부여

ALTER USER green QUOTA 100M ON USERS;
green(사용자)에게 USERS테이블스페이스에서 최대 100MB까지 저장할수 있도록 할당하는 명령어
ALTER USER green : green 사용자의 속성을 변경
QUOTA 100M : green 사용자가 사용할 수 있는 최대 공간을 100MB로 설정
ON USERS : USERS 테이블스페이스에서 할당
테이블스페이스 : 오라클에서 데이터를 저장하는 논리적인 저장 공간


## DDL 데이터 정의

### 테이블 생성
CREATE TABLE 테이블명(컬럼 자료형());

### 테이블 삭제
DROP TABLE 테이블명;

### 테이블 수정
ALTER TABLE 테이블명 
[수정할 작업];
컬럼 추가
ALTER TABLE 테이블명
ADD (컬럼명 자료형(값));
컬럼 자료형 변경
ALTER TABLE 테이블명
MODIFY (컬럼명 자료형(변경값));
컬럼 삭제
ALTER TABLE 테이블명
DROP COLUMN 컬럼명;

## DML 데이터 조작
### 데이터 삽입
INSERT INTO 테이블명 (컬럼1, 컬럼2, ...)
VALUES (컬럼1의값1, 컬럼2의값2, ...);

### 데이터 조회
*테이블 명의 안에 있는 값들 조회
SELECT *FROM 테이블명;
*테이블 명의 안에 있는 컬럼만 조회
SELECT 컬럼 FROM 테이블명;

### 데이터 수정
*특정 컬럼 값 변경
UPDATE 테이블명
SET 컬럼명 = 변경할값, 컬럼명 = 변경할값
WHERE 조건;
*모든 컬럼 값 변경
UPDATE 테이블명
SET 컬럼명 = 변경할값;

### 데이터 삭제
*특정 컬럼 삭제
DELETE FROM 테이블명
WHERE 조건;
*모든 컬럼 삭제
DELETE FROM 테이블명;





