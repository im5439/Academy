package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		// 삼각형의 가로(w), 세로(h)를 입력 받아 넓이(a)를 구하시오.
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		double w, h, a;

		System.out.println("가로를 입력하세요.");
		w = Double.parseDouble(br.readLine());

		System.out.println("세로를 입력하세요.");
		h = Double.parseDouble(br.readLine());

		a = w * h / 2;
		
		System.out.println("가로 = " + w);
		System.out.println("세로 = " + h);
		System.out.println("넓이 = " + a);
		System.out.println();

	}

}
