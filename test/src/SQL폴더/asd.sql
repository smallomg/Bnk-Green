/*
CREATE TABLE student(
 STU_NO CHAR(30) NOT NULL PRIMARY Key,
 STU_NAME VARCHAR2(5),
 STU_DEPT VARCHAR2(20),
 STU_GRADE NUMBER(1),
 STU_CLASS CHAR(1),
 STU_GENDER CHAR(1),
 STU_HEIGHT NUMBER(5,2),
 STU_WEIGHT NUMBER(5,2)
);

CREATE TABLE subject(
 SUB_NO CHAR(3) NOT NULL PRIMARY Key,
 SUB_NAME VARCHAR2(30),
 SUB_PROF VARCHAR2(20),
 SUB_NUMBER NUMBER(1),
 SUB_DEPT VARCHAR2(20)
);
*/

drop table student;
drop table subject;
drop table enroll;



CREATE TABLE student(
    STU_NO CHAR(9),
    STU_NAME VARCHAR2(30),
    STU_DEPT VARCHAR2(20),
    STU_GRADE NUMBER(1),
    STU_CLASS CHAR(1),
    STU_GENDER CHAR(1),
    STU_HEIGHT NUMBER(5,2),
    STU_WEIGHT NUMBER(5,2),
    CONSTRAINT p_stu_no primary key(stu_no)
);

CREATE TABLE subject(
    SUB_NO CHAR(3) PRIMARY Key,
    SUB_NAME VARCHAR2(30),
    SUB_PROF VARCHAR2(20),
    SUB_NUMBER NUMBER(1),
    SUB_DEPT VARCHAR2(20)
);

CREATE TABLE enroll(
    SUB_NO CHAR(3),
    STU_NO CHAR(9),
    ENR_GRADE NUMBER(3),
    CONSTRAINT p_course PRIMARY KEY(sub_no, stu_no)
);

insert into student values(20153075, '옥한빛', '기계', 1, 'C', 'M', 177, 88);
insert into student values(20153088, '이태연', '기계', 1, 'C', 'F', 162, 50);
insert into student values(20143054, '유가인', '기계', 2, 'C', 'F', 154, 47);
insert into student values(20152088, '조민우', '전기공학', 1, 'C', 'M', 188, 50);
insert into student values(20142021, '심수겸', '전기공학', 2, 'A', 'F', 168, 45);
insert into student values(20132003, '백희철', '전기공학', 3, 'B', 'M', NULL, 63);
insert into student values(20151062, '김연중', '컴퓨터정보', 1, 'B', 'M', 164, 67);
insert into student values(20141007, '진형우', '컴퓨터정보', 2, 'A', 'M', 174, 64);
insert into student values(20131001, '김종현', '컴퓨터정보', 3, 'C', 'M', NULL, 72);
insert into student values(20131025, '육성우', '컴퓨터정보', 3, 'A', 'F', 172, 63);

select * from student;

insert into subject values('111', '데이터베이스', '이재영', 1, '컴퓨터정보');
insert into subject values('110', '자동제어', '정순정', 2, '전기전자');
insert into subject values('109', '자동화설계', '백민영', 3, '기계');
insert into subject values('101', '컴퓨터개론', '김종연', 3, '컴퓨터정보');
insert into subject values('102', '기계공작법', '김대영', 1, '기계');
insert into subject values('103', '기초전자실험', '김유석', 1, '전기전지');
insert into subject values('104', '시스템분석설계', '강석현', 3, '컴퓨터정보');
insert into subject values('105', '기계요소설계', '김명성', 1, '기계');
insert into subject values('106', '전자회로설계', '최영민', 3, '전기전자');
insert into subject values('107', 'CAD응용실습', '구봉규', 2, '기계');
insert into subject values('108', '소프트웨어공학', '권민성', 1, '컴퓨터정보');

select * from subject;

insert into enroll values('111', '20131001', 80);
insert into enroll values('104', '20131001', 56);
insert into enroll values('106', '20132003', 72);
insert into enroll values('103', '20152088', 45);
insert into enroll values('101', '20131025', 65);
insert into enroll values('104', '20131025', 65);
insert into enroll values('108', '20151062', 81);
insert into enroll values('107', '20143054', 41);
insert into enroll values('102', '20153075', 66);
insert into enroll values('105', '20153075', 56);
insert into enroll values('102', '20153088', 61);
insert into enroll values('105', '20153088', 78);

select * from enroll;


-- 학생 테이블의 구조를 확인하시오
DESCRIBE student;

-- 과목 테이블의 구조를 확인하시오
DESC subject;

-- 수강 테이블의 구조를 확인하시오
DESC enroll;

-- 학생테이블의 학번, 학생이름을 조회하시오
select STU_NO, STU_NAME 
from student; 

-- 학생테이블에서 학과를 중복데이터 업이 조회하시오
SELECT DISTINCT stu_dept 
FROM student;

-- 학생테이블에서 학년과 반을 중복 없이 조회하시오
SELECT DISTINCT STU_GRADE, STU_CLASS
FROM student;


