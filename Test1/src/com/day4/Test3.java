package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// �ݺ���(for, while, do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.print("�� �Է�? ");
		dan = sc.nextInt();

		// for(���۰�;�ִ밪;������)
		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan+"�� : "+ dan + " x " + i + " = "+ (dan * i));	
			System.out.printf("%d * %d = %d \n", dan, i, (dan * i));
		}

		// -------------------------------------------------------------------------------------

		System.out.println("------------------------");

		// while(�ִ밪)

		int j = 0; // ���۰�

		while (j < 9) { // �ִ밪

			j++; // ������
			System.out.printf("%d * %d = %d \n", dan, j, (dan * j));

		}

		System.out.println("------------------------");

		// do~while(�ִ밪);

		int k = 0;
		do {

			k++;
			System.out.printf("%d * %d = %d \n", dan, k, (dan * k));

		} while (k < 9);

		sc.close();
	}

}
