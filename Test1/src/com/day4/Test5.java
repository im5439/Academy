package com.day4;

public class Test5 {

	public static void main(String[] args) {

		int sum = 0;

		// 100������ ��

		for (int i = 1; i <= 100; i++) {
			sum += i;			
		}
		System.out.println("��� : " + sum);

		// 100���� Ȧ���� ��
		sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("��� : " + sum);

		// 100���� ¦���� ��
		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("��� : " + sum);

		// 100���� 3�� ����� ��
		sum = 0;
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("��� : " + sum);

		int i;
		for (i = 1, sum = 0; i <= 100; sum += i, i++);
		System.out.println("��� : " + sum);

		
		
	}

}
