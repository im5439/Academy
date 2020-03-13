package com.spt;

public class ScoreVO {

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return kor + eng + mat;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void getinfo() {
		
		System.out.printf("학번: %6s  이름: %6s  국어: %4d  영어: %4d  수학: %4d  총점: %4d  평균: %4.1f",
				hak, name, kor, eng, mat, getTot(), getTot()/3);
		
	}
	
	
}
