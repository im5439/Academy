package com.score4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new HashMap<>();

	Scanner sc = new Scanner(System.in);
	String hak;

	@Override
	public void input() {

		System.out.print("학번? ");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("학번이 존재합니다. 추가 실패!!");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("이름? ");
		vo.setName(sc.next());

		System.out.print("국어? ");
		vo.setKor(sc.nextInt());

		System.out.print("영어? ");
		vo.setEng(sc.nextInt());

		System.out.print("수학? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("추가 성공!!");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) {
			return true;
		}

		return false;

		// return hMap.containsKey(hak); 위와 같은 코딩
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String hak = it.next(); // key값 불러옴
			ScoreVO vo = hMap.get(hak);
			System.out.println("학번: " + hak + "  " + vo.toString());

		}

	}

	@Override
	public void delete() {

		System.out.print("삭제할 학번? ");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println(hak + " 삭제 완료!");
		} else
			System.out.println("존재하지않는 학번!!");

	}

	@Override
	public void updata() {

		System.out.print("수정할 학번? ");
		hak = sc.next();

		ScoreVO vo = hMap.get(hak);

//		ScoreVO vo1 = new ScoreVO();
		if (!searchHak(hak)) {
			System.out.println("존재하지않는 학번!!");
			return;
		} else if (searchHak(hak)) {
//			vo.setName(vo1.getName());
			System.out.print("국어? ");
			vo.setKor(sc.nextInt());
			System.out.print("영어? ");
			vo.setEng(sc.nextInt());
			System.out.print("수학? ");
			vo.setMat(sc.nextInt());

			hMap.put(hak, vo);

			System.out.println("수정완료! " + vo.toString());
		}

	}

	@Override
	public void findHak() {

		System.out.print("검색할 학번? ");
		hak = sc.next();

		ScoreVO vo = hMap.get(hak);
		if (searchHak(hak)) {
			System.out.println("학번: " + hak + "  " + vo.toString());
		} else
			System.out.println("존재하지않는 학번!!");
		
//		if(vo == null) {
//			System.out.println("존재하지않는 학번!!");
//		} else
//			System.out.println("학번: " + hak + "  " + vo.toString());

	}

	@Override
	public void findName() {

		System.out.print("검색할 이름? ");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			if (name.equals(vo.getName())) {
				System.out.println("학번: " + hak + "  " + vo.toString());
			}

		}

	}

}
