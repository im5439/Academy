package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte stream을 2byte stream으로 변환하는 stream

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("문자열 입력?");

		Reader rd = new InputStreamReader(System.in); // Reader 저장소(buffer 저장공간) 입력한 값을 저장 Writer는 출력할 값을 임시저장

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.print(ch);
		}

	}

}