-- 수강테이블에서 학번, 과목번호, 점수, 기존 점수에 10을 더한 점수를 조회하시오
select STU_NO, SUB_NO, ENR_GRADE, ENR_GRADE + 10
from enroll;


-- 수강테이블에서 학번, 과목번호, 점수, 기존 점수에 10을 더한 점수를 조회하시오
-- 이때, 기존 점수에 10을 더한 점수의 열 제목은 plus19으로 하시오
select STU_NO, SUB_NO, ENR_GRADE, ENR_GRADE + 10 as plus10
from enroll;

-- 연산자 사용 : 두개이상의 열을 합쳐서 조회할 수 있음
select stu_dept || stu_name as 학과성명
from student;

select stu_dept || ', ' || stu_name || '입니다.' as 학과성명 
from student;


-- WHERE절 사용하기

-- 학교가 '컴퓨터정보'인 학생의 이름, 학과, 학년, 반 정보를 조회하시오.
select STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS
from student
where STU_DEPT = '컴퓨터정보';


-- 학과가 '컴퓨터정보'가 아닌 학생의 이름, 학과, 학년, 반 정보를 조회하시오
select STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS
from student
where STU_DEPT != '컴퓨터정보';

select STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS
from student
where STU_DEPT <> '컴퓨터정보';

select STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS
from student
where STU_DEPT ^= '컴퓨터정보';


-- 학과가 '컴퓨터정보'이고 2학년인 학생의 모든 정보를 조회하시오
select *
from student
where STU_DEPT='컴퓨터정보' AND STU_GRADE = 2;


-- 1학년, 2학년 학생의 모든 정보를 출력하시오
select * 
from student
where STU_GRADE = 1 OR STU_GRADE = 2;


-- 체중이 60이상 70이하인 학생의 이름과 학과, 학년을 조회하시오
select STU_NAME, STU_DEPT, STU_GRADE, STU_WEIGHT
from student
WHERE STU_WEIGHT >= 60 AND STU_WEIGHT <= 70;

-- BETWEEN AND에 쓰이는 숫자값은 포함(이상, 이하)시키는 값이다
select STU_NAME, STU_DEPT, STU_GRADE, STU_WEIGHT
from student
WHERE STU_WEIGHT BETWEEN 60 AND 70;


-- 키가 180이상인 학생의 이름과 학과, 학년을 조회하시오
select STU_NAME, STU_DEPT, STU_GRADE
from student
where STU_height >= 170;

-- 키가 170이상인 학생의 수는 몇명인지 구하시오
select count(stu_no)
from student
where STU_height >= 170;


-- LIKE를 이용한 검색
-- LIKE와 함께 쓰이는 기호(와일드 카드) %, _
-- % : 0개 이상의 문자
-- _ : 1개의 문자

-- 학생 중 성이 김씨인 학생들의 정보를 검색하시오
select * from student
where stu_name LIKE '김%';


-- 학생 중 이름의 두번째 글자가 '수'인 학생의 이름을 검색하시오
select stu_name
from student
where stu_name LIKE '_수%';


-- 학생 중 이름이 '우'로 끝나는 학생의 수가 몇 명인지 검색하시오
select count(*)
from student
where stu_name like '%우';


-- 학번이 2014번인 학생의 정보를 조회하시오
select *
from student
where stu_no LIKE '2014%';


-- NULL 확인
select stu_no, stu_name, stu_height 
from student;


-- 학생정보 중 키 값이 없는 학생의 학번, 이름, 키를 조회하시오
select stu_no, stu_name, stu_height
from student
where stu_height IS NULL;

-- 학생정보 중 키 값이 있는 학생의 학번, 이름, 키를 조회하시오
select stu_no, stu_name, stu_height
from student
where stu_height IS NOT NULL;


-- 학교가 '컴퓨터정보'이거나 '기계'과인 학생의 학번, 이름, 학과를 검색하시오
select stu_no, stu_name, stu_dept
from student
where stu_dept = '컴퓨터정보' OR stu_dept ='기계';

select stu_no, stu_name, stu_dept
from student
where stu_dept IN ('컴퓨터정보', '기계');


-- 정렬하기(오름차순, 내림차순)\
-- 오름차순: ASC(기본)
-- 내림차순 : DESC

select * 
from student
order by stu_no ASC;

select * from student
order by stu_no DESC;

-- 별칭을 기준으로 정렬을 하겠다
select stu_no, stu_dept, stu_weight - 5 as target
from student
order by target;

select stu_no, stu_dept, stu_weight - 5 as target
from student
order by stu_dept, target;

select stu_no, stu_dept, stu_weight - 5 as target
from student
order by stu_height;




-- 문제

-- 남학생의 이름과, 학과, 학년을 조회하시오
select stu_name, stu_dept, stu_grade 
from student;

-- 학생들의 이름과 현재 체중, 그리고 현재 체중에 5를 더한 체중값을 조회하시오
select stu_name, stu_weight, stu_weight + 5
from student;

-- 수강 테이블의 모든 정보를 검색하시오, 이때 별칭을 한글로 부여하여 검색하시오
select sub_no as 과목번호, stu_no as 학번, enr_grade as 점수
from enroll;

