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

		System.out.print("�й�? ");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("�й��� �����մϴ�. �߰� ����!!");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�? ");
		vo.setName(sc.next());

		System.out.print("����? ");
		vo.setKor(sc.nextInt());

		System.out.print("����? ");
		vo.setEng(sc.nextInt());

		System.out.print("����? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("�߰� ����!!");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) {
			return true;
		}

		return false;

		// return hMap.containsKey(hak); ���� ���� �ڵ�
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String hak = it.next(); // key�� �ҷ���
			ScoreVO vo = hMap.get(hak);
			System.out.println("�й�: " + hak + "  " + vo.toString());

		}

	}

	@Override
	public void delete() {

		System.out.print("������ �й�? ");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println(hak + " ���� �Ϸ�!");
		} else
			System.out.println("���������ʴ� �й�!!");

	}

	@Override
	public void updata() {

		System.out.print("������ �й�? ");
		hak = sc.next();

		ScoreVO vo = hMap.get(hak);

//		ScoreVO vo1 = new ScoreVO();
		if (!searchHak(hak)) {
			System.out.println("���������ʴ� �й�!!");
			return;
		} else if (searchHak(hak)) {
//			vo.setName(vo1.getName());
			System.out.print("����? ");
			vo.setKor(sc.nextInt());
			System.out.print("����? ");
			vo.setEng(sc.nextInt());
			System.out.print("����? ");
			vo.setMat(sc.nextInt());

			hMap.put(hak, vo);

			System.out.println("�����Ϸ�! " + vo.toString());
		}

	}

	@Override
	public void findHak() {

		System.out.print("�˻��� �й�? ");
		hak = sc.next();

		ScoreVO vo = hMap.get(hak);
		if (searchHak(hak)) {
			System.out.println("�й�: " + hak + "  " + vo.toString());
		} else
			System.out.println("���������ʴ� �й�!!");
		
//		if(vo == null) {
//			System.out.println("���������ʴ� �й�!!");
//		} else
//			System.out.println("�й�: " + hak + "  " + vo.toString());

	}

	@Override
	public void findName() {

		System.out.print("�˻��� �̸�? ");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			if (name.equals(vo.getName())) {
				System.out.println("�й�: " + hak + "  " + vo.toString());
			}

		}

	}

}
