package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է¹޾�
		// ������ ���ؼ� ���

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;
		int inwon, i, j;

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� ��ü ����
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {

			System.out.print((i + 1) + "��° �̸�? ");
			name[i] = sc.next();

			System.out.print("����? ");
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
				System.out.printf("%2d�� : %3s - %3d��\n", rank[i], name[i], score[i]);
			}

			sc.close();
		}

	}
}
