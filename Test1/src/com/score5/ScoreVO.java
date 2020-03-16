package com.score5;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ScoreVO implements Serializable{

	private String name;
	private String birth;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		
		String str = String.format("이름: %3s  생년월일: %10s  점수: %3d", name, birth, score);
		
		return str;
	}
	
	
	
}
