package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out.println("--------------------------------------");
				System.out.println(" 1.�Է� \t    2.��� \n 3.�й��˻� \t    4.�̸��˻� \n 5.���������������� 6.�й������������� \n 7.���� ");
				System.out.println("--------------------------------------");
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
				ob.searchHak();
				break;
			case 4:
				ob.searchName();
				break;
			case 5:
				ob.descSortTot();
				break;
			case 6:
				ob.ascSortHak();
				break;
			default:
				System.out.println("- ���� -");
				System.exit(0);  // 0- ���� 
			
			}

		}

	}

}
