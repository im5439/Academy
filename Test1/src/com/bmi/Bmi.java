package com.bmi;

import java.util.Scanner;

public class Bmi {

	Scanner sc = new Scanner(System.in);
	int inwon, i;
	Record[] rec;

	public void set() {

		do {
			System.out.print("�ο����� �Է��ϼ���.(1~10��) ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void getUserInfo() {

		for (i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print((i + 1) + "��° �̸��� �Է��ϼ���. ");
			rec[i].name = sc.next();

			System.out.print("�����Ը� �Է��ϼ���.(���� : kg) ");
			rec[i].wei = sc.nextDouble();

			System.out.print("Ű�� �Է��ϼ���.(���� : m) ");
			rec[i].cm = sc.nextDouble();

			rec[i].bmi = rec[i].wei / (rec[i].cm * rec[i].cm);
	
		}

	}

	private String bmiChk() {

			if (rec[i].bmi > 19 && rec[i].bmi < 25) {
				return "����";
			} else if (rec[i].bmi > 24 && rec[i].bmi < 30) {
				return "��ü��";
			} else if (rec[i].bmi >= 30) {
				return "��";
			} else
				return"��ü��";

	}

	public void getprint() {
		
		System.out.println("-------------------------------------------------------");
		for (i = 0; i < inwon; i++) {
			System.out.printf("�̸�:%6s   ", rec[i].name);
			
			System.out.printf("������ : %2.3gkg, Ű : %2.3gm, BMI : %2.2g,   ", rec[i].wei, rec[i].cm, rec[i].bmi);
			
			System.out.print(bmiChk());
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------");

	}

}
