package com.score7;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();

	//추가
	public void insert() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("학번? ");
			dto.setHak(sc.next());

			System.out.print("이름? ");
			dto.setName(sc.next());

			System.out.print("국어? ");
			dto.setKor(sc.nextInt());

			System.out.print("영어? ");
			dto.setEng(sc.nextInt());

			System.out.print("수학? ");
			dto.setMat(sc.nextInt());

			int result = dao.insertData(dto);

			if (result != 0)
				System.out.println("추가 성공!!");
			else
				System.out.println("추가 실패!!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// 전체 출력
	public void selectAll() {

		List<ScoreDTO> lists = dao.getList();

		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreDTO dto = it.next();
			System.out.println(dto.toString());

		}

		System.out.println();

	}
	
	//수정
	public void update() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("수정할 학번? ");
			dto.setHak(sc.next());

			System.out.print("국어? ");
			dto.setKor(sc.nextInt());

			System.out.print("영어? ");
			dto.setEng(sc.nextInt());

			System.out.print("수학? ");
			dto.setMat(sc.nextInt());

			int result = dao.updateData(dto);

			if (result != 0)
				System.out.println("수정 성공!!");
			else
				System.out.println("수정 실패!!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	//삭제
	public void delete() {

		try {

			System.out.print("학번? ");
			String hak = sc.next();

			int result = dao.deleteData(hak);

			if (result != 0)
				System.out.println("삭제 성공!!");
			else
				System.out.println("삭제 실패!!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// 학번검색
	public void searchHak() {
		
		System.out.print("학번? ");
		String hak = sc.next();
		
		ScoreDTO dto = dao.searchData(hak);
		
		if(dto != null)
			System.out.println(dto.toString());
		else
			System.out.println("존재하지않는 학번");


		System.out.println();

	}

}
