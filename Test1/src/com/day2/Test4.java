package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		//System.in : 키보드로 입력받은 1byte문자
		//InputStreamReader : System.in으로 입력 받은 1byte를 문자(2byte)로 변환(브릿지 클래스)
		//BufferedReader : 메모리에 버퍼(공간)를 만들고 데이터를 저장

		int r;
		double a,l;

		System.out.print("반지름? : ");

		r = Integer.parseInt(br.readLine()); //br.readLine() : br에 있는 내용(문자)을 읽어서 가져온다. Integer.parseInt 정수로 형변환

		a = r * r * 3.14;
		l = (double)(r * 2 * 3.14); //명시적 형변환

		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);




	}
}
