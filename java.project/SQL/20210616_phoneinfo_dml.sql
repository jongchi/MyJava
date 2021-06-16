-- 2021.06.16
-- DML - PhoneInfo

-- 1. phoneInfo_basic 테이블의 select, update, delete, insert 하는 SQL
desc phoneInfo_basic;

select * from phoneInfo_basic;

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email)
    values(1, '홍길동', '010-1234-5678', 'gildong@naver.com');

insert into phoneInfo_basic
    values(2, '이순신', '010-1234-5555', 'sslee@naver.com', '인천', sysdate);

insert into phoneInfo_basic
    values(3, '정약용', '010-1234-2222', 'yong@naver.com', '수원', sysdate);


update phoneInfo_basic
set fr_address = '서울'
where fr_name='홍길동'
;

select fr_name, fr_address 
from phoneInfo_basic 
where idx=1;

delete from phoneInfo_basic
where fr_address='서울'
;

select * from phoneInfo_basic;

-- 2. phoneInfo_univ 테이블의 select, update, delete, insert 하는 SQL
desc phoneInfo_univ;

insert into phoneInfo_univ
    values(1, '군사학과', 4, 2);

insert into phoneInfo_univ
    values(2, '경제학과', 2, 3);

update phoneInfo_univ
set fr_u_major = '해양경찰학과'
where fr_u_major = '군사학과'
;

delete from phoneInfo_univ
where idx=2
;

select * 
from phoneInfo_basic b, phoneInfo_univ u
where b.idx = u.fr_ref
;

-- 3. phoneInfo_com 테이블의 select, update, delete, insert 하는 SQL
desc phoneInfo_com;

insert into phoneInfo_com
values (1, '다산기업', 3);

insert into phoneInfo_com
values (2, '다산농업', 3);

delete from phoneInfo_com
where fr_c_company = '다산농업';

update phoneInfo_com
set fr_c_company='다산중공업'
where idx=1
;

select * 
from phoneInfo_basic b, phoneInfo_com c
where b.idx = c.fr_ref
;

