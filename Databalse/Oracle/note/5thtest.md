SQL> SELECT  e.ename , e.deptno, d.dname FROM emp e, dept d where e.deptno = d.deptno(+);

ENAME          DEPTNO DNAME
---------- ---------- --------------
SMITH              20 RESEARCH
ALLEN              30 SALES
WARD               30 SALES
JONES              20 RESEARCH
MARTIN             30 SALES
BLAKE              30 SALES
CLARK              10 ACCOUNTING
SCOTT              20 RESEARCH
KING               10 ACCOUNTING
TURNER             30 SALES
ADAMS              20 RESEARCH

ENAME          DEPTNO DNAME
---------- ---------- --------------
JAMES              30 SALES
FORD               20 RESEARCH
MILLER             10 ACCOUNTING

14 rows selected.

SQL> spool off
SQL> SELECT e.ename, d.loc, e.comm FROM emp e, dept d where d.deptno = e.deptno(+) and d.loc = 'CHICAGO' and comm is not null;

ENAME      LOC                 COMM
---------- ------------- ----------
ALLEN      CHICAGO              300
WARD       CHICAGO              500
MARTIN     CHICAGO             1400
TURNER     CHICAGO                0

SQL> spool off
SQL> SELECT e.ename, d.loc FROM emp e, dept d where e.deptno = d.deptno(+) and e.ename like '%A%';

ENAME      LOC
---------- -------------
ALLEN      CHICAGO
WARD       CHICAGO
MARTIN     CHICAGO
BLAKE      CHICAGO
CLARK      NEW YORK
ADAMS      DALLAS
JAMES      CHICAGO

7 rows selected.

SQL> spool off
SQL> select e.empno, e.ename, e.sal, s.grade, d.loc from emp e, salgrade s, dept d
  2   where  e.deptno = d.deptno(+) and e.sal between s.losal and s.hisal
  3   order by s.grade;

     EMPNO ENAME             SAL      GRADE LOC
---------- ---------- ---------- ---------- -------------
      7369 SMITH             800          1 DALLAS
      7900 JAMES             950          1 CHICAGO
      7876 ADAMS            1100          1 DALLAS
      7521 WARD             1250          2 CHICAGO
      7654 MARTIN           1250          2 CHICAGO
      7934 MILLER           1300          2 NEW YORK
      7844 TURNER           1500          3 CHICAGO
      7499 ALLEN            1600          3 CHICAGO
      7782 CLARK            2450          4 NEW YORK
      7698 BLAKE            2850          4 CHICAGO
      7566 JONES            2975          4 DALLAS

     EMPNO ENAME             SAL      GRADE LOC
---------- ---------- ---------- ---------- -------------
      7788 SCOTT            3000          4 DALLAS
      7902 FORD             3000          4 DALLAS
      7839 KING             5000          5 NEW YORK

14 rows selected.

SQL> spool off
SQL> select e.ename, e.empno, e.mgr, m.ename from emp e, emp m, dept d where e.mgr = m.empn d.loc in ('NEW YORK','SHICAGO');

ENAME           EMPNO        MGR ENAME
---------- ---------- ---------- ----------
SMITH            7369       7902 FORD
ALLEN            7499       7698 BLAKE
WARD             7521       7698 BLAKE
JONES            7566       7839 KING
MARTIN           7654       7698 BLAKE
BLAKE            7698       7839 KING
CLARK            7782       7839 KING
SCOTT            7788       7566 JONES
KING             7839
TURNER           7844       7698 BLAKE
ADAMS            7876       7788 SCOTT

ENAME           EMPNO        MGR ENAME
---------- ---------- ---------- ----------
JAMES            7900       7698 BLAKE
FORD             7902       7566 JONES
MILLER           7934       7782 CLARK

14 rows selected.

SQL> spool off
SQL> select e.ename, e.empno, e.mgr, m.ename from emp e, emp m, dept d where e.mgr = m.em pno(+) and (d.loc in 'NEW YORK', 'SHICAGO')Order by e.empno DESC;

ENAME           EMPNO        MGR ENAME
---------- ---------- ---------- ----------
MILLER           7934       7782 CLARK
FORD             7902       7566 JONES
JAMES            7900       7698 BLAKE
ADAMS            7876       7788 SCOTT
TURNER           7844       7698 BLAKE
KING             7839
SCOTT            7788       7566 JONES
CLARK            7782       7839 KING
BLAKE            7698       7839 KING
MARTIN           7654       7698 BLAKE
JONES            7566       7839 KING

ENAME           EMPNO        MGR ENAME
---------- ---------- ---------- ----------
WARD             7521       7698 BLAKE
ALLEN            7499       7698 BLAKE
SMITH            7369       7902 FORD

14 rows selected.

SQL> spool off;
SQL> select e.empno, e.ename, d.dname from emp e, dept d where e.deptno = d.deptno(+);

     EMPNO ENAME      DNAME
---------- ---------- --------------
      7369 SMITH      RESEARCH
      7499 ALLEN      SALES
      7521 WARD       SALES
      7566 JONES      RESEARCH
      7654 MARTIN     SALES
      7698 BLAKE      SALES
      7782 CLARK      ACCOUNTING
      7788 SCOTT      RESEARCH
      7839 KING       ACCOUNTING
      7844 TURNER     SALES
      7876 ADAMS      RESEARCH

     EMPNO ENAME      DNAME
---------- ---------- --------------
      7900 JAMES      SALES
      7902 FORD       RESEARCH
      7934 MILLER

14 rows selected.
