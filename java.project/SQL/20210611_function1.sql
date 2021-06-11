-- 2021.06.11

-- 형변환 함수
-- 날짜->문자, 
-- to_char(날짜 데이터, 패턴), to_char(숫자, '패턴')
select sysdate, to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

select ename, hiredate, to_char(hiredate, 'YYYY.MM.DD.') as day
from emp;

select * from orders;
select orderid, orderdate, to_char(orderdate, 'YYYY.MM.DD')
from orders
;

--  숫자->문자
select to_char(123456, '0,000,000,000'), to_char(123456, 'L9,999,999,999')
from dual;

select empno, ename, sal, to_char(sal*1100, 'L999,999,999')
from emp;

-- '1,000,000' + 100000
-- 문자->숫자,
-- to_number(문자열, 패턴)
select to_number('1,000,000', '9,999,999'), to_number('1,000,000', '9,999,999')+100000
from dual;

-- 문자->날짜
-- to_date(문자열, 패턴)
select to_date('2012-05-17', 'YYYY-MM-DD'), trunc((sysdate-to_date('2012-05-17', 'YYYY-MM-DD'))/365) as age
from dual;

-- decode 함수 : 분기를 위해 사용 switch-case 유사
-- decode(컬럼 이름, = 조건1 값, 조건1이 참일 때 사용할 값
--                , = 조건2 값, 조건2가 참일 때 사용할 값
--                ,.......
-- )

-- emp 테이블에서 부서번호에 맞는 부서이름 출력
select * from dept;

-- 10 ACCOUNTING
-- 20 RESEARCH
-- 30 SALES
-- 40 OPERATIONS

select ename, deptno, 
        decode(deptno, 10, 'ACCOUNTING',
                      20, 'RESEARCH',
                      30, 'SALES',
                      40, 'OPERATIONS'
        ) AS DNAME
from emp
ORDER BY DNAME;
-- 위 경우, decode보다는 조인이나 서브쿼리를 사용하는게 좋음

-- 8. 직급에 따라 급여를 인상하도록 하자.
-- 직급이 'ANALYST'인 사원은 5%,
--      'SALESMAN'인 사원은 10%,
--      'MANAGER'인 사원은 15%
--      'CLERK'인 사원은 20% 인상한다.

select ename, sal, 
        decode(job, 'ANALYST', sal*1.05, -- 5% 인상
                    'SALESMAN', sal*1.1, -- 10% up
                    'MANAGER', sal*1.15, -- 15% up
                    'CLERK', sal*1.2     -- 20% up
        ) as upsal
from emp;

-- decode는 =(같다)만 가능하다면 
-- case는 =,<,> 비교연산 가능

-- case 함수도 분기할 때 사용
-- case when 조건식 then 참일 때 값
select ename, deptno,
        case when deptno=10 then 'ACCOUNTING'
             when deptno=20 then 'RESEARCH'
             when deptno=30 then 'SALES'
             when deptno=40 then 'OPERATIONS'
        end as deptname
from emp;