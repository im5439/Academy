package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아
		// 석차를 구해서 출력

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;
		int inwon, i, j;

		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 객체 생성
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {

			System.out.print((i + 1) + "번째 이름? ");
			name[i] = sc.next();

			System.out.print("점수? ");
			score[i] = sc.nextInt();

		}

		for (i = 0; i < inwon; i++) {
			rank[i] = 1;
		}

		for (i = 0; i < inwon-1; i++) {
			
			for (j = i + 1; j < inwon; j++) {
				
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
				
			}

			for (i = 0; i < inwon; i++) {
				System.out.printf("%2d등 : %3s - %3d점\n", rank[i], name[i], score[i]);
			}

			sc.close();
		}

	}
}
