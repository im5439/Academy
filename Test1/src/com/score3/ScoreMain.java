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
				System.out.println(" 1.입력 \t    2.출력 \n 3.학번검색 \t    4.이름검색 \n 5.총점내림차순정렬 6.학번오름차순정렬 \n 7.종료 ");
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
				System.out.println("- 종료 -");
				System.exit(0);  // 0- 종료 
			
			}

		}

	}

}
