package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아
		// 점수가 높은 사람 순으로 정렬(내림차순)

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i, j, inwon, t1;
		String t2;

		do {
			System.out.print("인원수? "); // 3
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당(객체 생성)
		name = new String[inwon];
		score = new int[inwon];

		for (i = 0; i < inwon; i++) {    //  java.lang.ArrayIndexOutOfBoundsException: 2 - 배열 범위를 벗어나면 생기는 에러
			System.out.print((i + 1) + "번째 이름? ");
			name[i] = sc.next();
			System.out.print("점수? ");
			score[i] = sc.nextInt();
		}
		
		for (i = 0; i < inwon-1; i++) {
			for (j = i + 1; j < inwon; j++) {
				
				if (score[i] < score[j]) {
					
					t1 = score[i];
					score[i] = score[j];
					score[j] = t1;
					
					t2 = name[i];
					name[i] = name[j];
					name[j] = t2;
				}
				
			}
		}

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s : %4d점\n", name[i], score[i]);
		}
		
		sc.close();

	}

}