-- 학생의 이름과 학과를 '컴퓨터정보과 옥한빛입니다.' 이런식으로 검색하시오
select stu_dept || '과 ' || stu_name as 이름과학과
from student;

-- 전기전자과 이외 학생들의 모든 정보를 검색하시오
select *
from student
where stu_dept != '전기공학';

-- '기계'과 이면서 2학년인 학생들의 모든 정보를 검색하시오
select *
from student
where stu_dept = '기계' AND stu_grade = 2;

-- 여학생 중 체중이 60이하인 학생을 모두 검색하시오


-- 키가 160 이상이며, 170 이하인 학생의 학번과 이름을 검색하시오

-- 이름에 '옥'이 들어있는 학생의 이름을 검색하시오

-- 키가 null인 학생의 이름을 검색하시오

-- 키가 null이 아닌 학생의 이름을 검색하시오

-- 학번이 'XXXX20XX'인 학생의 모든 정보를 검색하시오

-- 학번이 2014인 학생들을 이름순으로 조회하시오(오름차순)

-- 학과정보를 이름을 기준으로 내림차순으로 검색하시오





-- 2025-04-08 일자 -------------------------------------------------------------------------------------------------------------
-- 그룹

-- min, max
select max(stu_height) 
from student;

select min(stu_height) 
from student;

-- 합계
select sum(enr_grade) from enroll;

-- 갯수
select count(*), count(stu_height)
from student;

-- group by
-- 학생테이블에서 학과별 몸무게 평균을 구하시오
select stu_dept, avg(stu_weight)
from student
group by stu_dept;

-- 학생테이블에서 체중이 50이상인 학생들의 학과별 인원수를 구하시오
select stu_dept, count(*)
from student
where stu_weight >= 50
group by stu_dept;

-- 학생테이블에서 학과별, 학년별 인원수를 구하시오
select stu_dept, stu_grade, count(*)
from student
group by stu_dept, stu_grade
order by stu_dept;

-- 기계과 학생들 중 학년별 평균 신장이 160이상인 학년과 평균 신장을 구하시오
select stu_grade, avg(stu_height)
from student
where stu_dept = '기계'
group by stu_grade
having avg(stu_height) >= 160;


-- 최대 신장이 175 이상인 학과의 학과별 최대 신장을 구하시오
select stu_dept, max(stu_height)
from student group by stu_dept
having max(stu_height) >= 175;

-- 학과별  평균 신장 중 가장 높은 평균 신장을 구하시오
-- to_char(숫자, '999.99')    <-- 숫자를 나타낼때 999.99처럼 소수점 두번째까지 나타낸다
select to_char(max(avg(stu_height)), '999.99')      
from student
group by stu_dept;



-- 테이블 구현 ---------------------------------------------------------------------------------------------------------------------------------
-- dept
drop table dept;

CREATE TABLE dept(
    deptno CHAR(2) PRIMARY KEY,
    dname VARCHAR2(14),
    loc VARCHAR2(13)
);


-- salgrade
drop table salgrade;

CREATE TABLE salgrade(
    grade CHAR(2) PRIMARY KEY,
    losal NUMBER(7, 2),
    hisal NUMBER(7, 2)
);


-- emp, 참고로 emp, dept가 먼저 테이블이 생성되어야 외래키를 지정해줄수 있다
drop table emp;

CREATE TABLE emp(
    empno CHAR(4) PRIMARY KEY,
    ename VARCHAR2(30),
    job VARCHAR2(20),
    mgr CHAR(4),
    hiredate DATE,
    sal NUMBER(7,2),
    comm NUMBER(7,2),
    deptno CHAR(2),
    FOREIGN KEY(mgr) REFERENCES emp(empno),
    FOREIGN KEY(deptno) REFERENCES dept(deptno)  
);

-- desc table

desc dept;
desc salgrade;
desc emp;

-- 데이터 삽입
-- dept 
INSERT INTO dept VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO dept VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO dept VALUES (40, 'OPERATIONS', 'BOSTON');

SELECT * FROM dept;

-- salgrade
INSERT INTO salgrade VALUES(1, 700, 1200);
INSERT INTO salgrade VALUES(2, 1201, 1400);
INSERT INTO salgrade VALUES(3, 1401, 2000);
INSERT INTO salgrade VALUES(4, 2001, 3000);
INSERT INTO salgrade VALUES(5, 3001, 9999);

SELECT * FROM salgrade;

-- emp
INSERT INTO emp VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'dd-mm-yyyy'), 5000, NULL, 10);
INSERT INTO emp VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('2-4-1981', 'dd-mm-yyyy'), 2975, NULL, 20);
INSERT INTO emp VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1-5-1981', 'dd-mm-yyyy'), 2850, NULL, 30);
INSERT INTO emp VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('9-6-1981', 'dd-mm-yyyy'), 2450, NULL, 10);
INSERT INTO emp VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 3000, NULL, 20);
INSERT INTO emp VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 3000, NULL, 20);
INSERT INTO emp VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-2-1981', 'dd-mm-yyyy'), 1600, 300, 30);
INSERT INTO emp VALUES (7521, 'WORD', 'SALESMAN', 7698, TO_DATE('22-2-1981', 'dd-mm-yyyy'), 1250, 500, 30);
INSERT INTO emp VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-9-1981', 'dd-mm-yyyy'), 1250, 1400, 30);
INSERT INTO emp VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-9-1981', 'dd-mm-yyyy'), 1500, 0, 30);
INSERT INTO emp VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 950, NULL, 30);
INSERT INTO emp VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-1-1982', 'dd-mm-yyyy'), 1300, NULL, 10);
INSERT INTO emp VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'dd-mm-yyyy'), 800, NULL, 20);
INSERT INTO emp VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 1100, NULL, 20);

