package com.day7;

import java.util.Scanner;

class Hap {

	int su, sum;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�? ");
		su = sc.nextInt();

	}

	public void cnt() {

		
		for (int i = 1; i <= su; i++) {
			sum += i;
		}


	}

	public void print() {

		System.out.println("1~" + su + "�հ� : " + sum);

	}

}

public class Test3 {

	public static void main(String[] args) {

		Hap ob = new Hap();

		ob.input();
		ob.cnt();
		ob.print();

	}

}
