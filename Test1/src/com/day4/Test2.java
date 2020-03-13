package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 수를 입력받아 3 또는 4의 배수인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str = "";
		
		System.out.print("숫자를 입력하세요. ");
		num = sc.nextInt();
		
		if(num % 3 == 0 && num % 4 == 0) {
			str = "3,4의 배수";
		} else if(num % 3 == 0) {
			str = "3의 배수";
		} else if(num % 4 == 0) {
			str = "4의 배수";
		} else
			str = "X";
		
		
		System.out.println(num + " : " + str);
		
		sc.close();
		
		
		
	}

}
