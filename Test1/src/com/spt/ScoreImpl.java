package com.spt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{

	List<ScoreVO> lists = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input() {
		
		int result = 0;
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번입력> ");
		vo.setHak(sc.next());
		System.out.print("이름입력> ");
		vo.setName(sc.next());
		System.out.print("국어점수> ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수> ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수> ");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
		return result;
	}

	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			vo.getinfo();
			
		}
		
	}

	@Override
	public void searchHak() {
	}

	@Override
	public void searchName() {
	}

	@Override
	public void descSortTot() {
	}

	@Override
	public void ascSortHak() {
	}

}
