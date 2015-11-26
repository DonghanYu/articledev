
/* Drop Tables */

DROP TABLE article_section_info CASCADE CONSTRAINTS;
DROP TABLE category_info CASCADE CONSTRAINTS;
DROP TABLE k_comment CASCADE CONSTRAINTS;
DROP TABLE k_article CASCADE CONSTRAINTS;
DROP TABLE k_user CASCADE CONSTRAINTS;
DROP TABLE user_level_info CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_no;

/* Create Sequences */

CREATE SEQUENCE seq_no;



/* Create Tables */

CREATE TABLE article_section_info
(
	sno number NOT NULL,
	sname varchar2(100) NOT NULL,
	PRIMARY KEY (sno)
);


CREATE TABLE category_info
(
	cno number NOT NULL,
	cname varchar2(100) NOT NULL,
	PRIMARY KEY (cno)
);


CREATE TABLE k_article
(
	no number NOT NULL,
	sno number NOT NULL,
	cno number NOT NULL,
	lno number DEFAULT 1 NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	count number DEFAULT 0 NOT NULL,
	article_like number DEFAULT 0 NOT NULL,
	article_dislike number DEFAULT 0 NOT NULL,
	img_url varchar2(500) UNIQUE,
	user_nick varchar2(50) NOT NULL UNIQUE,
	PRIMARY KEY (no)
);


CREATE TABLE k_comment
(
	comment_no number NOT NULL,
	comment_content varchar2(1000) NOT NULL,
	comment_regdate date DEFAULT sysdate NOT NULL,
	comment_like number DEFAULT 0 NOT NULL,
	comment_dislike number DEFAULT 0 NOT NULL,
	comment_img_url varchar2(500) UNIQUE,
	user_nick varchar2(50) NOT NULL UNIQUE,
	no number NOT NULL,
	PRIMARY KEY (comment_no)
);


CREATE TABLE k_user
(
	user_nick varchar2(50) primary key,
	user_id varchar2(50) NOT NULL UNIQUE,
	user_pw varchar2(150) NOT NULL,
	user_level number DEFAULT 1 NOT NULL,
	like_dislike number DEFAULT 0 NOT NULL,
	article_count number DEFAULT 0 NOT NULL,
	prep varchar2(50)
);


CREATE TABLE user_level_info
(
	lno number NOT NULL,
	lname varchar2(100) NOT NULL,
	PRIMARY KEY (lno)
);



/* Create Foreign Keys */

ALTER TABLE k_comment
	ADD FOREIGN KEY (no)
	REFERENCES k_article (no)
;


ALTER TABLE k_article
	ADD FOREIGN KEY (user_nick)
	REFERENCES k_user (user_nick)
;


ALTER TABLE k_comment
	ADD FOREIGN KEY (user_nick)
	REFERENCES k_user (user_nick)
;

--정보테이블 정보삽입
insert into  ARTICLE_SECTION_INFO(sno, sname) values(1, 'opinion');
insert into  ARTICLE_SECTION_INFO(sno, sname) values(2, 'news');

insert into  USER_LEVEL_INFO(lno, lname) values(1, '예비언론인');
insert into  USER_LEVEL_INFO(lno, lname) values(2, '기자');
insert into  USER_LEVEL_INFO(lno, lname) values(3, '주필'); 
insert into  USER_LEVEL_INFO(lno, lname) values(4, '논설위원');
insert into  USER_LEVEL_INFO(lno, lname) values(5, '편집장');

insert into CATEGORY_INFO(cno, cname) values(1, 'politics');
insert into CATEGORY_INFO(cno, cname) values(2, 'economics');
insert into CATEGORY_INFO(cno, cname) values(3, 'society');
insert into CATEGORY_INFO(cno, cname) values(4, 'culture');
insert into CATEGORY_INFO(cno, cname) values(5, 'IT');

--Dummy 계정 삽입. user_level 5개 표현.
select * from K_USER;

insert into K_USER(user_nick, user_id, user_pw, user_level, like_dislike, article_count, prep)
values('DH','realtiger0982@gmail.com', '1234', 1, 30, 50, '예비저장소');
insert into K_USER(user_nick, user_id, user_pw, user_level, like_dislike, article_count, prep)
values('정치왕자','realtiger0983@pmail.com', '1234', 2, 40, 60, '예비저장소');
insert into K_USER(user_nick, user_id, user_pw, user_level, like_dislike, article_count, prep)
values('경제왕자','realtiger0984@kmail.com', '1234', 3, 60, 100, '예비저장소');
insert into K_USER(user_nick, user_id, user_pw, user_level, like_dislike, article_count, prep)
values('사회왕자','realtiger0985@umail.com', '1234', 4, 90, 170, '예비저장소');
insert into K_USER(user_nick, user_id, user_pw, user_level, like_dislike, article_count, prep)
values('IT왕자','realtiger0986@wmail.com', '1234', 5, 120, 180, '예비저장소');

--Dummy Article삽입. section별.category별.
select * from K_ARTICLE;

insert into K_ARTICLE
	(no, sno, cno, lno, title, content, count, article_like, article_dislike, user_nick)
	values(1, 1, 5, 5, '샤오미배터리', '샤오미의배터리는...정말...~적이다.', 15, 8, 2, 'IT왕자');
insert into K_ARTICLE
	(no, sno, cno, lno, title, content, count, article_like, article_dislike, user_nick)
	values(2, 1, 1, 2, '나의 민주주의란', '데모크라시의 비밀...', 100, 48, 46, '정치왕자');
insert into K_ARTICLE
	(no, sno, cno, lno, title, content, count, article_like, article_dislike, user_nick)
	values(3, 2, 2, 3, '2015 1/4분기 무역수지 대폭 상승', '전년 동분기 수출폭의 큰 상승으로...', 15, 9, 1, '경제왕자');
insert into K_ARTICLE
	(no, sno, cno, lno, title, content, count, article_like, article_dislike, user_nick)
	values(4, 2, 3, 4, '경기도 xx시 노부부 자살', '생활고로 인한...', 22, 16, 0, '사회왕자');
insert into K_ARTICLE
	(no, sno, cno, lno, title, content, count, article_like, article_dislike, user_nick)
	values(5, 1, 4, 1, '대학로의 예술', '대학로 극단의 열악한 환경에도 불구하고...', 35, 30, 3, 'DH');

--Dummy Comment삽입.
select * from K_COMMENT;

insert into K_COMMENT
	(comment_no, comment_content, user_nick, no)
	values(1, '역시 IT왕자님의 필력...ㅎㄷㄷ', '정치왕자', 1);
insert into K_COMMENT
	(comment_no, comment_content, user_nick, no)
	values(2, '역시 IT왕자님의 필력..!!쩔어!!', '경제왕자', 1);
insert into K_COMMENT
	(comment_no, comment_content, user_nick, no)
	values(3, '역시 경제왕자님 빠른 팩트', 'DH', 3);
insert into K_COMMENT
	(comment_no, comment_content, user_nick, no)
	values(4, '역시 경제왕자님 스피드ㅎㄷㄷ', 'IT왕자', 3);


	