-- 2021.06.11

--JOIN 

-- CROSS JOIN
-- 스키마의 합 : 집합의 곱 연산과 같다.

select *
from emp, dept
where emp.deptno = dept.deptno
;

-- 이름이  SCOTT인 사람의 where e.name='SCOTT'
-- 부서명을 출력해봅시다.
-- 출력해야한는 컬럼을 가지는 테이블을 확인해보자
-- 이름 : EMP, 부서명 dept

select e.ename, d.dname, d.deptno
from emp e, dept d
where e.deptno = d.deptno -- and ename= 'SCOTT'
order by d.dname, e.ename
;

-- self JOIN : 자기 자신을 조인 ( 참조 )
-- emp -> mgr 컬럼이 emp.empno 참조
select e.empno, e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr = m.empno(+)
;
