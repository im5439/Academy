package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		// char
//		String s = "가나다";
//		char a = '$';  --> error
//		char b = '가';

//		char ch = '가';
//		
//		System.out.println(ch); 출력값 : 가
//		System.out.println(Integer.toString(ch)); 출력값 : ASCII값

		char ch, result;

		System.out.print("한개의 문자?"); // a(97)
		ch = (char) System.in.read();

		result = ch >= 65 && ch <= 90 ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch);

		System.out.println(ch + " -> " + result);

	}

}
