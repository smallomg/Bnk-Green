-- 학생 과목 관계 어떤 관계 학생이 과목을 수강한다 한명의 학생은 여러개의 과목을 수강할 수 있다
-- 다수의 학생이 하나의 과목을 수강할수 있다
-- 다대다 관계는 쓰지 않는다
-- 수강 테이블에는 학생을 식별할수 있어야 한다

DROP TABLE STUDENT;

CREATE TABLE student(
STU_NO CHAR(9),
STU_NAME VARCHAR2(30),
STU_DEPT VARCHAR2(20),
STU_GRADE NUMBER(1),
STU_CLASS CHAR(1),
STU_GENDER CHAR(1),
STU_HEIGHT NUMBER(5,2),
STU_WEIGHT NUMBER(5,2),
CONSTRAINT p_stu_no PRIMARY KEY(stu_no)
);

DROP TABLE SUBJECT;
CREATE TABLE subject(
SUB_NO CHAR(3),
SUM_NAME VARCHAR2(30),
SUB_PROF VARCHAR2(20),
SUB_GRADE NUMBER(1),
SUB_DEPT VARCHAR(20),
CONSTRAINT p_sub_no PRIMARY KEY(SUB_NO)
);

DROP TABLE ENROLL;
CREATE TABLE enroll(
SUB_NO CHAR(3),
STU_NO CHAR(9),
ENR_GRADE NUMBER(3),
CONSTRAINT p_course PRIMARY KEY(SUB_NO,STU_NO)
);


INSERT INTO student VALUES(20150375, '옥한빛','기계','1','C','M',117,60);
INSERT INTO student VALUES(20153000, '유동적','기계','1','C','F',167,50);
INSERT INTO student VALUES(20152088, '조한우','기계','2','C','F',157,47);
INSERT INTO student VALUES(20153075, '말미잘','전자기계','1','C','HM',186,78);
INSERT INTO student VALUES(20143054, '킹크랩','전자기계','2','A','F',168,45);
INSERT INTO student VALUES(20151062, '김레드','전자기계','3','B','M',117,60);
INSERT INTO student VALUES(20131025, '김블루','컴퓨터정보','1','B','M',190,111);
INSERT INTO student VALUES(20152088, '김그린','컴퓨터정보','2','A','M',190,90);
INSERT INTO student VALUES(20132003, '김핑크','컴퓨터정보','3','C','M',180,80);
INSERT INTO student VALUES(20131001, '김블랙','컴퓨터정보','3','A','F',172,60);

INSERT INTO subject VALUES('111','데이터베이스','이재영',2,'컴퓨터정보');
INSERT INTO subject VALUES('110','자동제어','정순정',2,'전기전자');
INSERT INTO subject VALUES('109','자동화설계','박민영',3,'기계');
INSERT INTO subject VALUES('101','컴퓨터개론','김종영',3,'컴퓨터정보');
INSERT INTO subject VALUES('102','기계동작법','김태영',1,'기계');
INSERT INTO subject VALUES('103','기초전자실험','김유석',1,'전기전자');
INSERT INTO subject VALUES('104','시스템분석설계','김석현',3,'컴퓨터정보');
INSERT INTO subject VALUES('105','데이터베이스','최영민',3,'기계');
INSERT INTO subject VALUES('106','데이터베이스','박민규',2,'전기전자');
INSERT INTO subject VALUES('107','자동화설계','이효율',1,'컴퓨터정보');
INSERT INTO subject VALUES('108','컴퓨터개론','기승전',2,'기계');


INSERT INTO enroll VALUES('101','20131001',451);
INSERT INTO enroll VALUES('104','20131001',123);
INSERT INTO enroll VALUES('106','20132003',456);
INSERT INTO enroll VALUES('101','20152088',789);
INSERT INTO enroll VALUES('103','20131025',159);
INSERT INTO enroll VALUES('104','20131025',357);
INSERT INTO enroll VALUES('108','20151062',753);
INSERT INTO enroll VALUES('107','20143054',951);
INSERT INTO enroll VALUES('105','20153075',147);
INSERT INTO enroll VALUES('109','20153075',258);
INSERT INTO enroll VALUES('110','20153088',369);
INSERT INTO enroll VALUES('111','20153088',852);


/*학생테이블의 구조를 확인하시오.*/
DESC student;

/*과목테이블의 구조를 확인하이오*/
DESC subject;

/*수강테이블의 구조를 확인하이오*/
DESC enroll;

/*학생테이블의 학번과 이름을 조회하시오*/
SELECT STU_NO,STU_NAME FROM student;

