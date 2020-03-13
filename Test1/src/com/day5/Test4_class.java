package com.day5;

import java.util.Scanner;

class SelectionSort {

	int[] num = new int[5];
	int i, j, temp, Snum;

	public void input() {

		Scanner sc = new Scanner(System.in);

		for (i = 0; i < num.length; i++) {
			System.out.print("5개의 수를 입력하시오. ");
			num[i] = sc.nextInt();
		}
		System.out.print("Input Data : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}

	}

	public int select() {
		for (i = 0; i < num.length - 1; i++) {
			for (j = 1 + i; i < num.length; i++) {
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
		return num[i];
	}

	public void print() {
		System.out.println(select());
	}

}

public class Test4_class {

	public static void main(String[] args) {

		SelectionSort sel = new SelectionSort();

		sel.input();
		sel.print();

	}

}
