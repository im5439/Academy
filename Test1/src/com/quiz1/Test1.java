package com.quiz1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// ������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
		Scanner sc = new Scanner(System.in);

		int num;
		String a = "";//null

		System.out.print("���ڸ� �Է��ϼ���.(����) ");
		num = sc.nextInt();

		if (num % 2 == 0 && num != 0) {
			a = "¦��";
		} else if (num % 2 != 0) {
			a = "Ȧ��";
		} else if(num == 0) {
			a = "0";
		}

		System.out.println(num + " => " + a);

		sc.close();

	}

}
