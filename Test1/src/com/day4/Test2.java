package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ���� �Է¹޾� 3 �Ǵ� 4�� ������� ���
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str = "";
		
		System.out.print("���ڸ� �Է��ϼ���. ");
		num = sc.nextInt();
		
		if(num % 3 == 0 && num % 4 == 0) {
			str = "3,4�� ���";
		} else if(num % 3 == 0) {
			str = "3�� ���";
		} else if(num % 4 == 0) {
			str = "4�� ���";
		} else
			str = "X";
		
		
		System.out.println(num + " : " + str);
		
		sc.close();
		
		
		
	}

}