SELECT * FROM emp;

-- 오라클 숫자 관련 함수
-- 반올림
select round(345.478) , round(345.678), round(345.678, 0), round(345.678, 1), round(345.578, 1), round(345.6789, 3), round(345.678, -2) from dual;
-- 절댓값
select ABS(-19)from dual;
-- 올림
select CEIL(3.14) from dual;
-- 내림
select FLOOR(3.99) from dual;
-- 절삭
select TRUNC(123.456, 2) from dual;
-- 나머지
select MOD(10, 3) from dual;
-- 지수 계산 
select POWER(2, 3) from dual;
-- 로그 계산
select SQRT(16) from dual;
-- 숫자의 부호 판별 
select SIGN(-50) from dual;      

-- 오라클 문자 관련 함수
-- 문자열 길이 반환
select length('oracle') from dual;
-- 문자열 자르기
select substr('oracle', 2, 3) from dual;
-- 특정 문자의 위치 반환
select INSTR('ORACLE', 'A') from dual;
-- 대문자로 변환
select UPPER('oracle') from dual;
-- 소문자로 변환
select LOWER('ORACLE') from dual;
-- 단어의 첫글자만 대문자로 변환
select INITCAP('hello oracle') from dual;
-- 문자열 양쪽에서 지정한 문자 제거
select TRIM('O' FROM 'ORACLEO') from dual;
-- 문자열 왼쪽에서 지정한 문자 제거
select LTRIM('***ABC', '*') from dual;
-- 문자열 오른쪽에서 지정한 문자 제거
select RTRIM('ABC***', '*') from dual;
-- 문자열 일부를 다른 문자열로 바꿈
select REPLACE('a-b-c', '-', '*') from dual;
-- 문자열 두개를 이어 붙임
select CONCAT('Hi', 'oracle') from dual;
-- 왼쪽에서 문자를 채워서 전체 길이를 맞춤
select LPAD('99', 5, 'O') from dual;
-- 오른쪽에서 문자를 채워서 전체 길이를 맞춤
select RPAD('81', 5, '!') from dual;
-- 문자들을 각각 대응시켜 바꿈, replace와 다른점이라면 아래의 예시로 213이 각각 2=A, 1=B, 3=C로 각각 대치되어 딱 213이 아니더라도 각 문자가 일치한다면 문자 변경이 이루어진다
select TRANSLATE('12345-12345', '213', 'ABC') from dual;

-- 오라클 날짜 함수
-- 현재날자(서버 DB 날짜) 출력, 오라클 서버가 설치된 컴퓨터의 시간 기준
select sysdate as 현재시간 from dual;
-- 지금 접속한 사용자 세션의 시간대 기준
select current_date from dual;
-- 날짜 + 시분초 + 소수초 + 시간대, 서버 시간 기준
select systimestamp from dual;
-- 날짜에 달을 더하기
select ADD_months(sysdate, 3) from dual;
-- 두 시간대 사이의 달의 차이를 숫자로 출력 
select months_between(sysdate, to_date('2025-01-01', 'yyyy-mm-dd')) as 개월차이 from dual;
-- 해당 날짜를 기준으로 다음 화요일이 시작되는 날짜를 출력
select next_day(sysdate, '화요일') as 다음화요일 from dual;
-- 해당 날짜의 마지막 날을 출력
select last_day(sysdate) as 이달의마지막날 from dual;
-- 날짜를 반올림해서 15일 이상이면 다음 달, 15일 아래면 현재 달을 출력한다
select round(sysdate, 'MONTH') as 반올림결과 from dual; 
-- 날짜에서 년,월,일에 해당하는 정보를 추출한다
select extract(year from sysdate) from dual;
select extract(month from sysdate) from dual;
select extract(day from sysdate) from dual;
-- 문자열을 특정한 패턴을 통해 날짜 데이터로 변환한다
select to_date('2025-03-24', 'YYYY-MM-DD') as 날짜변환 from dual;
-- 날짜를 문자열로 변환한다, 또한 특별한 포멧으로 출력이 가능하다
select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') from dual;
-- 날짜 빼기가 가능하다
select sysdate - to_date('2025-04-08', 'YYYY-MM-DD')from dual; 

