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
		
		System.out.print("�й��Է�> ");
		vo.setHak(sc.next());
		System.out.print("�̸��Է�> ");
		vo.setName(sc.next());
		System.out.print("��������> ");
		vo.setKor(sc.nextInt());
		System.out.print("��������> ");
		vo.setEng(sc.nextInt());
		System.out.print("��������> ");
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
