-- 2021.06.18

-- JDBC 

select * from dept01;

insert into dept01 values (dept01_deptno_seq.nextval, 'dev', 'SEOUL');

-- dept01 deptno에 입력할 일련 번호 -> sequence

create sequence dept01_deptno_seq
start with 10
increment by 10
;

delete from dept01 where deptno=?;

update dept01 set dname=?, loc=? where deptno=?;

select * from dept;

delete from dept
where deptno = 50;

select dept01_deptno_seq.nextval from dual;