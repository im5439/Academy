package com.quiz2;

public class Q2 {

	public static void main(String[] args) {

//		2. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��

		int i = 0;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100���� ���� �� = " + sum);

		sum = 0;
		for (i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println("1~100���� ¦���� �� = " + sum);

		sum = 0;
		for (i = 1; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println("1~100���� Ȧ���� �� = " + sum);
	
	
	}

}
