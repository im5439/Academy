package com.quiz1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// �� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int bnum = 0;
		int lnum = 0;

		System.out.print("�ΰ��� ���ڸ� �Է��ϼ���.(ex 5 6) ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			bnum = num1;
			lnum = num2;
		} else if (num1 < num2) {
			bnum = num2;
			lnum = num1;
		} else {
			System.out.println("���� �����Դϴ�.");
		}
		System.out.println("ū ����: " + bnum + ", ���� ����: " + lnum);
		sc.close();
	}

}
