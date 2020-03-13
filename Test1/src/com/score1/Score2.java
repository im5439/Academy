package com.score1;

import java.util.Scanner;

public class Score2 {
	// 인원수(1~10)를 받아 5과목 이름,총합,평균,등수 계산
	Record1[] rec;
	int inwon;
	Scanner sc = new Scanner(System.in);

	public void set() {

		do {

			System.out.print("인원을 입력하세요.(1~10) ");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);

		rec = new Record1[inwon];

	}

	private void getinfo() {

		String[] title = { "국어점수는? ", "영어점수는? ", "수학점수는? ", "국사점수는? ", "과학점수는? " };

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record1();
			System.out.print((i + 1) + "번째 이름을 입력하세요. ");
			rec[i].name = sc.next();

			for (int j = 0; j < 5; j++) {

				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];

			}

			rec[i].avg = rec[i].tot / 5;

		}

	}

	public void rank() {

		getinfo();

		for (int i = 0; i < inwon; i++) {

			rec[i].rank = 1;

		}

		for (int i = 0; i < inwon - 1; i++) {

			for (int j = i + 1; j < inwon; j++) {

				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				} else if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}

			}

		}

	}

	public void getprint() {

		String[] title = {"국어","영어","수학","국사","과학"};
		
		for (int i = 0; i < inwon; i++) {

			System.out.println("-----------------------------------------------------------");
			System.out.printf("  이름 : %4s", rec[i].name);
			System.out.println();

			for (int j = 0; j < 5; j++) {
				
				System.out.printf("%4s : %4d", title[j], rec[i].score[j]);
				
			}
			System.out.println();
			System.out.printf("  총점 : %4d점,  평균 : %4d점,  등수 : %4d등\n", rec[i].tot, rec[i].avg, rec[i].rank);
			System.out.println("-----------------------------------------------------------");
		}

	}

}
