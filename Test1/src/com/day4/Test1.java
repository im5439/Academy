package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// ������ ���� �Է¹޾� ���������� ū �� ������ ���(��������)
		// Input - 7 2 5
		// Output - 2 5 7

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp;

		System.out.print("������ ���� �Է��ϼ���. "); // 7 5 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

//		if (num1 > num2) {
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		if (num1 > num3) {
//			temp = num1;
//			num1 = num3;
//			num3 = temp;
//		}		
//		if (num2 > num3) {
//			temp = num2;
//			num2 = num3;
//			num3 = temp;
//		}

		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.printf("��� : %d %d %d\n", num1, num2, num3);

		sc.close();
		
	}

}
