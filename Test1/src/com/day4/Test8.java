package com.day4;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		//switch
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("1~3 이내의 수? ");
		n = sc.nextInt();
		
		switch(n) {
		
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("입력 오류!!");
		
		}
		
		sc.close();
		
	}

}
