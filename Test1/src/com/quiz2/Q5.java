package com.quiz2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		5. �μ��� �Է¹޾� ���� ������ ū�������� ��

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int sum = 0;
		
		System.out.print("�� ���� �Է��ϼ���. ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
		}
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}

		System.out.println("���� ������ ū�������� ���� : " + sum);
		
		sc.close();
		
	}

}
