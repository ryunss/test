use gb;

create table spring_user(
	userid varchar(300) primary key,
    userpw varchar(300) not null,
    username varchar(300) not null
);

create table spring_board(
	boardnum bigint primary key auto_increment,
    boardtitle varchar(300) not null,
    boardcontents text not null,
    regdate datetime default now(),
    updatedate datetime default now(),
    userid varchar(300)
);

create table spring_reply(
	replynum bigint primary key auto_increment,
    replycontents varchar(3000) not null,
	regdate datetime default now(),
    updatedate datetime default now(),
    userid varchar(300),
    boardnum bigint
);

select * from spring_user;
select * from spring_board;

insert into spring_board (boardtitle, boardcontents, userid)
values('테스트 제목1', '테스트 내용1', 'apple');
insert into spring_board (boardtitle, boardcontents, userid)
values('테스트 제목2', '테스트 내용2', 'banana');
insert into spring_board (boardtitle, boardcontents, userid)
values('테스트 제목3', '테스트 내용3', 'cherry');
insert into spring_board (boardtitle, boardcontents, userid)
values('apple ggg', 'banana ggg', 'durian');

insert into spring_board(boardtitle, boardcontents, userid)
(select boardtitle, boardcontents, userid from spring_board);