/*학생테이블에서 학과를 중복데이터 없이 조회하시오.*/
SELECT DISTINCT STU_DEPT FROM student;

/*학생테이블에서 학년과 반을 중복 없이 조회하시오*/
SELECT DISTINCT STU_NO,STU_CLASS FROM student;

/*수강테이블에서 학번, 과목번호, 점수, 기존 점수에 10을 더한 점수를 조회하시오*/
SELECT SUB_NO,STU_NO,ENR_GRADE,ENR_GRADE+10 FROM enroll;

/*수강테이블에서 학번, 과목번호, 점수, 기존 점수에 10을 더한 점수를 조회하시오
  이때, 이존 점수에 10을 더한 점수의 열 제목은 plus10으로 하시오*/
SELECT SUB_NO,STU_NO,ENR_GRADE,ENR_GRADE+10 as plus10 FROM enroll;

/*연결연산자 사용 : 두 개 이상의 열을 합쳐서 조회할 수 있음*/
SELECT stu_dept || stu_name as 학과성명 FROM student;
SELECT stu_dept|| ',' || stu_name ||'입니다'as 학과성명 FROM student;

/*WHERE 절 사용하기*/
/* 학과가 '컴퓨터정보'만 학생의 이름, 학과, 학년, 반 정보를 조회하시오*/
SELECT stu_name, stu_dept,stu_grade,stu_class from student
WHERE stu_dept = '컴퓨터정보';

/*학과가 '컴퓨터정보'가 아닌 학생의 이름, 학과, 학년, 반 정보를 조회하시오*/
SELECT stu_name,stu_dept,stu_grade,stu_class from student
WHERE stu_dept ^= '컴퓨터정보';
--WHERE stu_dept != '컴퓨터정보';
--WHERE stu_dept <> '컴퓨터정보';

/*학과가 '컴퓨터정보'이고 2학년인 학생의 모든 정보를 조회하시오*/
SELECT *FROM student
WHERE stu_dept = '컴퓨터정보' AND stu_grade = 2;

/*1학년 2학년 학생의 모든 정보를 조회하시오*/
SELECT *FROM student
WHERE stu_grade =1 OR stu_grade =2;

/*체중이 60이상 70이하인 학생의 이름과 학과 학년을 조회하시오*/
SELECT stu_name,stu_dept,stu_grade FROM student
WHERE stu_weight >=60 AND stu_weight <= 70;

SELECT stu_name,stu_dept,stu_grade FROM student
WHERE stu_weight BETWEEN 50 AND 72; --이상 이하 값들을 포함시킨다!

/*키가 180이상인 학생의 이름과 학과,학년을 조회하시오*/
SELECT stu_name,stu_dept,stu_grade FROM student
WHERE stu_height >= 180;

/*키가 170이상인 학생의 수를 조회하시오*/
SELECT COUNT(stu_no) FROM student
WHERE stu_height >= 170;

/*LIKE 이용한 검색*/
-- LIKE와 함께 쓰이는 기호 %(와일드카드) ,_(언더바)
-- % : 0개의 문자
-- _ : 1개의 문자

--학생 중에 김씨인 학생들의 정보를 검색하시오.
SELECT *FROM student
WHERE stu_name LIKE '김%';

--학생 중 이름의 두번째 글자가 '수'안 학생들을 검색하시오
SELECT *FROM student
WHERE stu_name LIKE '_수%';

--학생 중 이름이 '우'로 끝나는 학생의 수가 몇 명인지 검색하시오
SELECT COUNT(stu_no)FROM student
WHERE stu_name LIKE '%우';

-- 학번이 2014학번인 학생의 정보를 조회하시오
SELECT *FROM student
WHERE stu_no LIKE '2014%';

/*NULL 확인*/
SELECT stu_no,stu_name,stu_height FROM student;

-- 학생 정보중 키 값이 없는 학생의 학번 이름 키를 조회하시오.
SELECT stu_no,stu_name,stu_height FROM student
WHERE stu_height IS NULL;
SELECT stu_no,stu_name,stu_height FROM student
WHERE stu_height IS NOT NULL;

--학과가 '컴퓨터정보'이거나 '기계'과인 학생의 학번, 이름 학과를 검색하시오
SELECT stu_no,stu_name,stu_dept FROM student
WHERE stu_dept IN ('컴퓨터정보','기계');

/*정렬하기(오름차순/내림차순)*/
-- 오름차순 : ASC(기본)
SELECT *FROM student
ORDER BY stu_no ASC;
-- 내림차순 : DESC
SELECT *FROM student
ORDER BY stu_no DESC;

