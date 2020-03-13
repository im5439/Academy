package com.score1;

import java.util.Scanner;

public class Score2 {
	// �ο���(1~10)�� �޾� 5���� �̸�,����,���,��� ���
	Record1[] rec;
	int inwon;
	Scanner sc = new Scanner(System.in);

	public void set() {

		do {

			System.out.print("�ο��� �Է��ϼ���.(1~10) ");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);

		rec = new Record1[inwon];

	}

	private void getinfo() {

		String[] title = { "����������? ", "����������? ", "����������? ", "����������? ", "����������? " };

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record1();
			System.out.print((i + 1) + "��° �̸��� �Է��ϼ���. ");
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

		String[] title = {"����","����","����","����","����"};
		
		for (int i = 0; i < inwon; i++) {

			System.out.println("-----------------------------------------------------------");
			System.out.printf("  �̸� : %4s", rec[i].name);
			System.out.println();

			for (int j = 0; j < 5; j++) {
				
				System.out.printf("%4s : %4d", title[j], rec[i].score[j]);
				
			}
			System.out.println();
			System.out.printf("  ���� : %4d��,  ��� : %4d��,  ��� : %4d��\n", rec[i].tot, rec[i].avg, rec[i].rank);
			System.out.println("-----------------------------------------------------------");
		}

	}

}
