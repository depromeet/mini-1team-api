CREATE TABLE COMMENT
(
  seq             BIGINT AUTO_INCREMENT COMMENT '시퀀스' PRIMARY KEY,
  movie_seq       BIGINT      NULL COMMENT '영화 시퀀스',
  nickname        VARCHAR(45) NULL COMMENT '닉네임',
  content         VARCHAR(45) NULL COMMENT '내용',
  create_datetime DATETIME    NULL COMMENT '생성날짜',
  modify_date     DATETIME    NULL COMMENT '수정날짜'
) COMMENT '영화 댓글';

CREATE TABLE MEMBER
(
  uid           BIGINT       NOT NULL COMMENT '고유 ID' PRIMARY KEY,
  name          VARCHAR(45)  NULL COMMENT '이름',
  gender        VARCHAR(45)  NULL COMMENT '성별',
  date_of_birth DATETIME     NULL COMMENT '생년월일',
  nickname      CHAR(2)      NULL COMMENT '닉네임',
  keywords      VARCHAR(255) NULL COMMENT '키워드',
  join_date     DATETIME     NULL COMMENT '가입날짜'
) COMMENT '사용자';