package com.naver;

//List Collection으로 회원가입 만들기
//메뉴 : 회원가입,회원전체출력, 아이디검색...
//조건 : 회원가입시 아이디는 8~15자 이내, 영문자 숫자 혼용
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 비교하여 하나만 저장
//입력 출력 삭제 아이디검색

public interface Naver {

	public void input(); // 회원가입
	public void print(); // 회원목록출력
	public void delete(); // 회원탈퇴
	public void updata(); // 정보수정
	public void findId(); // 아이디검색
	public void findName(); // 이름검색
	public void saveInfo(); // 회원목록 파일로 저장
	public void readInfo(); // 회원목록 불러오기
	public void thread();
	
	
}
