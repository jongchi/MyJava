-- 2021.06.15 
-- DDL 생성하기

create table phoneInfo_basic (
    idx number(6) constraint p_basic_idx_pk primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

create table phoneInfo_univ (
    idx number(6) constraint p_univ_idx_pk primary key,
    fr_u_major varchar2(20) default 'N' constraint p_univ_major_nn not null,
    fr_u_year number(1) default 1 constraint p_univ_year_ck check (fr_u_year>0 and fr_u_year<5) 
                                   not null,
    fr_ref number(6) constraint p_univ_ref_fk references phoneInfo_basic(idx) not null    
);

create table phoneInfo_com (
    idx number(6) constraint p_com_idx_pk primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint p_com_ref_fk references phoneInfo_basic(idx) not null   
);

