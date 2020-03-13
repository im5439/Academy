package com.quiz1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 년도를 입력받고, 윤년인지 아닌지를 출력
		Scanner sc = new Scanner(System.in);

		int year;
		String leapsyear;

		System.out.print("년도를 입력하세요. ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leapsyear = "윤년";
		} else {
			leapsyear = "평년";
		}

		System.out.println(year + "년" + " => " + leapsyear);

		sc.close();

	}

}
