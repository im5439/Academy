package com.test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

//		2.�� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
//		��) 20, 30 �Է½� -> ū ���� 30, ���� ���� 20

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int bnum=0;
		int lnum=0;

		System.out.print("�� ���� ������ �Է��ϼ���.(ex 1 2) ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			bnum = num1;
			lnum = num2;
		} else if (num2 > num1) {
			bnum = num2;
			lnum = num1;
		}
		
		System.out.println("ū ���� : " + bnum + ", ���� ���� : " + lnum);

		sc.close();
	}

}
