CREATE TABLE MEMBER
(
  `uid`        BIGINT         NOT NULL    AUTO_INCREMENT COMMENT '고유 ID',
  `nickname`   VARCHAR(45)    NULL        COMMENT '닉네임',
  `gender`     VARCHAR(45)    NULL        COMMENT '성별',
  `age_range`  VARCHAR(45)    NULL        COMMENT '나이대',
  `join_date`  DATETIME       NULL        COMMENT '가입날짜',
  PRIMARY KEY (uid)
) DEFAULT CHARACTER_SET_CATALOG ;

ALTER TABLE COMMENT COMMENT '사용자';


CREATE TABLE COMMENT
(
  `seq`              BIGINT         NOT NULL    AUTO_INCREMENT COMMENT '시퀀스',
  `movie_seq`        BIGINT         NULL        COMMENT '영화 시퀀스',
  `nickname`         VARCHAR(45)    NULL        COMMENT '닉네임',
  `content`          VARCHAR(45)    NULL        COMMENT '내용',
  `create_datetime`  DATETIME       NULL        COMMENT '생성날짜',
  `modify_date`      DATETIME       NULL        COMMENT '수정날짜',
  PRIMARY KEY (seq)
);

ALTER TABLE COMMENT COMMENT '영화 댓글';