package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		// �ﰢ���� ����(w), ����(h)�� �Է� �޾� ����(a)�� ���Ͻÿ�.
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		double w, h, a;

		System.out.println("���θ� �Է��ϼ���.");
		w = Double.parseDouble(br.readLine());

		System.out.println("���θ� �Է��ϼ���.");
		h = Double.parseDouble(br.readLine());

		a = w * h / 2;
		
		System.out.println("���� = " + w);
		System.out.println("���� = " + h);
		System.out.println("���� = " + a);
		System.out.println();

	}

}
