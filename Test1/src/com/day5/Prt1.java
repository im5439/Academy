package com.day5;

import java.util.Scanner;

public class Prt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int i, j, temp;

		System.out.print("5개의 수 입력.");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Sourece Data : ");
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
		System.out.println();

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Selection sort : ");

		for (i= 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}

		sc.close();

	}

}
