package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamReader

public class Test4 {

	public static void main(String[] args) throws IOException {

		int data;

		System.out.print("문자열 입력?");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out); // writer는 데이터가 꽉 차야지 전달

		while ((data = rd.read()) != -1) {
			wr.write(data);
			wr.flush();// 데이터가 차지 않아도 전달
		}

	}

}
