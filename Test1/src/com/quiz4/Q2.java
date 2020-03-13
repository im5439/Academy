package com.quiz4;

import java.util.Scanner;

//[����2]
//�ο����� �Է� �޾� �ο�����ŭ ���� ������ �Է��ϰ� �� ���� ������ �Ͻÿ�
//�ο��� : 2
//1��° �̸� : ������
//���� ? : 100
//���� ? : 100
//���� ? : 100
//
//1��° �̸� : ������
//���� ? : 80
//���� ? : 80
//���� ? : 80
//
//������ 100(��) 100(��) 100(��) 300 100
//
//������  80(��)  80(��)  80(��) 240 80

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
			System.out.print("�ο���? ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void input() {

		String[] title = { "����? ", "����? ", "����? " };

		for (i = 0; i < inwon; i++) {
			rec[i] = new Record();
			System.out.print((i + 1) + "��° �̸�? ");
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
					rec[i].lev[j] = "��";
				} else if (rec[i].score[j] >= 80) {
					rec[i].lev[j] = "��";
				} else if (rec[i].score[j] >= 70) {
					rec[i].lev[j] = "��";
				} else if (rec[i].score[j] >= 60) {
					rec[i].lev[j] = "��";
				} else
					rec[i].lev[j] = "��";

			}
			
		}

	}

	public void print() {

		getlev();

		String[] title = { "����: ", "����: ", "����: " };

		for (i = 0; i < inwon; i++) {
			System.out.printf("\n�̸�: %6s   ", rec[i].name);
			for (j = 0; j < 3; j++) {
				System.out.printf("%2s %3d(%1s)   ", title[j], rec[i].score[j], rec[i].lev[j]);
			}
			System.out.printf("����: %3d   ���: %3d\n", rec[i].tot, rec[i].avg);
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
