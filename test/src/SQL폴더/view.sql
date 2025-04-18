--cmd 권한 부여
GRANT CREATE VIEW TO green;
--cmd 권한 취소
REVOKE CREATE VIEW FROM green;

--일반적인 view 생성
CREATE VIEW v_student
AS SELECT * FROM student;

-- view 삭제
DROP VIEW v_student;

-- view 조회
SELECT *FROM v_student;


SELECT student.*,enroll.*,subject.*
FROM student CROSS JOIN enroll,subject;


CREATE VIEW v_student AS
SELECT 
  s.stu_no,
  s.stu_name,
  e.sub_no,
  e.enr_grade,
  sj.sub_name
FROM student s
JOIN enroll e ON s.stu_no = e.stu_no
JOIN subject sj ON e.sub_no = sj.sub_no;


SELECT * FROM v_student WHERE enr_grade >= 60;
DESC student1;

INSERT INTO student1 VALUES(20250417,'홍길동','기계','1','c','M',190,90);
SAVEPOINT sp1;

INSERT INTO student1 VALUES(20250418,'임꺽정','기계','1','c','M',160,90);
SAVEPOINT sp2;

INSERT INTO student1 VALUES(20250419,'James','기계','2','c','M',170,80);


ROLLBACK TO sp2;

