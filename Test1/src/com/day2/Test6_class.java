package com.day2;

import java.util.Scanner;

class Tri {

	int l, h;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�غ�? ");
		l = sc.nextInt();
		System.out.print("����? ");
		h = sc.nextInt();

	}

	public int area() {

		int result = l * h/2;

		return result;

	}

	public void print(int a) {

		System.out.println("���� : " + l + ", ���� : " + h);
		System.out.println("���� : " + a);

	}

}

public class Test6_class {

	public static void main(String[] args) {

		Tri tr = new Tri();
		
		tr.input();
		tr.area();
		int a = tr.area();
		tr.print(a);
	}

}
