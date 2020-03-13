package com.quiz4;

import java.util.Scanner;

//[문제2]
//인원수를 입력 받아 인원수만큼 과목별 점수를 입력하고 각 과목별 판정을 하시오
//인원수 : 2
//1번째 이름 : 전지현
//국어 ? : 100
//영어 ? : 100
//수학 ? : 100
//
//1번째 이름 : 옥주현
//국어 ? : 80
//영어 ? : 80
//수학 ? : 80
//
//전지현 100(수) 100(수) 100(수) 300 100
//
//옥주현  80(우)  80(우)  80(우) 240 80

class Record {

	String name;
	int[] score = new int[3];
	int tot, avg;
	String[] lev = new String[3];

}

class Score {

	Scanner sc = new Scanner(System.in);
	private int inwon, i, j;
	private Record[] rec;
	
	public void set(int inwon, int i, int j) {
		this.inwon = inwon;
		this.i = i;
		this.j = j;
	}

	public void getinwon() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void input() {

		String[] title = { "국어? ", "영어? ", "수학? " };

		for (i = 0; i < inwon; i++) {
			rec[i] = new Record();
			System.out.print((i + 1) + "번째 이름? ");
			rec[i].name = sc.next();
			for (j = 0; j < 3; j++) {
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot / 3;
		}

	}


	private void getlev() {

		
		for (i = 0; i < inwon; i++) {

			for (j = 0; j < 3; j++) {

				if (rec[i].score[j] >= 90) {
					rec[i].lev[j] = "수";
				} else if (rec[i].score[j] >= 80) {
					rec[i].lev[j] = "우";
				} else if (rec[i].score[j] >= 70) {
					rec[i].lev[j] = "미";
				} else if (rec[i].score[j] >= 60) {
					rec[i].lev[j] = "양";
				} else
					rec[i].lev[j] = "가";

			}
			
		}

	}

	public void print() {

		getlev();

		String[] title = { "국어: ", "영어: ", "수학: " };

		for (i = 0; i < inwon; i++) {
			System.out.printf("\n이름: %6s   ", rec[i].name);
			for (j = 0; j < 3; j++) {
				System.out.printf("%2s %3d(%1s)   ", title[j], rec[i].score[j], rec[i].lev[j]);
			}
			System.out.printf("총점: %3d   평균: %3d\n", rec[i].tot, rec[i].avg);
		}

	}

}

public class Q2 {

	public static void main(String[] args) {
		
		Score ob = new Score();
		
		ob.getinwon();
		ob.input();
		ob.print();
		
	}

}