-- 숫자를 특정한 형태로 변형할수 있다
select TO_CHAR(TO_NUMBER(1234.5678), '9999.999') from dual;
select TO_CHAR(TO_NUMBER(1234.5678), '99999.9999') from dual;
select TO_CHAR(TO_NUMBER(1234.5678), '999.999') from dual;      -- 형식에서 자릿수가 모자라게 되면 출력을 제대로 못한다
select empno, ename, to_char(to_number(sal), '$9999.9') salary from emp;   -- 문자를 넣은 패턴도 가능하다

-- null의 유무 계산, MGR의 값이 null이라면 0으로 출력한다
select ename, NVL(MGR, 0) from emp;
select ename, mgr from emp;

-- null의 유무 계산 두번째, comm값이 null이 아니면 sal+comm을, null이라면 sal을
select ename, job, NVL2(comm, sal+comm, sal) from emp;      
select ename, job, comm, sal from emp; 


 
-- 문제

-- 부서의 부서이름과 지역을 검색하시오
select dname, loc from dept; 

-- 사원들의 입사일 중복을 제거하고 검색하시오
select distinct hiredate from emp;

-- 사원들의 부서번호 중복을 제거하고 검색하시오
select distinct deptno from emp;

-- 사원들의 6개월 급여의 합을 검색하시오
select sum(sal) from emp;

-- 사원이름을 'Name'으로 사원의 급여를 'Salary'로 열의 이름을 부여하여 검색하시오
select ename as Name, sal as Salary from emp;

-- 부서번호, 부서이름, 지역을 한글 제목으로 검색하시오
select deptno as 부서번호, dname as 부서이름, loc as 지역 from dept;

-- 사원의 직무와 사원이름을 합쳐서 검색하시오(예: PRESIDENTKING)
select job || ename from emp;

-- 10번 부서에서 근무하는 사원의 이름을 검색하시오
select ename 
from emp
where deptno = 10;

-- 급여가 2000이상인 사원들의 사원번호, 사원이름을 검색하시오
select empno, ename 
from emp
where sal >= 2000;

-- 사원 직무가 'CLERK'인 사원의 사원번호, 사원이름을 검색하시오
select empno, ename 
from emp
where job = 'CLERK';

-- 1980년 12월 17일에 입사한 사원의 이름을 검색하시오
select ename
from emp
where hiredate = to_date('1980-12-17', 'yyyy-mm-dd');

-- 부서번호 30이외의 부서이름과 지역을 검색하시오
select dname, loc 
from dept
where deptno != 30;

-- 'WARD' 사원의 모든 정보를 검색하시오  - emp테이블의 사원이름 WORD를 WARD로 수정하시오        update emp set ename='WARD' where ename='WORD';
select * 
from emp
where ename='WARD';

-- 10번 부서에 근무하는 MANAGER의 사원 이름을 검색하시오
select ename
from emp
where deptno=10 AND job='MANAGER';

-- 급여가 2000이상이며, 30번 부서에 근무하는 사원들의 사원번호와 사원이름을 검색하시오
select empno, ename
from emp
where sal>=2000 AND deptno=30;

-- 20부서 외에 근무하는 MANAGER의 사원이름을 검색하시오
select ename
from emp
where deptno!=20 AND job='MANAGER';

-- salesman의 급여가 1500이상인 사원이름을 검색하시오
select ename
from emp
where sal >= 1500 and job='SALESMAN';

-- 사원번호가 75xx인 사원의 사원번호, 사원이름, 부서번호를 검색하시오
select empno, ename, deptno
from emp
where empno LIKE '75%';

-- 부서번호가 10 또는 30에 근무하는 사원들의 사원이름과 급여를 검색하시오
select ename, sal
from emp
where deptno=10 or deptno=30; 

-- 1981년 2월에 입사한 사원의 사원번호, 사원이름, 부서번호를 검색하시오
select empno, ename, deptno
from emp
where extract(year from hiredate) = 1981 AND extract(month from hiredate) = 4;

-- 사원이름 중간에 'A'가 들어있는 사원의 사원번호와 사원이름을 검색하시오
select empno, ename
from emp
where ename like '%A%';

-- 상급자 사원번호가 NULL인 사람의 사원번호와 사원이름을 검색하시오
select empno, ename
from emp
where mgr Is null;

-- 상급자 사원번호가 null이 아닌 사원의 사원번호와 사원이름, 상급자 사원 번호를 검색하시오
select empno, ename, mgr
from emp
where mgr is not null;

-- 사원들의 사원번호와 사원이름을 사원번호 순으로 검색하시오(오름차순)
select empno, ename
from emp
order by empno asc;

-- 사원들의 정보를 사원직무별 급여 많은 순으로 검색하시오
select *
from emp
order by job, sal desc;

-- 사원들의 사원이름을 소문자로 검색하시오
select lower(ename) from emp;

-- 사원들의 사원이름, 사원직무를 대문자로 검색하시오
select upper(ename), upper(job) from emp;

-- 사원들의 사원이름을 첫자만 대문자로 검색하시오
select INITCAP(ename) from emp;

-- 사원들의 사원이름과 사원직무를 연결(concat)하여 검색하시오
select concat(ename, job) from emp;

-- 사원들의 사원이름과 사원이름의 첫 두 글자를 검색하시오
select ename, substr(ename, 1, 2)from emp;

