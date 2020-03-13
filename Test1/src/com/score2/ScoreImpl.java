package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);
	int inwon, i;
	Record[] rec;

	@Override
	public void set() {

		do {
			System.out.print("몇명? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	@Override
	public void input() {

		for (i = 0; i < inwon; i++) {
			
			rec[i] = new Record(); // for문 안에 있어야함
			
			System.out.print((i + 1) + "번째 학번? ");
			rec[i].hak = sc.nextInt();
			System.out.print((i + 1) + "번째 이름? ");
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
//			pan = "수";
//			break;
//		case 8:
//			pan = "우";
//			break;
//		case 7:
//			pan = "미";
//			break;
//		case 6:
//			pan = "양";
//			break;
//		default:
//			pan = "가";
//			break;

		if(score >= 90) {
			pan = "수";
		} else if(score >= 80) {
			pan = "우";
		} else if(score >= 70) {
			pan = "미";
		} else if(score >= 60) {
			pan = "양";
		} else {
			pan = "가";
		}
		
		return pan;
		
	}

	@Override
	public void print() {

		for (i = 0; i < inwon; i++) {

			System.out.printf("학번: %3d  이름: %3s  kor: %3d(%1s)  eng: %3d(%1s)  mat: %3d(%1s)  총점: %3d  평균: %3d\n", 
					rec[i].hak, rec[i].name, rec[i].kor, getlev(rec[i].kor), rec[i].eng, getlev(rec[i].eng), rec[i].mat, getlev(rec[i].mat), rec[i].tot, rec[i].avg);

		}

		// 123 kim kor:50(가) eng:50(가) mat:50(가) tot:150 avg:50

	}

}
