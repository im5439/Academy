package com.spt;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		ScoreVO vo = new ScoreVO();
		
		while(true) {
			
			do {
				System.out.print("1.입력 2.출력 3.학번검색 4.이름검색 5.총점오름차순정렬 6.학번내림차순정렬 7.종료");
				i = sc.nextInt();
			} while (i < 1);
			
			switch(i) {
			case 1:
				
				
			}

		}
	}

}