-- 사원들의 사원이름, 사원직무 그리고 사원직무의 두 번째부터 세글자를 검색하시오
select ename, job, substr(job, 2, 3) from emp;

-- 사원들의 사원이름과 사원이름의 길이를 검색하시오
select ename, length(ename) from emp;

-- 사원들의 사원이름에 'A'가 몇 번째 위치에 있는지 검색하시오
select instr(ename, 'A') from emp;

-- 사원이름을 15자리로 하고, 뒤에 '&'를 채워 검색하시오
select RPAD(ename, 15, '&') from emp;

-- 사원직무을 20자리로 하고, 앞에 '%'를 채워 검색하시오
select LPAD(ename, 20, '%') from emp;

-- 사원의 사원번호, 사원이름, 급여를 검색하시오, (급여는 두 번째 자리에서 반올림함 - 예 : 2570 -> 2600)
select empno, ename, round(sal, -2) from emp;

-- 사원의 사원번호, 사원이름, 급여를 검색하시오. (급여는 두 번째 자리에서 절삭함 - 예 : 2975 -> 2900)
select empno, ename, trunc(sal, -2) from emp;

-- 사원번호와 급여를 100으로 나눈 나머지를 검색하시오
select MOD(empno, 100), MOD(sal, 100) from emp;

-- 사원번호, 사원이름, 입사일, 입사후 100일의 날짜를 검색하시오
select empno, ename, hiredate, hiredate + 100 as "입사후 100일" from emp;

-- 사원번호, 사원이름, 입사일, 근무 일자를 계산하여 검색하시오
select empno, ename, hiredate, round(sysdate - hiredate) from emp;

-- 사원들의 입사일에서 3달째 되는 날짜를 검색하시오
select add_months(hiredate, 3) from emp;

-- 상급자 사원번호가 없는 사원의 경우 '상급자없음'을 나타내도록 하시오
select ename, nvl(mgr, '상급자 없음') as 상급자유무 from emp;

-- 커미션을 포함한 급여를 사원번호, 사원이름과 함계 검색하시오
select empno, ename, nvl(comm,0) + sal as "커미션+급여" from emp;

-- 커미션을 포함한 연봉을 사원번호, 사원이름과 함계 검색하시오
select empno, ename, 12*sal + nvl(comm*12, 0) from emp;

-- 10, 20번 부서 사원들 중 최고 급여를 받는 사원의 사원번호, 사원이름, 급여를 계산하시오
select empno, ename, sal
from emp
where (deptno, sal) in (
    select deptno, max(sal)
    from emp
    where deptno in (10, 20)
    group by deptno
);

-- 30번 부서의 사원 중 최저 급여를 받는 사원의 사원번호, 사원이름, 급여를 검색하시오
select empno, ename, sal
from emp
where (deptno, sal) in (
    select deptno, min(sal)
    from emp
    where deptno = 30
    group by deptno
);

-- 전체 사원들 중 최고 커미션을 받는 사원의 사원번호, 사원이름, 커미션을 검색하시오
select empno, ename, comm
from emp
where comm in (
    select max(nvl(comm, 0))
    from emp
);

-- 전체 사원들 중 최저 커미션을 받는 사원의 사원번호, 사원이름, 커미션을 검색하시오
select empno, ename, comm
from emp
where comm in (
    select min(comm)
    from emp
    where comm is not null
);

-- 전체 사원의 입사일 중 MAX와 MIN 값을 검색하시오
select max(hiredate), min(hiredate) from emp;

-- 사원번호의 MAX와 MIN 값을 검색하시오
select max(empno), min(empno) from emp;

-- 상급자 사원번호 열의 개수를 검색하시오
select count(mgr) from emp;

-- 사원이름의 개수를 검색하시오
select count(ename) from emp;

-- 사원 테이블의 튜플 수를 검색하시오
select count(*) from emp;

-- 부서별 사원들의 인원수를 검색하시오
select deptno, count(*) from emp
group by deptno
order by deptno;

-- 상급자 사원번호별 사원들의 인원수를 검색하시오
select mgr, count(*)
from emp
where mgr is not null
group by mgr;

-- 부서별 사원들의 평균급여를 검색하시오
select deptno, avg(sal)
from emp
group by deptno;

-- 부서별 사원직무별 사원의 급여 합를 검색하시오
select job, sum(sal)
from emp
group by job;

-- 부서별 사원직무별 사원들의 평균 급여를 검색하시오
select deptno, job, avg(sal)
from emp
group by deptno, job;

-- 부서별 사원직무별 사원들의 입사일의 MAX와 MIN 값을 검색하시오
select deptno, job, max(hiredate), min(hiredate)
from emp
group by deptno, job;

-- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- 조인, emp테이블과 dept테이블 조인
select e.empno, e.ename, e.job, d.deptno 
from emp e, dept d 
where e.deptno = d.deptno
order by d.deptno;

-- jones의 부서명을 출력
select d.dname as "JONES의 부서명"
from emp e, dept d
where e.ename = 'JONES' and e.deptno = d.deptno;

-- jones의 부서명을 출력 - 서브쿼리1
select dname as "JONES의 부서명"
from dept
where deptno = (
    select deptno
    from emp
    where ename = 'JONES'
);

