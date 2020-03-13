package com.day3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// Scanner
		// 단락문자의 패턴을 사용해서 분류
		// 기본 패턴은 공백

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

//		System.out.print("이름? 국어? 영어? 수학? ");// name 80 70 60

		System.out.print("이름?,국어?,영어?,수학? "); // name,80,70,60

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");// 정규화표현식 ( \\s* -> 공백 )

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + " : " + (kor + eng + mat));

		sc.close();

	}

}
