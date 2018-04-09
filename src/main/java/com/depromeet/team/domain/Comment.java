package com.depromeet.team.domain;

import java.time.LocalDateTime;

public class Comment {
	// 시퀀스
	private long seq;
	
	private long movie_seq;
	
	// 닉네임
	private String nickname;

	// 내용
	private String content;

	// 생성날짜
	private LocalDateTime createDatetime;

	// 수정날짜
	private LocalDateTime modifyDate;

	public long getSeq() {
	    return seq;
	}

	public void setSeq(long seq) {
	    this.seq = seq;
	}	

	public long getMovie_seq() {
		return movie_seq;
	}

	public void setMovie_seq(long movie_seq) {
		this.movie_seq = movie_seq;
	}

	public String getNickname() {
	    return nickname;
	}

	public void setNickname(String nickname) {
	    this.nickname = nickname;
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public LocalDateTime getCreateDatetime() {
	    return createDatetime;
	}

	public void setCreateDatetime(LocalDateTime createDatetime) {
	    this.createDatetime = createDatetime;
	}

	public LocalDateTime getModifyDate() {
	    return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
	    this.modifyDate = modifyDate;
	}

	// Comment 모델 복사
	public void CopyData(Comment param)
	{
	    this.seq = param.getSeq();
	    this.nickname = param.getNickname();
	    this.content = param.getContent();
	    this.createDatetime = param.getCreateDatetime();
	    this.modifyDate = param.getModifyDate();
	}

	@Override
	public String toString() {
		return "Comment [seq=" + seq + ", movie_seq=" + movie_seq + ", nickname=" + nickname + ", content=" + content
				+ ", createDatetime=" + createDatetime + ", modifyDate=" + modifyDate + "]";
	}
	
}
