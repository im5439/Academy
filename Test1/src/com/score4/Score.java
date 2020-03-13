package com.score4;

public interface Score {

	public void input(); // 입력
	public boolean searchHak(String hak); // 학번존재여부확인
	public void print(); // 출력
	public void delete(); // 삭제
	public void updata(); // 수정
	public void findHak(); // 학번검색
	public void findName(); // 이름검색
	
}
