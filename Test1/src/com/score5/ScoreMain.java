package com.score5;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int set;

		Score ob = new Score();
		
		ob.readInfo();
		
		while (true) {
			System.out.print("1.�Է� 2.��� 3.���� => ");
			set = sc.nextInt();

			switch (set) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.saveInfo();
				System.exit(0);
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.(1~3)");
				break;

			}

		}

	}

}
