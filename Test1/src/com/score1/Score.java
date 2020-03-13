package com.score1;

import java.util.Scanner;

// com.day6 - Test1.java
public class Score {

	int inwon;
	Record[] rec; // class�� �ڷ����̴�. �ʱⰪ null
	Scanner sc = new Scanner(System.in);
	String[] title = { "����?", "����?", "����?" };

	public void set() {

		do {
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� ��ü ����
		rec = new Record[inwon];

	}

	public void input() {

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record(); // Record ��ü����

			System.out.print((i + 1) + "��° �̸�? ");
			rec[i].name = sc.next(); // �̸�

			for (int j = 0; j < 3; j++) {

				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); // ��,��,�� ����

				rec[i].tot += rec[i].score[j]; // ����

			}

			rec[i].avg = rec[i].tot / 3; // ���

		}

	}

	private void ranking() { // �ܺο��� ������ �ȵ� class ���ο����� ��밡��

		int i, j;
		// rank�迭 �ʱ�ȭ
		for (i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}

		// ���� ���ϱ�
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

		ranking(); // class���ο��� ȣ��(Private)

		for (int i = 0; i < inwon; i++) {

			System.out.printf("%6s", rec[i].name); // �̸�

			for (int j = 0; j < 3; j++) {

				System.out.printf("%6s %4d   ", title[j], rec[i].score[j]); // ������

			}

			System.out.printf("���� : %4d   ", rec[i].tot); // ����
			System.out.printf("��� : %4d   ", rec[i].avg); // ���
			System.out.printf("���� : %4d\n", rec[i].rank); // ����

		}

	}

}
