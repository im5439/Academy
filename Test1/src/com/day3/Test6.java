package com.day3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// Scanner
		// �ܶ������� ������ ����ؼ� �з�
		// �⺻ ������ ����

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

//		System.out.print("�̸�? ����? ����? ����? ");// name 80 70 60

		System.out.print("�̸�?,����?,����?,����? "); // name,80,70,60

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");// ����ȭǥ���� ( \\s* -> ���� )

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + " : " + (kor + eng + mat));

		sc.close();

	}

}
