-- 20210622
-- One bit Class 테이블 생성

create table classmember (   -- 수강생 정보 저장
    mno number(4) constraint classmember_mno_pk primary key, -- 회원번호
    mid varchar2(20) not null,      -- ID
    mpw varchar2(20) not null,      -- 비밀번호
    mname varchar2(20) not null,    -- 이름
    mdate date,                     -- 생년월일 
    mloc varchar2(20),              -- 선호 지역
    mpoint integer                  -- 보유 포인트
);

create table teacher (              -- 강사 정보 저장
    tno number(4) constraint teacher_tno_pk primary key, -- 강사 번호
    tid varchar2(20) not null,      -- ID
    tpw varchar2(20) not null,      -- 비밀번호
    tname varchar2(20) not null,    -- 이름
    tpoint integer                  -- 보유 포인트
);

create table bitclass (             -- 강좌 정보 저장     
    cno number(4) constraint bitclass_cno__pk primary key, -- 강좌 번호
    cloc varchar2(20) not null, -- 강좌 지역
    startdate date not null, -- 강좌 시작일
    enddate date not null, -- 강좌 종료일
    fee integer not null, -- 수강료
    rate number(2), -- 평점
    numpeople number(2) not null, -- 수강 인원
    tno number(4) constraint bitclass_tno_fk references teacher(tno) -- 강사 번호
);

create table classorder ( -- 수강 신청 
    orderno number(4) constraint classorder_on_pk primary key, -- 신청번호
    mno number(4) constraint classorder_mno_fk references classmember(mno), -- 회원 번호
    cno number(4) constraint classorder_cno_fk references bitclass(cno), -- 강좌 번호
    orderdate date default sysdate -- 신청일
);