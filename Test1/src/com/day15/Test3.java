package com.day15;

import java.util.Scanner;

class MyExecp {

	public void inputFormat(String str) throws Exception {

		// 5~10자 이내의 영문자를 입력
		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("문자열의 길이는 5~10자 입니다.");
		}

		// 영문자(대소문자)만 가능합니다. ascii 65~90, 97~122 / 65보다 작고, 90~97, 122보다 크면 안됨
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if ((temp < 65 || temp > 90) && (temp < 97 || temp > 122)) {
				throw new Exception("영문자만 가능합니다.");
			}
//			if(temp < 65|| temp > 122) {
//				throw new Exception("영문자만 가능합니다.");
//			} else if(temp < 90 && temp > 97) {
//				throw new Exception("영문자만 가능합니다.");
//			}

		}

	}

}

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		MyExecp auth = new MyExecp();

		try {

			System.out.print("문자열? ");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
