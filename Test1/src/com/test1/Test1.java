package com.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

//		1.������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
//		��) 3 �Է½� -> 3 => Ȧ��
//		��) 4 �Է½� -> 4 => ¦��

		Scanner sc = new Scanner(System.in);

		int num;
		String pan = "";

		System.out.print("������ �Է��ϼ���. ");
		num = sc.nextInt();

		if (num % 2 == 0 && num != 0) {
			pan = "¦��";
		} else if (num % 2 != 0) {
			pan = "Ȧ��";
		} else {
			pan = "0";
		}
		System.out.println(num + " => " + pan);

		sc.close();

	}

}
