package com.bmi;

import java.util.Scanner;

public class Bmi {

	Scanner sc = new Scanner(System.in);
	int inwon, i;
	Record[] rec;

	public void set() {

		do {
			System.out.print("인원수를 입력하세요.(1~10명) ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void getUserInfo() {

		for (i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print((i + 1) + "번째 이름을 입력하세요. ");
			rec[i].name = sc.next();

			System.out.print("몸무게를 입력하세요.(단위 : kg) ");
			rec[i].wei = sc.nextDouble();

			System.out.print("키를 입력하세요.(단위 : m) ");
			rec[i].cm = sc.nextDouble();

			rec[i].bmi = rec[i].wei / (rec[i].cm * rec[i].cm);
	
		}

	}

	private String bmiChk() {

			if (rec[i].bmi > 19 && rec[i].bmi < 25) {
				return "정상";
			} else if (rec[i].bmi > 24 && rec[i].bmi < 30) {
				return "과체중";
			} else if (rec[i].bmi >= 30) {
				return "비만";
			} else
				return"저체중";

	}

	public void getprint() {
		
		System.out.println("-------------------------------------------------------");
		for (i = 0; i < inwon; i++) {
			System.out.printf("이름:%6s   ", rec[i].name);
			
			System.out.printf("몸무게 : %2.3gkg, 키 : %2.3gm, BMI : %2.2g,   ", rec[i].wei, rec[i].cm, rec[i].bmi);
			
			System.out.print(bmiChk());
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------");

	}

}
