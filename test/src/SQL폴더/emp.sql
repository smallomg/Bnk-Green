-- 부서테이블
CREATE TABLE dept(
    deptno CHAR(2) PRIMARY KEY,--부서번호
    dname VARCHAR2(14),--부서이름
    loc VARCHAR2(13) --지역
);

INSERT INTO dept VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO dept VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO dept VALUES (40, 'OPERATIONS', 'BOSTON');
SELECT * FROM dept;

--사원테이블
CREATE TABLE emp(
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

INSERT INTO emp 
VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'dd-mm-yyyy'), 5000, NULL, 10);

INSERT INTO emp 
VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('2-4-1981', 'dd-mm-yyyy'), 2975, NULL, 20);

INSERT INTO emp 
VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1-5-1981', 'dd-mm-yyyy'), 2850, NULL, 30);

INSERT INTO emp 
VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('9-6-1981', 'dd-mm-yyyy'), 2450, NULL, 10);

INSERT INTO emp 
VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 3000, NULL, 20);

INSERT INTO emp 
VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 3000, NULL, 20);

INSERT INTO emp 
VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-2-1981', 'dd-mm-yyyy'), 1600, 300, 30);

INSERT INTO emp 
VALUES (7521, 'WORD', 'SALESMAN', 7698, TO_DATE('22-2-1981', 'dd-mm-yyyy'), 1250, 500, 30);

INSERT INTO emp 
VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-9-1981', 'dd-mm-yyyy'), 1250, 1400, 30);

INSERT INTO emp 
VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-9-1981', 'dd-mm-yyyy'), 1500, 0, 30);

INSERT INTO emp 
VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'dd-mm-yyyy'), 950, NULL, 30);

INSERT INTO emp 
VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-1-1982', 'dd-mm-yyyy'), 1300, NULL, 10);

INSERT INTO emp 
VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'dd-mm-yyyy'), 800, NULL, 20);

INSERT INTO emp 
VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('13-7-1987', 'dd-mm-yyyy'), 1100, NULL, 20);



SELECT * FROM emp;

--급여테이블
CREATE TABLE salgrade(
    grade CHAR(2) PRIMARY KEY,--급여등급
    losal NUMBER(7, 2), --최저급여
    hisal NUMBER(7, 2)--최고급여
);

INSERT INTO salgrade VALUES(1, 700, 1200);
INSERT INTO salgrade VALUES(2, 1201, 1400);
INSERT INTO salgrade VALUES(3, 1401, 2000);
INSERT INTO salgrade VALUES(4, 2001, 3000);
INSERT INTO salgrade VALUES(5, 3001, 9999);

SELECT * FROM salgrade;


------------------------------------------------------------------------------------------------------------------------
SELECT ROUND(345.678),ROUND(345.678,0),ROUND(345.678,1),ROUND(345.678,-1)
FROM dual;
  --ROUND(345.678),         -- 기본 반올림
  --ROUND(345.678, 0),      -- 소수점 0자리까지 반올림
  --ROUND(345.678, 1),      -- 소수점 1자리까지 반올림
  --ROUND(345.678, -1)      -- 정수 자릿수에서 반올림 (십의 자리)
  --dual 가상의 테이블
  
  
--오라클 숫자함수
SELECT ABS(-19)FROM dual; --절댓값
SELECT CEIL(3.14)FROM dual; --올림값
SELECT FLOOR(3.99)FROM dual; --내림값
SELECT TRUNC(123.456,2)FROM dual; --소수점 2자리까지 자르기
SELECT MOD(10,3) FROM dual; --나머지 연산 (Modulus, 10 ÷ 3 → 나머지 1)
SELECT POWER(2,3) FROM dual; --거듭제곱 (2의 3제곱 = 2³ = 8)
SELECT SQRT(16) FROM dual; --제곱근 (Square Root)
SELECT SIGN(50)FROM dual; --숫자의 부호 변환 양수: 1 / 음수: -1 / 0: 0 부호 알려주는 함수

--오라클 문자함수
SELECT LENGTH('ORACLE') FROM dual;
SELECT SUBSTR('ORACLE',2,3)FROM dual;
SELECT INSTR('ORACLE','A')FROM dual;
SELECT UPPER('oracle')FROM dual;
SELECT LOWER('ORACLE')FROM dual;
SELECT INITCAP('hello oracle')FROM dual;
SELECT TRIM('O' FROM 'ORACLEO')FROM dual;
SELECT LTRIM('***ABC','*')FROM dual;
SELECT RTRIM('ABC***','*')FROM dual;
SELECT REPLACE('a-b-c','-','+')FROM dual;
SELECT CONCAT('Hi','oracle')FROM dual;
SELECT LPAD('99',5,'0')FROM dual;
SELECT RPAD('Hu',5,'!')FROM dual;
SELECT TRANSLATE('12345','123','ABC')FROM dual;