-- jones의 부서명을 출력 - 서브쿼리2
select ename, dname
from (
    select emp.*, dept.*
    from emp, dept
    where emp.ename = 'JONES' and emp.deptno = dept.deptno
);


-- 문제 
-- 테이블의 분리 - 테이블을 효과적으로 분리하자
-- 회원 정보 테이블
create table user_info(
    userid NUMBER(4) primary key,
    username VARCHAR2(20),
    phone CHAR(13)
);

-- 책 정보 테이블
create table book_info(
    bookid NUMBER(4) primary key,
    bookname varchar2(30),
    author varchar2(20)
);

-- 대출 정보 테이블
create table loan_info(
    loanid NUMBER(4) primary key,
    userid NUMBER(4),
    bookid NUMBER(4),
    loandate Date,
    duedate Date,
    CONSTRAINT fk_user_id FOREIGN KEY(userid) REFERENCES user_info(userid),
    CONSTRAINT fk_book_id FOREIGN KEY(bookid) REFERENCES book_info(bookid)
);

-- 데이터 삽입
insert into user_info values(1, 'james', '010-1111-1111');
insert into user_info values(2, 'anna', '010-2222-2222');
insert into user_info values(3, 'bruce', '010-3333-3333');
insert into user_info values(4, 'justin', '010-4444-4444');
insert into user_info values(5, 'jackson', '010-5555-5555');
insert into user_info values(6, 'kim', '010-6666-6666');
insert into user_info values(7, 'bell', '010-7777-7777');
insert into user_info values(8, 'ellen', '010-8888-8888');
insert into user_info values(9, 'envy', '010-9999-9999');
insert into user_info values(10, 'billy', '010-1515-1515');

insert into book_info values(1, '책1', 'tomas');
insert into book_info values(2, '책2', 'william');
insert into book_info values(3, '책3', 'joe');
insert into book_info values(4, '책4', 'korin');
insert into book_info values(5, '책5', 'ronald');
insert into book_info values(6, '책6', 'messi');
insert into book_info values(7, '책7', 'park');
insert into book_info values(8, '책8', 'nakamura');
insert into book_info values(9, '책9', 'tomi');
insert into book_info values(10, '책10', 'ben');

insert into loan_info values(1, 2, 5, to_date('2025-04-05', 'YYYY-MM-DD'), to_date('2025-05-05', 'YYYY-MM-DD'));
insert into loan_info values(2, 2, 4, to_date('2025-04-05', 'YYYY-MM-DD'), to_date('2025-05-05', 'YYYY-MM-DD'));
insert into loan_info values(3, 5, 10, to_date('2025-06-02', 'YYYY-MM-DD'), to_date('2025-07-02', 'YYYY-MM-DD'));
insert into loan_info values(4, 7, 2, to_date('2025-08-3', 'YYYY-MM-DD'));
insert into loan_info values(5, 1, 3, to_date('2025-02-15', 'YYYY-MM-DD'));
insert into loan_info values(6, 10, 1, to_date('2025-12-24', 'YYYY-MM-DD'));

-- 테이블 조회
select * from user_info;
select * from book_info;
select * from loan_info;

-- 쿼리문
-- 현재 대여된 책 번호 검색
select bookid as "대여된 책번호"
from loan_info;

-- 현재 대여된 책의 이름과 저자를 검색
select b.bookid
from book_info b, loan_info l
where b.bookid = l.loanid;

-- 테이블 삭제
drop table loan_info;
drop table user_info;
drop table book_info;


-- CONSTRAINT fk_employee_dept FOREIGN KEY (deptno)
-- REFERENCES department(deptno)
-- ON DELETE CASCADE


-- ==========================================================================
-- 2025-04-10 일자

-- 게시글과 회원에 관련된 테이블을 구현한다

-- 회원
CREATE table tbl_member(
    id varchar2(20) primary key,
    pw varchar2(10) not null,
    name varchar2(50) not null,
    phone char(13) not null,
    grade char(1)
);
-- 게시글
CREATE table tbl_board(
    bno NUMBER(4) primary key,
    title varchar2(100) not null,
    content varchar2(1000) not null,
    writer varchar2(20),
    regdate date,
    CONSTRAINT fk_writer_id FOREIGN key(writer) REFERENCES tbl_member(id) 
);


-- 테이블 상세
desc tbl_member;
desc tbl_board;


-- 데이터 삽입
insert into tbl_member values('user101', '1234', 'user1', '010-3421-3212', 'C');
insert into tbl_member values('dsfa12312', '1312', 'user2', '010-3412-4412', 'C');
insert into tbl_member values('goodUser01', '1333', 'user3', '010-3534-5552', 'B');
insert into tbl_member values('manager01', '144', 'user4', '010-3121-0009', 'A');

