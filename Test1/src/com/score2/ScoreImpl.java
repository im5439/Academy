package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);
	int inwon, i;
	Record[] rec;

	@Override
	public void set() {

		do {
			System.out.print("���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	@Override
	public void input() {

		for (i = 0; i < inwon; i++) {
			
			rec[i] = new Record(); // for�� �ȿ� �־����
			
			System.out.print((i + 1) + "��° �й�? ");
			rec[i].hak = sc.nextInt();
			System.out.print((i + 1) + "��° �̸�? ");
			rec[i].name = sc.next();
			System.out.print("kor? ");
			rec[i].kor = sc.nextInt();
			System.out.print("eng? ");
			rec[i].eng = sc.nextInt();
			System.out.print("mat? ");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}

	}

	private String getlev(int score) {

		String pan;

//		switch (score/10) {
//		case 10:
//		case 9:
//			pan = "��";
//			break;
//		case 8:
//			pan = "��";
//			break;
//		case 7:
//			pan = "��";
//			break;
//		case 6:
//			pan = "��";
//			break;
//		default:
//			pan = "��";
//			break;

		if(score >= 90) {
			pan = "��";
		} else if(score >= 80) {
			pan = "��";
		} else if(score >= 70) {
			pan = "��";
		} else if(score >= 60) {
			pan = "��";
		} else {
			pan = "��";
		}
		
		return pan;
		
	}

	@Override
	public void print() {

		for (i = 0; i < inwon; i++) {

			System.out.printf("�й�: %3d  �̸�: %3s  kor: %3d(%1s)  eng: %3d(%1s)  mat: %3d(%1s)  ����: %3d  ���: %3d\n", 
					rec[i].hak, rec[i].name, rec[i].kor, getlev(rec[i].kor), rec[i].eng, getlev(rec[i].eng), rec[i].mat, getlev(rec[i].mat), rec[i].tot, rec[i].avg);

		}

		// 123 kim kor:50(��) eng:50(��) mat:50(��) tot:150 avg:50

	}

}
