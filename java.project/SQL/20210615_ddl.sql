--2021.06.15

-- DDL : 데이터 정의어

-- 테이블 생성 : CREATE TABLE 
-- 테이블 수정 : ALTER TABLE
-- 테이블 삭제 : DROP TABLE

-- CREATE TABLE (
--       컬럼이름 타입(사이즈) 제약조건 정의 ,
--      .......,
-- )

-- CREATE TABLE (
--      컬럼이름 타입(사이즈) ,  --> 컬럼 타입 정의, 도메인 정의
--      .......,
--      제약조건 정의,          --> 제약 조건 정의
-- )

-- 사원 테이블과 유사한 구조의
-- 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된
-- EMP01(테이블 이름) 테이블을 생성해 봅시다.

create table emp01 (
    empno number(4),    -- 사원번호
    ename varchar2(20), -- 사원의 이름
    sal number(6,2)
);

-- 서브 쿼리를 이용해서 기존 테이블의 구조를 복사하고 해당 튜플도 복사
-- 내용은 모두 가져오지만 제약 조건은 가져오지 않는다. (데이터 백업 용도로 사용)
create table emp02 
as 
select * from emp
;

select * from emp02;

create table emp03
as
select empno, ename, sal from emp
;
select * from emp03;

create table emp04
as
select * from emp where deptno = 30
;
select * from emp04;

create table emp05
as
select *from emp where 1=2
;

select * from emp05;

-- 테이블의 변경 : alter table
-- alter table(테이블 이름) add
-- alter table(테이블 이름) modify
-- alter table(테이블 이름) drop

-- emp01 테이블에 jon 컬럼을 추가해보자.
alter table emp01
add(job varchar2(9))
;
desc emp01;

-- emp01 테이블의 job 컬럼의 사이즈를 수정 9-> 30
alter table emp01
modify (job varchar2(30)not null)
;

-- emp01 테이블의 job 컬럼을 삭제
alter table emp01 
drop column job
;

-- 테이블 삭제
drop table emp06;
drop table emp05;
drop table emp02;

-- 새로운 테이블 생성
create table emp02
as
select * from emp
;
select * from emp02;

-- 모든 행을 삭제 truncate : 롤백이 안됨
truncate  table emp02;

-- 테이블의 이름 변경 -> rename 현재 이름 to 새로운 이름
rename emp01 to test;
desc test;

drop table emp02;

create table emp02 
as
select empno, ename, sal, job from emp where 1=0
;

-- 컬럼 레벨에서 제약 사항 정의
create table emp02 (
    empno number(4) constraint emp02_empno_pk primary key, --not null unique,
    ename varchar(20) constraint emp02_ename_nn not null,
    sal number(6,2) constraint emp02_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20) default '미지정',
    deptno number constraint emp02_deptno_fk references dept(deptno)
);

desc emp02;

insert into emp02 (empno, ename, sal, job, deptno) 
                    values(2000, 'SON', 4000, 'MANAGER', 40);
insert into emp02 values(null, null, 10000, 'MANAGER'); -- 모든 컬럼에 데이터를 입력할 때는 컬럼명 삭제 가능

select * from emp02;

-- 테이블 레벨에서 제약 사항 정의
create table emp03 (
    empno number(4), -- constraint emp02_empno_pk primary key, --not null unique,
    ename varchar(20) constraint emp03_ename_nn not null, -- not null 제약은 컬럼 레벨에서만 정의 가능
    sal number(6,2) constraint emp03_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20), -- default '미지정',
    deptno number, -- constraint emp02_deptno_fk references dept(deptno),
    ------------------------------------------------------------------
    -- 제약 정의
    constraint emp03_empno_pk primary key(ename), -- PK 제약
    constraint emp03_deptno_fk foreign key(deptno) references dept(deptno)   
);