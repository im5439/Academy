package com.day7;

import java.util.Scanner;

public class Rect {

	int w, h; // instance ����(��������,�������)- �ʱⰪ�� �ִ�. 0 ���������� �ʱⰪ-�����Ⱚ

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����? ");
		w = sc.nextInt();

		System.out.print("����? ");
		h = sc.nextInt();


	}

	public int area() {

		int result;
		
		result = w * h;

		return result;

	}

	public int length() {

		return (w + h) * 2;

	}

	public void print(int a, int l) {
		System.out.println("���� : " + w + ", ���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}

}
