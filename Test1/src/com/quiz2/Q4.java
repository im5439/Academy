package com.quiz2;

public class Q4 {

	public static void main(String[] args) {

//		4. 1���� 100������ ���� 3�� ����� ����

		int n = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				n++;
			}
		}

		System.out.println("3�� ����� ���� : " + n + "��");

	}

}
