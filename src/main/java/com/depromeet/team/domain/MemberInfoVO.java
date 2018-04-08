package com.depromeet.team.domain;

public class MemberInfoVO {
	private String name;
	private Integer age;
	private String gender;
	private String nickname;
	private String keyword;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "MemberInfoVO [name=" + name + ", age=" + age + ", gender=" + gender + ", nickname=" + nickname
				+ ", keyword=" + keyword + "]";
	}
}
