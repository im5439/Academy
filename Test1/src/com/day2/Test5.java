package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test5 {

	public static void main(String[] args) throws IOException {

		//선언부	
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		String name;
		int kor,eng,tot;

		//입력부
		System.out.print("이름은? : ");
		name = br.readLine();

		System.out.print("국어점수는? : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어점수는? : ");
		eng = Integer.parseInt(br.readLine());

		//연산부
		tot = kor + eng;

		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);




	}
}
