package com.score1;

import java.util.Scanner;

// com.day6 - Test1.java
public class Score {

	int inwon;
	Record[] rec; // class는 자료형이다. 초기값 null
	Scanner sc = new Scanner(System.in);
	String[] title = { "국어?", "영어?", "수학?" };

	public void set() {

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 객체 생성
		rec = new Record[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record(); // Record 객체생성

			System.out.print((i + 1) + "번째 이름? ");
			rec[i].name = sc.next(); // 이름

			for (int j = 0; j < 3; j++) {

				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); // 국,영,수 점수

				rec[i].tot += rec[i].score[j]; // 총점

			}

			rec[i].avg = rec[i].tot / 3; // 평균

		}

	}

	private void ranking() { // 외부에서 엑세스 안됨 class 내부에서만 사용가능

		int i, j;
		// rank배열 초기화
		for (i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}

		// 석차 구하기
		for (i = 0; i < inwon - 1; i++) {
			for (j = i + 1; j < inwon; j++) {

				if (rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				} else if (rec[i].tot < rec[j].tot) {
					rec[i].rank++;
				}

			}
		}

	}

	public void pirnt() {

		ranking(); // class내부에서 호출(Private)

		for (int i = 0; i < inwon; i++) {

			System.out.printf("%6s", rec[i].name); // 이름

			for (int j = 0; j < 3; j++) {

				System.out.printf("%6s %4d   ", title[j], rec[i].score[j]); // 국영수

			}

			System.out.printf("총점 : %4d   ", rec[i].tot); // 총점
			System.out.printf("평균 : %4d   ", rec[i].avg); // 평균
			System.out.printf("순위 : %4d\n", rec[i].rank); // 순위

		}

	}

}
