package com.quiz3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
//		   ���� ū���� �������� ���(�迭)

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		int i, j, temp;

		for (i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ������ �Է��ϼ���. ");
			num[i] = sc.nextInt();
		}

		System.out.print("5���� ���� : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		
		System.out.println();
		for (i = 0; i < num.length - 1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.printf("���� ū�� : " + num[4] + "\n���� ������ : " + num[0]);

		sc.close();
	}

}