--오라클 날짜함수
SELECT SYSDATE AS 현재시간 FROM dual;
SELECT CURRENT_DATE FROM dual;
SELECT SYSTIMESTAMP FROM dual;
SELECT ADD_MONTHS(SYSDATE,3)AS 세달후 FROM dual;
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('2025-01-01','YYYY-MM-DD'))AS 개월차이 FROM dual;
SELECT NEXT_DAY(SYSDATE,'월요일')AS 다음월요일 FROM dual;
SELECT LAST_DAY(SYSDATE) AS 이달마지막날 FROM dual;
SELECT ROUND(SYSDATE,'MONTH')AS 반올림결과 FROM dual;
SELECT EXTRACT(YEAR FROM SYSDATE) AS 년도 FROM dual;
SELECT EXTRACT(MONTH FROM SYSDATE) AS 년도 FROM dual;
SELECT EXTRACT(DAY FROM SYSDATE) AS 년도 FROM dual;
SELECT TO_DATE('2025-03-24','YYYY-MM-DD')AS 날짜변환 FROM dual;
SELECT TO_CHAR(SYSDATE, 'YYY/MM/DD HH24:MI:SS')FROM dual;
SELECT SYSDATE - To_DATE('2025-02-27','YYYY-MM-DD')FROM dual;

SELECT To_CHAR(TO_NUMBER(1234.5678),'9999.999')FROM dual;
SELECT To_CHAR(TO_NUMBER(1234.5678),'9999.9999')FROM dual;
SELECT To_CHAR(TO_NUMBER(1234.5678),'999.999')FROM dual;
SELECT empno,ename,TO_CHAR(TO_NUMBER(sal),'$999')salary FROM emp;


SELECT ename,NVL(MGR,0)FROM emp; --NVL null값을 다른 값으로 바꾼다
SELECT ename,mgr FROM emp;

SELECT ename,job,comm ,sal FROM emp;
SELECT ename, job,NVL2(comm,sal+comm,sal)FROM emp;



--========================================================================
--1. 부서의 부서이름과 지역을 검색하시오
SELECT dname,loc FROM dept;
--2. 사원들의 입사일을 중복을 제거하고 검색하시오
SELECT DISTINCT hiredate FROM emp;
--3. 사원들의 부서번호 중복을 제거하고 검색하시오.
SELECT DISTINCT deptno FROm emp;
--4. 사원들의 6개월 급여의 합을 검색하시오
SELECT SUM(sal)/2 FROM emp;
--5. 사원이름을 'Name'으로 사원의 급여를 'Salary'로 열의 이름을 부여하고 검색하시오.
SELECT ename AS Name,sal AS Salary FROM emp;
--6. 부서번호,부서이름,지역을 한글제목으로 검색하시오
SELECT deptno AS 부서번호,dname AS 부서이름 ,loc AS 지역 FROM dept;
--7. 사원의 직무와 사원이름을 하벼서 검색하이오(예:PRESIDENTKING)
SELECT job||ename FROM emp;
--8. 10번 부서에서 근무하는 사원의 이름을 검색하시오
SELECT ename FROM emp
WHERE deptno = '10';
--9. 급여가 2000이상인 사원들의 사원번호, 사원이름을 검색하시오
SELECT empno,ename FROM emp
WHERE sal >= 2000;
--10. 사원 직무가 'CLERK'인 사원들의 사원번호,사원이름을 검색하시오
SELECT empno,ename FROM emp
WHERE job = 'CLERK';
--11. 1980년 12월 17일에 입사한 사원의 이름을 검색하시오
SELECT ename FROM emp
WHERE hiredate ='1980-12-17';
--12. 부서번호 30이외의 부서이름과 지역을 검색하시오
SELECT dname,loc FROM dept
WHERE deptno != 30;
--13. 'WORD'를 'WARD'로 수정하고 'WARD'사원의 모든 정보를 검색하시오
UPDATE emp
SET ename = 'WARD'
WHERE ename = 'WORD';
SELECT * FROM emp
WHERE ename= 'WARD';

