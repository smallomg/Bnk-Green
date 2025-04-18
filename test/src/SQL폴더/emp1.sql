CREATE TABLE emp1(
    empno CHAR(4) PRIMARY KEY, --사원번호
    ename VARCHAR2(30), --사원이름
    job VARCHAR2(20),--사원직무
    mgr CHAR(4), --상급자사원
    hiredate DATE, --입사일
    sal NUMBER(7,2), --급여
    comm NUMBER(7,2),--커미션
    deptno CHAR(2), --부서번호
    FOREIGN KEY(mgr) REFERENCES emp(empno),
    FOREIGN KEY(deptno) REFERENCES dept(deptno)  
);

INSERT INTO emp1 
VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'dd-mm-yyyy'), 5000, NULL, 10);

INSERT INTO emp1 
VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('2-4-1981', 'dd-mm-yyyy'), 2975, NULL, 20);

INSERT INTO emp1 
VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1-5-1981', 'dd-mm-yyyy'), 2850, NULL, 30);

INSERT INTO emp1 
VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('9-6-1981', 'dd-mm-yyyy'), 2450, NULL, 10);

INSERT INTO emp1 
VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 3000, NULL, 20);

INSERT INTO emp1 
VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 3000, NULL, 20);

INSERT INTO emp1 
VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-2-1981', 'dd-mm-yyyy'), 1600, 300, 30);

INSERT INTO emp1 
VALUES (7521, 'WORD', 'SALESMAN', 7698, TO_DATE('22-2-1981', 'dd-mm-yyyy'), 1250, 500, 30);

INSERT INTO emp1 
VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-9-1981', 'dd-mm-yyyy'), 1250, 1400, 30);

INSERT INTO emp1 
VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-9-1981', 'dd-mm-yyyy'), 1500, 0, 30);

INSERT INTO emp1 
VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 950, NULL, 30);

INSERT INTO emp1 
VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-1-1982', 'dd-mm-yyyy'), 1300, NULL, 10);

INSERT INTO emp1 
VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'dd-mm-yyyy'), 800, NULL, 20);

INSERT INTO emp1 
VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 1100, NULL, 20);

DELETE FROM emp1
WHERE deptno = 10;


CREATE TABLE dept1(
    deptno CHAR(2) PRIMARY KEY,--부서번호
    dname VARCHAR2(14),--부서이름
    loc VARCHAR2(13) --지역
);
INSERT INTO dept1 VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept1 VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO dept1 VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO dept1 VALUES (40, 'OPERATIONS', 'BOSTON');


CREATE TABLE salgrade1(
    grade CHAR(2) PRIMARY KEY,--급여등급
    losal NUMBER(7, 2), --최저급여
    hisal NUMBER(7, 2)--최고급여
);
INSERT INTO salgrade1 VALUES(1, 700, 1200);
INSERT INTO salgrade1 VALUES(2, 1201, 1400);
INSERT INTO salgrade1 VALUES(3, 1401, 2000);
INSERT INTO salgrade1 VALUES(4, 2001, 3000);
INSERT INTO salgrade1 VALUES(5, 3001, 9999);



--1 부서번호 20 30인 자료들로 emp1 테이블을 만드시오
--2 dept기준으로 dept1테이블을 만드시오
--3 salgrade 테이블을 바탕으로 salgrade1 테이블을 만드시오

--4. 사원번호7703,사원이름JOSH,사원직무SALESMAN상급자사원번호 7566 급여 1400 커미션0 
--   부서번호20인 사원이 오늘 입사하였다
INSERT INTO emp1
VALUES(7703,'JOSH','SALESMAN',7566,TO_DATE('14-04-2025', 'dd-mm-yyyy'),1400,0,20);
--5 사원번호 7401 서원이름HOMER 급여 1300 부서번호 10인 사원이 입사하였다
INSERT INTO emp1
VALUES(7401,'HOMER',NULL,NULL,NULL,1300,NULL,10);
--6 사원번호7323, 사원이름BRANDA 부서번호 30 사원번호 7499와 동일한 급여를 받는 사원이 입사하였다
INSERT INTO emp1 (empno, ename, deptno)
VALUES (7323, 'BRANDA', 30);
UPDATE emp1
SET sal = (
  SELECT sal
  FROM emp1
  WHERE empno = 7499
)
WHERE empno = 7323;


--7 사원emp 테이블에서 부서번호 10데이터를 emp1 테이블에 삽입하시오 
INSERT INTO emp1
SELECT * FROM emp
WHERE deptno = 10;

--8 사원번호7369의 사원직무 ALALYSY로 바꾸시오
UPDATE emp1
SET job = 'ALALTSY' 
WHERE empno = 7369;

--9 부서번호 20인 직원들의 급여를 10% 감하시오
UPDATE emp1
SET sal = sal*(90/100)
WHERE deptno = 20;

--10 모든 사원의 급여를 100 증가시키시오
UPDATE emp1
SET sal = sal+100;
--11 사원번호 7902의 사급자사원번호 7654 부서번호 30으로 바꾸시오
UPDATE emp1 
SET mgr = 7654 ,deptno = 30
WHERE empno =7902;

--12 지역이 DALLAS인 사원들의 급여를 10 감하시오
UPDATE emp1
SET sal = sal - 10
WHERE deptno IN (
  SELECT d.deptno
  FROM dept1 d
  WHERE d.loc = 'DALLAS'
);


--13 급여등급이 2인 사원들의 급여를 20감하시오
UPDATE emp1
SET sal = sal - 20
WHERE sal BETWEEN (
    SELECT losal FROM salgrade WHERE grade = 2
) AND (
    SELECT hisal FROM salgrade WHERE grade = 2
);

--14 사원번호 7499가 퇴사하였습니다
DELETE emp1
WHERE empno = 7499;
--15 부서번호 50 부서이름PLANNING 지역MIAMI가 추가되었습니다
INSERT INTO dept1
VALUES (50,'PLANNING','MIAMI');
--16 부서번호40인 부서가 60으로 변경되었습니다
UPDATE dept1
SET deptno = 60 
WHERE deptno = 40;
--17 부서번호 30인부서가 패쇄되었습니다
DELETE dept1
WHERE deptno = 30;
--18 dept1 테이블에 없는 부서번호들을 갖고 있는 사원들의 부서번호를 99로 변경하시오
UPDATE emp1
SET deptno = 99
WHERE deptno NOT IN (
  SELECT deptno FROM dept1
);
--19 emp1에서 99번 부서번호를 삭제하시오
DELETE emp1
WHERE deptno = 99;
--20 상급자사원번호가 없는 사원의 급여를 100올렸다
UPDATE emp1
SET sal  = sal +100
WHERE mgr IS NULL;
--21 JONES JOSH CLARK가 30번 부서로 바뀌었다
UPDATE emp1 
SET deptno = 30
WHERE ename = 'JONES' OR ename = 'JOSH' OR ename = 'CLARK';
--22 커미션이 null인 데이터를 0으로 바꾸시오
UPDATE emp1
SET comm = NVL(comm,0);
--23 emp1 전체 테이블의 데이터를 삭제하시오
DELETE FROM emp1;


