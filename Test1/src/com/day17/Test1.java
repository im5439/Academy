package com.day17;

import java.io.IOException;

//Stream
//데이터 입출력시 모든데이터를  형태와 관련없이 일련된 흐름으로전송하는 것
//byte 스트림 1byte(문자하나)

//in

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int data;//데이터가 없으면 -1
		
		System.out.print("문자열?");//abcd
		
		while((data=System.in.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}

	}

}
