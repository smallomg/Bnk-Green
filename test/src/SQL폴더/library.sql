--Loaninfo
--도서관에 가면 책을 읽을수 있고 책을 빌릴수 있고 책을 살수 있다

-- 사용자 테이블
CREATE TABLE user(
u_num NUMBER(3) PRIMARY KEY, --사용자고유번호
u_name CHAR(3), -- 사용자 이름
u_phone NUMBER(4) -- 사용자 전화번호
);

--도서관리 테이블
CREATE TABLE library(
l_loannumber NUMBER(3)PRIMARY KEY, --대출번호
todaydate DATE, --오늘현재날짜
returndate DATE, --반납예정날짜
delinquentdate DATE, --연체날짜
FOREIGN KEY (b_code) REFERENCES book(b_code), 
FOREIGN KEY (u_num) REFERENCES user(u_num)
);

--책 테이블
CREATE TABLE book(
b_code NUMBER(3) PRIMARY KEY, --책 코드
b_title VARCHAR2(20), -- 책 제목
b_writer VARCHAR2(20), -- 책 저자
b_price NUMBER(7) --책 가격
);

INSERT INTO user
VALUES(001,'김철수',1234);
INSERT INTO user
VALUES(001,'이영희',5678);

INSERT INTO book
VALUES(001,'자바의 정석','남궁성',20000);
INSERT INTO book
VALUES(002,'이펙티브 자바','조슈아',15000);

INSERT INTO library(
VALUES(001,SYSDATE,SYSDATE+7,turndate));