SELECT stu_no, stu_name, stu_dept,stu_weight-5 AS target FROM student
ORDER BY target;

SELECT stu_no,stu_name,stu_dept,stu_weight AS target FROM student
ORDER BY stu_dept,target DESC;


--======================================================================
--남학생의 이름, 학과 , 학년을 조회하시오
SELECT stu_name,stu_dept,stu_grade FROM student
WHERE stu_gender = 'M';

--학생들의 이름과 현제 체중,그리고 현제 체중을 더한 체중값을 조회하시오 이때 별칭은 plus5로 하시오
SELECT stu_name,stu_weight,stu_weight+5 AS plus5 FROM student;

--수강테이블의 모든정보를 검색하시오. 이때 별칭을 한글로 부여하여 검색하이소
SELECT sub_no AS 과목번호,stu_no AS 학번,enr_grade AS 점수 FROM enroll;

--학생의 이름과 학과를 '컴퓨터정보과 옥한빛입니다' 식으로 검색하시오
SELECT stu_dept||'과 '||stu_name ||'입니다' FROM student;

--전기전자과 이외 학생들의 모든 정보를 검색하시오
SELECT *FROM student
WHERE stu_dept != '전기전자';

--'기계'이면서 2학년인 학생들의 모든 정보를 검색하이소
SELECT *FROM student
WHERE stu_dept = '기계' AND stu_grade=2;

--여학생중 체중이 60이하인 학생들을 모두 검색하이오
SELECT *FROM student
WHERE stu_gender ='F' AND stu_weight<=60;

-- 키가 160이상이며 170이하인 학생의 학번 이름을 검색하시오
SELECT stu_no,stu_name FROM student
WHERE stu_height BETWEEN 160 AND 170;

--이름에 '옥'이 들어있는 학생의 이름을 검색하시오
SELECT stu_name FROM student
WHERE stu_name LIKE '%옥%';

-- 키가 NULL인 학생의 이름을 검색하시오
SELECT stu_name FROM student
WHERE stu_height IS NULL;

--키가 null이 아닌 학생의 이름을 검색하시오
SELECT stu_name FROM student
WHERE stu_height IS NOT NULL;

--학번이 'XXXX20XX'인 학생의 모든 정보를 검색하시오
SELECT *FROM student
WHERE stu_no LIKE '____20%';

--학번이 2014인 학생들을 이름순으로 조회하시오(오름차순)
SELECT stu_name FROM student
WHERE stu_no LIKE '2014%'
ORDER BY stu_name ASC;

--학과정보를 내림차순으로 검색하이오
SELECT stu_dept FROM student
ORDER BY stu_dept DESC;

--------------------------------------------------------------

-- MAX MIN 최대 최소
SELECT MAX(stu_height)FROM student;
SELECT MIN(stu_weight)FROM student;

-- SUM 합계
SELECT SUM(enr_grade)FROM enroll;

-- COUNT NULL값은 포함안함
SELECT COUNT(*),COUNT(stu_height)FROM student;

-- GROUP BY
-- AVG 평균
-- 
SELECT stu_dept,AVG(stu_weight)
FROM student
GROUP BY stu_dept;

-- 학생테이블에서 체중이 50이상인 학생들의 학과별 인원수를 구하시오.
SELECT COUNT(stu_dept) 
FROM student
WHERE stu_weight>=50
GROUP BY stu_dept;

-- 학생테이블에서 학과별, 학년별 인원 수를 구하시오
SELECT stu_dept,stu_grade,COUNT(*)
FROM student
GROUP BY stu_dept ,stu_grade;

-- 기계과 학생들 중에 학년별 평균 신장이 160이상인 학년과 평균 신장을 구하시오.
SELECT stu_grade, AVG(stu_height)
FROM student
WHERE stu_dept = '기계'
GROUP BY stu_grade
HAVING AVG(stu_height) >=160;

-- 최대 신장이 175 이상인 학과와 학과별 최대 신장을 구하시오
SELECT stu_dept, MAX(stu_height)
FROM student
GROUP BY stu_dept
HAVING MAX(stu_height)>=175;

--학과별 평균 신장중 가장 높은 평균 신장을 구하시오
SELECT stu_dept, AVG(stu_height) AS avg_height
FROM student
GROUP BY stu_dept
HAVING AVG(stu_height) = (
  SELECT MAX(AVG(stu_height))
  FROM student
  GROUP BY stu_dept
);



