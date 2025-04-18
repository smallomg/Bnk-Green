CREATE TABLE tbl_member(
id VARCHAR2(20) PRIMARY KEY,
pw VARCHAR2(10),
name VARCHAR2(50),
phone VARCHAR2(13),
grade CHAR(1)
);

CREATE TABLE tbl_board(
bno NUMBER(3) PRIMARY KEY,
writer VARCHAR2(20),
title VARCHAR2(100),
content VARCHAR2(1000),
regdate DATE,
CONSTRAINT fk_writer 
    FOREIGN KEY (writer)
    REFERENCES tbl_member(id)
);

DESC tbl_member;
DESC tbl_board;

INSERT INTO tbl_member
VALUES ('aaa','bbb','첫번째','010-1234-5678','A');
INSERT INTO tbl_member
VALUES ('ccc','ddd','두번째','010-1234-5678','B');

INSERT INTO tbl_board
VALUES (20,'aaa','db입력값','db에 직접 입력한 값입니다',TO_DATE('10-04-2025', 'dd-mm-yyyy'));

SELECT * FROM tbl_member;
SELECT * FROM tbl_board;

commit;