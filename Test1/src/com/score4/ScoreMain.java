package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out.println("----------------------------------------------------------------");
				System.out.println(" 1.�Է�  2.���  3.����  4.����  5.�й��˻�  6.�̸��˻�  7.���� ");
				System.out.println("----------------------------------------------------------------");
				System.out.print("> ");
				ch = sc.nextInt();
			} while (ch < 1);
			
			switch(ch) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.updata();
				break;
			case 5:
				ob.findHak();
				break;
			case 6:
				ob.findName();
				break;
			default:
				System.out.println("- ���� -");
				System.exit(0);  // 0- ���� 
			
			}

		}

	}

}