SELECT empno,
       REPLACE(ename, 'WORD', 'WARD') AS ename,
       job, mgr, hiredate, sal, comm, deptno
FROM emp
WHERE ename = 'WORD';
--14. 10번 부서에 근무하는 MANAGER의 사원이름을 검색하시오
SELECT ename FROM emp
WHERE deptno = 10 AND job ='MANAGER';
--15. 급여가 2000이상이며,30번부서에 근무하는 사람들의 사원번호와 사원이름을 검색하시오
SELECT empno,ename FROM emp
WHERE sal >=2000 AND deptno =30; 
--16. 20부서 외에 근무하는 MANAGER의 사원이름을 검색하시오
SELECT ename FROM emp
WHERE deptno != 20 AND job = 'MANAGER';
--17. SALESMAN의 급여가 1500이상인 사원이름을 검색하시오
SELECT ename FROM emp
WHERE job = 'SALESMAN' AND sal >=1500;
--18. 사원번호가 75XX인 사원의 사원번호,사원이름,부서번호를 검색하시오
SELECT empno, ename,deptno FROM emp
WHERE empno LIKE '75%';
--19.부서번호가 10 또는 30에 근무하는 사원들의 사원이름과 급여를 검색하시오.
SELECT ename,sal FROM emp
WHERE deptno =10 OR deptno =30;
--20. 상급자 사원번호가 76으로 시작하는 사원들의 사원이름을 검색하이오
SELECT ename FROM emp
WHERE mgr LIKE '76%';

--21. 1981년 2월에 입사한 사원의사원번호, 사원이름,부서번호을 검색하시오
SELECT empno,ename,deptno FROM emp
WHERE hiredate = TO_DATE('02-1981','mm-yyyy');

