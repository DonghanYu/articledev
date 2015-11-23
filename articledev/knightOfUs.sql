
/* Drop Tables */

DROP TABLE article_section_info CASCADE CONSTRAINTS;
DROP TABLE category_info CASCADE CONSTRAINTS;
DROP TABLE k_comment CASCADE CONSTRAINTS;
DROP TABLE k_article CASCADE CONSTRAINTS;
DROP TABLE k_user CASCADE CONSTRAINTS;



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
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	count number DEFAULT 0 NOT NULL,
	article_like number DEFAULT 0 NOT NULL,
	article_dislike number DEFAULT 0 NOT NULL,
	img_url varchar2(200) UNIQUE,
	user_id varchar2(20) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE k_comment
(
	comment_no number NOT NULL,
	comment_content varchar2(1000) NOT NULL,
	comment_regdate date NOT NULL,
	comment_like number DEFAULT 0 NOT NULL,
	comment_dislike varchar2(100) DEFAULT '0' NOT NULL,
	comment_img_url varchar2(200) UNIQUE,
	no number NOT NULL,
	user_id varchar2(20) NOT NULL,
	PRIMARY KEY (comment_no)
);


CREATE TABLE k_user
(
	user_id varchar2(20) NOT NULL,
	user_nick varchar2(20) NOT NULL UNIQUE,
	user_pw varchar2(128) NOT NULL,
	user_level number DEFAULT 1 NOT NULL,
	like_dislike number DEFAULT 0 NOT NULL,
	article_count number DEFAULT 0 NOT NULL,
	prep varchar2(50),
	PRIMARY KEY (user_id)
);



/* Create Foreign Keys */

ALTER TABLE k_comment
	ADD FOREIGN KEY (no)
	REFERENCES k_article (no)
;


ALTER TABLE k_article
	ADD FOREIGN KEY (user_id)
	REFERENCES k_user (user_id)
;


ALTER TABLE k_comment
	ADD FOREIGN KEY (user_id)
	REFERENCES k_user (user_id)
;



