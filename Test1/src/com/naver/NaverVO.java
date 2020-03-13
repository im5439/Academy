package com.naver;

// List Collection���� ȸ������ �����
// �޴� : ȸ������,ȸ����ü���, ���̵�˻�...
// ���� : ȸ�����Խ� ���̵�� 8~15�� �̳�, ������ ���� ȥ��
// ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
// PW1 PW2 ���Ͽ� �ϳ��� ����
// �Է� ��� ���� ���̵�˻�

public class NaverVO {

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
		
		String str = String.format("ID:%15s PW:%10s �̸�:%6s ����:%3s �������:%8s �̸���:%15s ��ȭ��ȣ:%13s\n", id, pw, name, gender, birth, email, tel);
		
		return str;
	}
	
}