--22. 사원이름 중간에 'A'가 들어있는 사원의 사원번호 사원이름을 검색하시오
SELECT empno,ename FROM emp
WHERE ename LIKE '%A%';
--23. 상급자 사원번호가 NULL인 사원의 사원번호와 사원이름을 검색하시오
SELECT empno,ename FROM emp
WHERE mgr is Null;
--24. 상급자 사원번호가 NULL이 아닌 사원의 사원번호와 사원이름 상급자사원번호를 검색하시오
SELECT empno,ename,mgr FROM emp
WHERE mgr is not Null;
--25. 사원들의 사원번호와 사원이름을 사원번호 순으로 검색하시오(오름차순)
SELECT empno,ename FROM emp
ORDER BY empno ASC;
--26. 사원들의 정보를 사원직무별 급여순으로 많은순으로 검색하시오
SELECT job, MAX(sal) AS target FROM emp
GROUP BY job
ORDER BY target DESC;
--27. 사원들의 사원이름을 소문자로 검색하시오.
SELECT LOWER(ename) FROM emp;
--28. 사원들의 사원이름,사원직무를 대문자로 검색하시오
SELECT UPPER(ename),UPPER(job) FROM emp;
--29. 사원들의 사원이름을 첫 자만 대문자로 검색하시오.
SELECT INITCAP(ename) FROM emp;
--30. 사원들의 사원이름과 사원직무를 연결(concat)하여 검색하시오
SELECT CONCAT(ename,job)FROM emp;
--31. 사원들의 사원이름과 사원이름의 첫 두글자를 검색하시오
SELECT SUBSTR(ename,1,2)FROM emp;
--32. 사원들의 사원이름,사원직무 그리고 사원직무의 두번째부터 세글자를 검색하시오
SELECT SUBSTR(ename,2,3),SUBSTR(job,2,3)FROM emp;
--33. 사원들의 사원이름과 사원이름의 길이를 검색하시오.
SELECT ename,LENGTH(ename)FROM emp;
--34. 사원들의 사원이름에 'A'가 몇 번째 위치에 있는지 검색하시오
SELECT INSTR(ename,'A') FROM emp;
--35. 사원이름을 15자리로 하고, 뒤에 '&'를 채워 검색하시오
SELECT LPAD(ename,15,'&')FROM emp;
--36. 사원직무를 20자리로 하고, 앞에 '%'를 채워 검색하시오
SELECT RPAD(ename,20,'%')FROM emp;
--37. 사원의 사원번호, 사원이름, 급여를 검색하시오(급여는 두 번째 자리에서 반올림함 예 2570 - >2600)
SELECT empno,ename,ROUND(sal,-2) FROM emp;
--38. 사원의 사원번호, 사원이름, 급여를 검색하시오(급여는 두 번째 자리에서 절삭함)
SELECT empno,ename,TRUNC(sal,-2) FROM emp;
--39. 사원번호와 급여를 100으로 나눈 나머지를 검색하시오
SELECT empno,MOD(sal,100) FROM emp;
--40. 사원번호, 사원이름, 입사일, 입사 후 100일의 날짜를 검색하시오.
SELECT empno,ename,hiredate,hiredate+100 FROM emp;
--41. 사원번호, 사원이름, 입사일, 근무일자를 계산하여 검색하시오
SELECT empno,ename,hiredate, ROUND(CURRENT_DATE-hiredate)AS 근무일자 FROM emp;
--42. 사원들의 입사일에 3달째 되는 날짜를 검색하시오.
SELECT ADD_MONTHS(hiredate,3)AS 세달후 FROM emp;
--43. 상급자 사원번호가 없는 사원의 경우 '상급자없음'을 나타내도록 하시오
SELECT NVL(mgr,'상급자없음')FROM emp;
--44. 커미션을 포함한 급여를 사원번호, 사원이름과 함께 검색하시오
SELECT empno, ename,NVL2(comm,sal+comm,sal)FROM emp;
--45. 커미션을 포함한 연봉를 사원번호, 사원이름과 함께 검색하시오
SELECT empno, ename,NVL2(comm,sal+comm,sal)*12 FROM emp;
--46. 10, 20번 부서 사원들 중 최고 급여를 받는 사원의 사원번호,사원이름,급여를 검색하시오
SELECT empno, ename, sal
FROM emp
WHERE deptno = 10 AND deptno = 20 
AND sal = (SELECT MIN(sal) FROM emp WHERE  deptno = 10 AND deptno = 20 );
--47. 30번의 부서의 사원 중 최저 급여를 받는 사원의 사원번호, 사원이름 급여를 검색하시오
SELECT empno, ename, sal
FROM emp
WHERE deptno = 30 
AND sal = (SELECT MIN(sal) FROM emp WHERE deptno = 30);
--48. 전체 사원들 중 최고 커미션을 받는 사원의 사원번호, 사원이름, 커미션을 검색하시오
SELECT empno,ename,comm FROM emp
WHERE comm = (SELECT MAX(comm) FROM emp);
--49. 전체 사원들 중 최저 커미션을 받는 사원의 사원번호, 사원이름, 커미션을 검색하시오
SELECT empno,ename,comm FROM emp
WHERE comm = (SELECT MIN(comm) FROM emp);
--50. 전체 사원의 입사일 중 MAX와 MIN 값을 검색하시오
SELECT DISTINCT hiredate FROM emp
WHERE hiredate = (SELECT MAX(hiredate) FROM emp);
SELECT DISTINCT hiredate FROM emp
WHERE hiredate = (SELECT MIN(hiredate) FROM emp);
--51. 사원번호의 MAX와 MIN값을 검색하시오
SELECT DISTINCT empno FROM emp
WHERE empno = (SELECT MAX(empno) FROM emp);
SELECT DISTINCT empno FROM emp
WHERE empno = (SELECT MIN(empno) FROM emp);
--52. 상급자 사원번호 열의 개수를 검색하시오.
--53. 사원이름의 개수를 검색하시오
--54. 사원 테이블의 튜플 수를 검색하시오
--55. 부서별 사원들의 인원수를 검색하시오
--56. 상급자 사원번호별 사원들의 인원수를 검색하시오
--57. 부서별 사원들의 평균급여를 검색하시오
--58. 부서별 사원직무별 사원의 급여합를 검색하시오
--59. 부서별 사원직무별 사원들의 평균 급여를 검색하시오
--60. 부서별 사원직무별 사원들의 입사일의 MIX와 MIN값을 검색하시오

SELECT e.*,d.*FROM emp e,dept d
WHERE e.deptno = d.deptno;

SELECT e.empno,e.ename,e.job,d.deptno FROM emp e,dept d
WHERE e.deptno = d.deptno
ORDER BY d.deptno;

SELECT d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND e.ename = 'JONES';

SELECT d.dname FROM emp e,dept d
WHERE e.deptno = d.deptno 
AND d.dname = ( 
    SELECT d2.dname 
    FROM emp e2, dept d2
    WHERE e2.deptno = d2.deptno 
    AND e2.ename = 'JONES'
    );
    
