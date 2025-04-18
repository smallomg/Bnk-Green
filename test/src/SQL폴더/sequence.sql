--SEQUENCE
--자동으로 증가하는 숫자생성

DROP SEQUENCE seq_test;
CREATE SEQUENCE seq_test
START WITH 1    --처음 시작하는 숫자
INCREMENT BY 1  --증가시킬 숫자
--MINVALUE 1      --최소값
--MAXVALUE 10     --최대값
NOCYCLE           --최대값 도달 시 순환여부 NOCYCLE : 최대값에 초과 시 순환 X (에러)
NOCACHE;        --시퀀스번호 캐시할 지 여부

SELECT seq_test.NEXTVAL FROM dual;
--  CURRVAL : 시퀀스의 현재값 출력 ,NEXTVAL 호출 될때 마다 하나씩 출력
SELECT seq_test.CURRVAL FROM dual;

CREATE TABLE t2(
    tno NUMBER PRIMARY KEY,
    tname VARCHAR2(20)
);

INSERT INTO t2(tno,tname)VALUES(seq_test.NEXTVAL,'test3');
DELETE FROM t2;
SELECT *FROM t2;

CREATE TABLE t2_cpy
AS SELECT * FROM t2 WHERE tno = 1;
SELECT *FROM t2_cpy;

MERGE INTO t2_cpy
    USING t2
ON(t2.tno = t2_cpy.tno)
WHEN MATCHED THEN
    UPDATE SET t2_cpy.tname = t2.tname
WHEN NOT MATCHED THEN
    INSERT VALUES (t2.tno,t2.tname);
    
UPDATE t2 SET tname = 'xxx' WHERE tno = 2;

SELECT * FROM t2;

INSERT INTO t2 VALUES(seq_test.NEXTVAL,'test4');
commit;

--========================================================
DROP TABLE parent;
DROP TABLE child;
CREATE TABLE parent(
id NUMBER PRIMARY KEY,
name VARCHAR2(100)
);

CREATE TABLE child(
id NUMBER PRIMARY KEY,
parent_id NUMBER,
CONSTRAINT fk_parent FOREIGN KEY (parent_id)
REFERENCES parent(id)
ON DELETE CASCADE
--부모 테이블의 행이 삭제되면 자식 테이블의 행도 자동으로 삭제
);

INSERT INTO parent VALUES(1,1);
INSERT INTO child VALUES(1,1);

DELETE FROM parent WHERE id = 1;
DELETE FROM child WHERE id = 1;

SELECT * FROM parent;
SELECT * FROM child;