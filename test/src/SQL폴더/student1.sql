--1,2학년 학생정보로 student1테이블을 생성하시오.
--subject 테이블을 바탕으로 subject1 테이블을 생성하시오
--enroll 테이블을 바탕으로 enroll1테이블을 생성하이오
CREATE TABLE student1(
STU_NO CHAR(9)PRIMARY KEY,
STU_NAME VARCHAR2(30),
STU_DEPT VARCHAR2(20),
STU_GRADE NUMBER(1),
STU_CLASS CHAR(1),
STU_GENDER CHAR(1),
STU_HEIGHT NUMBER(5,2),
STU_WEIGHT NUMBER(5,2)
);
insert into student1 values(20153075, '옥한빛', '기계', 1, 'C', 'M', 177, 88);
insert into student1 values(20153088, '이태연', '기계', 1, 'C', 'F', 162, 50);
insert into student1 values(20143054, '유가인', '기계', 2, 'C', 'F', 154, 47);
insert into student1 values(20152088, '조민우', '전기공학', 1, 'C', 'M', 188, 50);
insert into student1 values(20142021, '심수겸', '전기공학', 2, 'A', 'F', 168, 45);
insert into student1 values(20132003, '백희철', '전기공학', 3, 'B', 'M', NULL, 63);
insert into student1 values(20151062, '김연중', '컴퓨터정보', 1, 'B', 'M', 164, 67);
insert into student1 values(20141007, '진형우', '컴퓨터정보', 2, 'A', 'M', 174, 64);
insert into student1 values(20131001, '김종현', '컴퓨터정보', 3, 'C', 'M', NULL, 72);
insert into student1 values(20131025, '육성우', '컴퓨터정보', 3, 'A', 'F', 172, 63);


DELETE student1
WHERE stu_grade = 3;

CREATE TABLE subject1(
SUB_NO CHAR(3)PRIMARY KEY,
SUB_NAME VARCHAR2(30),
SUB_PROF VARCHAR2(20),
SUB_GRADE NUMBER(1),
SUB_DEPT VARCHAR(20)
);
insert into subject1 values('111', '데이터베이스', '이재영', 1, '컴퓨터정보');
insert into subject1 values('110', '자동제어', '정순정', 2, '전기전자');
insert into subject1 values('109', '자동화설계', '백민영', 3, '기계');
insert into subject1 values('101', '컴퓨터개론', '김종연', 3, '컴퓨터정보');
insert into subject1 values('102', '기계공작법', '김대영', 1, '기계');
insert into subject1 values('103', '기초전자실험', '김유석', 1, '전기전지');
insert into subject1 values('104', '시스템분석설계', '강석현', 3, '컴퓨터정보');
insert into subject1 values('105', '기계요소설계', '김명성', 1, '기계');
insert into subject1 values('106', '전자회로설계', '최영민', 3, '전기전자');
insert into subject1 values('107', 'CAD응용실습', '구봉규', 2, '기계');
insert into subject1 values('108', '소프트웨어공학', '권민성', 1, '컴퓨터정보');


CREATE TABLE enroll1(
SUB_NO CHAR(3),
STU_NO CHAR(9),
ENR_GRADE NUMBER(3),
CONSTRAINT p_course1 PRIMARY KEY(SUB_NO,STU_NO)
);
insert into enroll1 values('111', '20131001', 80);
insert into enroll1 values('104', '20131001', 56);
insert into enroll1 values('106', '20132003', 72);
insert into enroll1 values('103', '20152088', 45);
insert into enroll1 values('101', '20131025', 65);
insert into enroll1 values('104', '20131025', 65);
insert into enroll1 values('108', '20151062', 81);
insert into enroll1 values('107', '20143054', 41);
insert into enroll1 values('102', '20153075', 66);
insert into enroll1 values('105', '20153075', 56);
insert into enroll1 values('102', '20153088', 61);
insert into enroll1 values('105', '20153088', 78);

-- 1.학번 20101059, 이름 조병준, 학과 컴퓨터정보, 학년 1, 반 B, 키 164, 몸무게 70인 남학생이 추가되었다
INSERT INTO student1
VALUES (20101059,'조병준','컴퓨터정보','1','B','M',164,70);
-- 2.학번 20102038, 이름 남지선, 학과 전기전자, 학년1, 반 C,여학생이 추가되었다
INSERT INTO student1
VALUES (20102038,'남지선','전기전자','1','C','F',NULL,NULL);
--3. 학번 20103009, 이름 박소신, 학과 기계, 20150375 학생솨 같은 같은 학년 반을 갖는 남학생이 추가되었다
INSERT INTO student1 (
  STU_NO, STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS, STU_GENDER,
  STU_HEIGHT, STU_WEIGHT
)
SELECT 
  '20103009',      -- 학번
  '박소신',         -- 이름
  '기계',           -- 학과
  STU_GRADE,        -- 기존 학생의 학년
  STU_CLASS,        -- 기존 학생의 반
  'M',              -- 남학생
  NULL, NULL        -- 키/몸무게는 생략
FROM student1
WHERE STU_NO = '20150375';
--4 student1 테이블에 학생테이블의 3학년들 데이터를 입력하시오
INSERT INTO student1 VALUES(20132003, '김핑크','컴퓨터정보','3','C','M',180,80);
INSERT INTO student1 VALUES(20131001, '김블랙','컴퓨터정보','3','A','F',172,60);
INSERT INTO student1 VALUES(20151062, '김레드','전자기계','3','B','M',117,60);
--5. 학번 20071001의반을 B로 바꾸시오
UPDATE student1
SET stu_class = 'B'
WHERE stu_no = 20071001;
--6 20072088학생의 키가 2cm 자랐다
UPDATE student1
SET stu_height = stu_height+2
WHERE stu_no = 20072088;
--7 모든 학생의 학년이 올랐다.
UPDATE student1
SET stu_grade = stu_grade+1;
--8 20142021의 학생의 학과를 컴퓨터 정보로 바꾸시오
UPDATE student1
SET stu_dept = '컴퓨터정보'
WHERE stu_no = 20142021;
--(단 학번은 입학년도+학과코드+일련번호,학과코드1:컴퓨터정보,2:전기전자,3:기계)
--9 전자회로실험 과목점수를 1점 감하시오
UPDATE enroll1
SET enr_grade = enr_grade-1
WHERE sub_no IN(
SELECT sub_no 
FROM suject1 s
WHERE s.sub_name = '전자회로실험'
);
--10 2015062학생이 소프트웨어공학 시험중 부정행위로 0점이 되었다
--11 20153088 학생이 자퇴하였다
--12 과목번호 112 과목이름 자동화시스템 교수명 고종민 학년 3 학과 기계 추가하시오
--13 과목번호 110에서 501로 변경되었다
--14 과목번호 101이 폐강되었다
--15 ernoll1 테이블에서 subject1에 없는 과목번호를 999로 변경하시오
--16 enroll1테이블에서 student1에 없는 학번을 99999999로 변경하시오
--17 enroll1 테이블에서 과목번호 999를 삭제하시오
--18 enroll1 테이블에서 학번 99999999를 삭제하시오
--19 enroll1 테이블에 없는 과목을 삭제하시오

--20 enroll1 테이블의 전체 테이블를 삭제하시오
DELETE FROM enroll1;