insert into tbl_board values(1, 'this is title1', 'blahblahblahblah', 'user101', sysdate);
insert into tbl_board values(2, 'thisssss', 'blah', 'dsfa12312', sysdate);
insert into tbl_board values(3, 'look me', 'blahblahblahblah', 'manager01', sysdate);
insert into tbl_board values(4, 'hello', 'lah', 'manager01', sysdate);
insert into tbl_board values(5, 'asdfadf', 'blahblah', 'goodUser01', sysdate);
insert into tbl_board values(6, '안녕하세요', 'lahblah', 'manager01', sysdate);
insert into tbl_board values(7, 'come on', 'blahblah', 'dsfa12312', sysdate);
insert into tbl_board values(8, 'this is the', 'blah', 'goodUser01', sysdate);
insert into tbl_board values(9, '안녕', 'blah', 'user101', sysdate);


-- 테이블 조회
select * from tbl_member;
select * from tbl_board;

select * 
from tbl_board
where title like '%안녕%';

-- 테이블 삭제
drop table tbl_member;
drop table tbl_board;


-- 테이블 조인
select *
from tbl_member tm, tbl_board tb
where tm.id = tb.writer;

select writer, count(*) as "작성수"
from tbl_board
group by writer;

-- 커밋
commit;


-- ==========================================================================
-- 2025-04-11 일자
-- 테이블 생성
CREATE TABLE t_student
AS SELECT * FROM student WHERE stu_dept = '기계';

-- 테이블 구조
DESC t_student;

-- 테이블 조회
SELECT * FROM t_student;

-- 새로운 열 추가 - DDL
ALTER TABLE t_student ADD (army CHAR(1));
-- 나이 속성 추가
ALTER TABLE t_student ADD (age NUMBER(3) DEFAULT 20);

-- 테이블 속성 제거
ALTER TABLE t_student DROP COLUMN age;
-- army 속성 제거
ALTER TABLE t_student DROP (army);

DESC t_student;
select * from t_student;

-- 특정 속성의 값을 수정 + 조건절
UPDATE t_student SET age = 22 WHERE stu_name = '이태연';
UPDATE t_student SET age = 24 WHERE stu_no = 20143054;

-- 테이블 이름 변경
RENAME t_student TO test_student;

DESC t_student;     -- 에러 발생
DESC test_student;

-- 테이블 내 전체 데이터 삭제
-- TRUNCATE로 테이블의 데이터를 삭제하면 롤백을 해도 복구할수 없다
-- DELETE로 지우면 롤백하면 복구가 가능하다
TRUNCATE TABLE test_student;

SELECT * FROM test_student;

-- 테이블 삭제
DROP TABLE test_student;


-- TCL

-- commit
-- DB에 영구적인 데이터 저장
COMMIT;

-- rollback
-- 이전으로 롤백
ROLLBACK;


-- 제약조건
-- 데이터베이스 상태(인스턴스)가 항상 만족해야할 기본 규칙
-- PRIMARY KEY : 식별가능한 유일한 값, NULL 값을 허용하지 않음
-- UNIQUE : 식별 가능한 유일한 값, 하지만 null이 가능하다 그리고 null이 중복되더라도 제약 위반은 아니다
-- CHECK : 속성에 들어온 값을 판별한다
-- NOT NULL : NULL 값을 허용하지 않음
CREATE TABLE member(
    tno NUMBER PRIMARY KEY,    
    mobile CHAR(13) UNIQUE,
    gender CHAR(1) CHECK (gender IN ('M', 'F')),
    hobby VARCHAR2(20) NOT NULL
);

insert into member values(null, '010-2121-2121', 'M', 'cook');   -- tno 에러 - not null
insert into member values(1, '010-2121-2121', 'M', 'cook');   
insert into member values(1, '010-2121-2121', 'M', 'cook');   -- tno 에러 - 데이터 중복
insert into member values(2, '010-2124-2121', 'M', 'cook');   

insert into member values(3, '010-2121-2121', 'M', 'cook');   -- mobile 에러 - 데이터 중복
insert into member values(3, '010-3333-2424', 'M', 'cook');   

insert into member values(4, '010-3333-2424', 'G', 'cook');   -- gender 에러 - CHECK 제약 위반
insert into member values(4, '010-4444-2222', 'F', 'cook');  
insert into member values(5, null, 'F', 'play');     -- UNIQUE 속성은 null이 가능함
insert into member values(6, null, 'F', 'play');     -- UNIQUE 속성에 null은 중복이 가능함

insert into member values(7, '010-4444-2222', 'F', null);     -- hobby 에러 - not null 위반 
insert into member values(7, '010-1111-1111', 'F', 'eat');     


select * from member;

-- HOBBY 속성 제약조건 비활성화
-- 해당 테이블의 속성의 constraint_name을 확인해야 한다
ALTER TABLE member DISABLE CONSTRAINT SYS_C007556;
insert into member values(8, '010-1111-4324', 'M', null);     

-- hobby 테이블의 제약조건 활성화
-- 근데 만약 hobby가 not null이고 hobby에 null값이 이미 존재한다면 잘못된 값으로 인해서 enable이 작동하지 않는다
ALTER TABLE member ENABLE CONSTRAINT SYS_C007556;
delete member where hobby is Null;  -- hobby열에 null값 제거

desc member;
select * from member;


-- 트랜잭션
-- 논리적인 이해 단위




