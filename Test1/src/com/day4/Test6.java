package com.day4;

public class Test6 {

	public static void main(String[] args) {

		// 다중 for문
		
		int i, j;

		for (i = 2; i <= 9; i++) {

			System.out.println(i + "단");

			for (j = 1; j <= 9; j++) {

				System.out.println(i + " x " + j + " = " + (i * j));
			}
			
			System.out.println("-------------");

		}

	}

}
