package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ScoreImpl implements Score {

//	private List<ScoreVO> vo = new Vector<>();
	private List<ScoreVO> lists = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;


		ScoreVO vo = new ScoreVO();

		System.out.print("학번? ");
		vo.setHak(sc.next());

		System.out.print("이름? ");
		vo.setName(sc.next());

		System.out.print("국어? ");
		vo.setKor(sc.nextInt());

		System.out.print("영어? ");
		vo.setEng(sc.nextInt());

		System.out.print("수학? ");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

	@Override
	public void searchHak() {
		
		System.out.print("학번검색> ");
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(vo.getHak().equals(hak)) {
				System.out.println(vo.toString());
				return;
			} else if(vo.getHak() != hak)
				System.out.println("잘못입력되었습니다.");
			
		}
		
	}

	@Override
	public void searchName() {

		System.out.print("이름검색> ");
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(vo.getName().equals(name)) {
				System.out.println(vo.toString());
			}
			
		}
		
	}

	@Override
	public void descSortTot() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;   // 내림차순정렬 <
			}
		};

		Collections.sort(lists, comp);
		
		print();

	}

	@Override
	public void ascSortHak() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
//				return (Integer.parseInt(vo1.getHak())) > (Integer.parseInt(vo2.getHak())) ? 1 : -1;  // 오름차순정렬 >
				return vo1.getHak().compareTo(vo2.getHak()); // 문자열은 compareTo로 비교
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
		
	}

}
