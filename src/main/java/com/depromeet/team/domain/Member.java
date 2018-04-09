package com.depromeet.team.domain;

import java.time.LocalDate;
import java.util.List;

public class Member {

    private Long uid;
    private String name;
    private String gender;
    private LocalDate dateOfBirth;
    private String nickname;
    private List<String> keywords;

    protected Member() { }

    public Member(Long uid, String name, String gender, LocalDate dateOfBirth, String nickname, List<String> keywords) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nickname = nickname;
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
