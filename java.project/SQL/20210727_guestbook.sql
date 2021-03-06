create table project.guestbook_message (
	messageId int not null auto_increment primary key,
    guestName varchar(20) not null,
    password varchar(20) not null,
    message text not null,
    regdate timestamp default current_timestamp
);

-- select 
select * from project.guestbook_message order by regdate desc;
-- limit index, count : 페이징 처리
select * from project.guestbook_message order by regdate desc limit 3, 3;
-- 전체 게시물의 개수
select count(*) from project.guestbook_message;
-- messageid로 게시물 검색
select * from project.guestbook_message where messageid="3";

-- insert
insert into project.guestbook_message (guestName, password, message)
values ('king', '1111', 'Hello');

-- update
update project.guestbook_message 
set guestName='scott', password='0000', message='안녕하세요'
where messageId=1;

-- delete
delete from project.guestbook_message where messageId=1;