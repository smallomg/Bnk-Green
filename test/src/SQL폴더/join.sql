-- CROSS JOIN
-- 두 개 이상의 테이블을 조건없이 합치는 연산수행
SELECT student.*,enroll.*
FROM student CROSS JOIN enroll; 
SELECT count(*)FROM enroll;


--EQUI JOIN
--두개 이상의 테이블에 관련 있는 공통 열의 값을 이용하여 논리적으로 결합하는 연산 수행
--WHERE 절에서 '=' 사용
SELECT student.stu_no,stu_name,stu_dept,enr_grade
FROM student,enroll
WHERE student.stu_no = enroll.stu_no;

--NATURAL JOIN
--공통된 열을 찾아 조인 수행 단, 공통된 열이 2개 이상일 경우 사용불가
SELECT stu_no,stu_name,stu_dept,enr_grade
FROM student NATURAL JOIN enroll;


--JOIN - USING
--공통된 열이 2개 이상일 경우 
SELECT stu_no,stu_name,stu_dept,enr_grade
FROM student JOIN enroll USING(stu_no);


--JOIN - ON
SELECT student.stu_no,stu_name,stu_dept,enr_grade
FROM student JOIN enroll ON student.stu_no = enroll.stu_no;


--Non-Equi JOIN
--'='연산자를 사용하지 않는다
--기본키와 왜래키가 아닌 열값들의 의미있는 관계로 조인하는 경우
--인사관리DB에서 사원테이블(emp)의 급여 열(sal)값이 급여테이블(salgrade)의 하위급여(losal)와 
--상위급여(hisal)사이에 사원의 급여등급을 경정하는 질의문
SELECT empno,ename,sal,grade
FROM emp,salgrade
WHERE sal BETWEEN losal AND hisal;

--SELF JOIN
--자기 자신 테이블과의 조인 
--사원의 상급자사원을 구하는 질의문
SELECT a.empno as 사원번호,a.ename as 사원이름,b.empno as 상급자사원번호, b.ename as 상급자이름
FROM emp a,emp b
WHERE a.mgr = b.mgr;

--OUTER JOIN
--조인 조건을 만족하지 않는 행들고 결과에 포함시키기 위한 조인
SELECT e.*,sub_name
FROM enroll e,subject s
WHERE e.sub_no = s.sub_no;

SELECT *FROM enroll ORDER BY sub_no;
SELECT *FROM subject ORDER BY sub_no;

SELECT e.*,sub_name
FROM enroll e RIGHT OUTER JOIN subject s
ON e.sub_no = s.sub_no;

SELECT e.*,sub_name
FROM subject s LEFT OUTER JOIN enroll e
ON e.sub_no = s.sub_no;

SELECT e.*,sub_name
FROM enroll e FULL OUTER JOIN subject s
ON e.sub_no = s.sub_no;

--접합연산자
--UNION : 두 질의결과값의 힘, 중복없음
--UNION ALL : 두 질의 결과값의 합 중복포함
--INTERSECT : 두 질의 결과 공통되는값 (교집합)
--MINUS : 첫 번째 질의 결과에서 두 번째 질의 결과에 있는 행을 제거함(차집합)

CREATE TABLE a_student
AS SELECT *FROM student WHERE stu_dept IN('기계','전기전자');

CREATE TABLE b_student
AS SELECT *FROM student WHERE stu_dept IN('전기전자','컴퓨터정보');

--합집합 : UNION , UNION ALL
SELECT *FROM a_student
UNION
SELECT *FROM b_student;

SELECT *FROM a_student
UNION ALL
SELECT *FROM b_student;

--교집합 : INTERSET
SELECT *FROM a_student
INTERSECT
SELECT *FROM b_student;

--차집합 : MINUS
SELECT *FROM a_student
MINUS
SELECT *FROM b_student;

--부질의 : SubQuerty
--SELECT 문 앞에 또 다른 SELECT 문을 서브쿼리라고 한다

--'옥성우' 학생보다 신장이 큰 학생들의 학번,이름 ,신장을 구하시오
SELECT stu_no,stu_name,stu_height
FROM student
WHERE stu_height >(
SELECT stu_height FROM student WHERE stu_name = '육성우');



