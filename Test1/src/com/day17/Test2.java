package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//out

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out; //OutputStream 보편적인 OutputStream 겉 피복 out 속 피복
		
		byte[] b = new byte[3]; //buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); //out이란 스트림이 닫힘(OutPutStream을 닫아서)
		
		System.out.println("나 보이냐?");
		
	}

}
