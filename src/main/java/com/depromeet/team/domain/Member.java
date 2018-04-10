package com.depromeet.team.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

public class Member {

    private Long uid;
    private String name;
    private String gender;
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;
    private String nickname;
    private List<String> keywords;

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNickname() {
        return nickname;
    }

    public List<String> getKeywords() {
        return keywords;
    }
}
