package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		//System.in : Ű����� �Է¹��� 1byte����
		//InputStreamReader : System.in���� �Է� ���� 1byte�� ����(2byte)�� ��ȯ(�긴�� Ŭ����)
		//BufferedReader : �޸𸮿� ����(����)�� ����� �����͸� ����

		int r;
		double a,l;

		System.out.print("������? : ");

		r = Integer.parseInt(br.readLine()); //br.readLine() : br�� �ִ� ����(����)�� �о �����´�. Integer.parseInt ������ ����ȯ

		a = r * r * 3.14;
		l = (double)(r * 2 * 3.14); //����� ����ȯ

		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);




	}
}
