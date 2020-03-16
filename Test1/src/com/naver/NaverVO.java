package com.naver;

import java.io.Serializable;

// List Collection으로 회원가입 만들기
// 메뉴 : 회원가입,회원전체출력, 아이디검색...
// 조건 : 회원가입시 아이디는 8~15자 이내, 영문자 숫자 혼용
// ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
// PW1 PW2 비교하여 하나만 저장
// 입력 출력 삭제 아이디검색

public class NaverVO implements Serializable {

	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		
		String str = String.format("ID:%15s PW:%10s 이름:%6s 성별:%3s 생년월일:%8s 이메일:%15s 전화번호:%13s\n", id, pw, name, gender, birth, email, tel);
		
		return str;
	}
	
}
