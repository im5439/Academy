package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.print("ù��° ��? "); //200
		num1 = Integer.parseInt(br.readLine());  // Ŭ������ Ŭ������ ����ȯ br.readLine() -> String(Ŭ����) => Integer(Ŭ����) 

		System.out.print("�ι�° ��? ");
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d \t", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d \t", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d \n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d \n", num1, num2, num1 % num2);

		System.out.println("num1 > num2 : " + (num1 > num2)); // true,false

		String str;

		str = num1 % 2 == 0 ? "¦��" : "Ȧ��"; // ���׿�����

		str = num1 > 0 ? "���" : (num1 < 0 ? "����" : "��");

		//A && B(A and B), A || B(A or B)
		//A(T),B(T)->T   A(T)->T, B(T)->T, A(T) B(T)->T
		str = num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0 ? "����" : "���";

		System.out.println(num1 + " : " + str);

	}

}