--=============================================================================
--101번 과목을 수강하는 학생들의 학번과 이름을 검색하시오
SELECT student.stu_no,stu_name 
FROM student ,enroll
WHERE student.stu_no = enroll.stu_no
AND sub_no = 101;

--301번 또는 102번 과목을 수강하는 학생의 학번과 이름을 검색하이소
SELECT student.stu_no,stu_name
FROM student,enroll
WHERE student.stu_no = enroll.stu_no 
AND (sub_no = 301 OR sub_no=102);

SELECT stu_no,stu_name
FROM student JOIN enroll USING(stu_no)
WHERE sub_no = 301 OR sub_no = 102;

SELECT student.stu_no,stu_name
FROM student JOIN enroll ON student.stu_no= enroll.stu_no
WHERE sub_no = 301 OR sub_no = 102;

--'컴퓨터개론' 과목을 수강하는 학생들의 학번, 이름, 과목을 검색하세요
SELECT st.stu_no,stu_name,sub_name
FROM student st, enroll e,subject sb
WHERE st.stu_no = e.stu_no
AND e.sub_no = sb.sub_no
AND e.sub_no = 101;

--'옥성우' 학생보다 신장이 큰 학생들의 학번,이름 ,신장을 구하시오
SELECT a.stu_no as 학번,a.stu_name as 이름,a.stu_height as 신장,
b.stu_no as 학번,b.stu_name as 이름,b.stu_height as 신장
FROM student a,student b
WHERE a.stu_height = b.stu_height 
AND b.stu_name='육성우';

--학생테이블에서 '박희정' 학생과 같은 체중인 학생의 정보를 구하시오
SELECT * FROM student WHERE stu_weight = (
SELECT stu_weight FROM student WHERE stu_name = '이태연')
AND stu_name != '이태연'; 

--학생테이블에서 '컴퓨터정보'학과와 같은 반인 다른 학과의 학생정보를 구하시오
SELECT *FROM student
WHERE stu_class IN ('A','B','C')AND stu_dept = '컴퓨터정보';

SELECT * FROM student
WHERE stu_class IN
(SELECT stu_class FROM student WHERE stu_dept = '컴퓨터정보') AND stu_dept = '컴퓨터정보';

--전체 학생들의 평균 신장보다 큰 학생을 구하시오
SELECT *FROM student
WHERE stu_height > (SELECT AVG(stu_height) FROM student );

--모든 학과의 평균 신장보다 큰 학생의 정보를 구하시오
SELECT *FROM student
WHERE stu_height >  (SELECT AVG(stu_height)FROM student 
WHERE stu_dept IN('기계','컴퓨터정보','전자기계','전기공학'));

SELECT MAX(AVG(stu_height))
FROM student
GROUP BY stu_dept;

SELECT stu_dept ,ROUND(AVG(stu_height),2)AS avg_height
FROM student
GROUP BY stu_dept;

SELECT stu_no,stu_name,a.stu_dept,stu_height,stu_weight
FROM student a, (SELECT stu_dept ,ROUND(AVG(stu_height),2)AS avg_height 
FROM student
GROUP BY stu_dept)b
WHERE a.stu_dept = b.stu_dept AND stu_height > avg_height;

--컴퓨터정보과의 최소 신장과 비교하여 최소 신장이 더 큰 학과의 학과명의 최소 신장을 구하시오
SELECT MIN(stu_height) ,stu_dept
FROM student
GROUP BY stu_dept
HAVING MIN(stu_height) > (
  SELECT MIN(stu_height) FROM student WHERE stu_dept = '컴퓨터정보' 
);

--101번 과목을 수강하는 학생들의 학번과 이름을 검색하시오
SELECT s.stu_no,stu_name
FROM student s, enroll e
WHERE s.stu_no = e.stu_no AND e.sub_no = 101;

SELECT stu_no FROM enroll WHERE sub_no = 101;

SELECT stu_no,stu_name FROM student
WHERE stu_no IN(SELECT stu_no FROM enroll WHERE sub_no= 101);

--101번 과목을 수강한 학생들의 학번 이름 점수를 검색하시오
SELECT s.stu_no,s.stu_name,e.enr_grade
FROM student s,enroll e
WHERE s.stu_no = e.stu_no AND e.sub_no = 101;

