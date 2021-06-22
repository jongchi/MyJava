-- 2021.06.20
-- ncs 데이터베이스 구축

 -- 1. 대리키 IDX, 회원 아이디, 이름, 비밀번호, 사진이름, 가입일 을 저장할 수 있는
 --   이름이 MEMBER인 테이블을 생성하세요.
 --   회원 아이디에는 기본 키 제약설정을 하고, 이름과 비밀번호에는 not null,
 --   가입 일은 기본 값으로 sysdate가 입력되도록 하시오.

create table member (
    idx number(6),
    memberid varchar2(20) constraint member_id_pk primary key,
    membername varchar2(20) not null,
    memberpw varchar2(20) not null,
    picturename varchar2(20),
    joindate date default sysdate
);

-- 2. MEMBER 테이블에서 이름 컬럼으로 인덱스 객체를 생성하시오.

create index idx_member_membername
on member(membername);

-- 3. MEMBER 테이블에서 회원 아이디, 이름, 사진 정보만을 출력하는 view 객체를 생성하시오.
-- view의 이름은 member_view 로 생성하시오.

create view member_view
as
select memberid, membername, picturename
from member;
