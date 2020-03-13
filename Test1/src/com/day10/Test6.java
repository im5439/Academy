package com.day10;

public class Test6 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		sb.append("서울");
		sb.append("부산");
		sb.append("대구");

		System.out.println(sb); // 데이터 타입 StringBuffer

		// String으로 변환해서 사용
		String str = sb.toString();

		System.out.println(str); // 데이터 타입 String

		// Integer
		int a = 24;
		System.out.println(a); // 24
		System.out.println(Integer.toString(a) + 1); // 문자
		System.out.println(Integer.toString(a,2)); // 2진수
		System.out.println(Integer.toString(a,16)); // 16진수

	}

}
