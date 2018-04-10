package com.depromeet.team.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Comment {

    @JsonIgnore
    private Long seq;
    @JsonProperty("movie_seq")
    private Long movieSeq;
    private String nickname;
    private String content;
    @JsonIgnore
    private LocalDate createdDate;
    @JsonIgnore
    private LocalDate modifiedDate;

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setMovieSeq(Long movieSeq) {
        this.movieSeq = movieSeq;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getSeq() {
        return seq;
    }

    public Long getMovieSeq() {
        return movieSeq;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }
}
