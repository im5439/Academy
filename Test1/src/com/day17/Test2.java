package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//out

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out; //OutputStream �������� OutputStream �� �Ǻ� out �� �Ǻ�
		
		byte[] b = new byte[3]; //buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); //out�̶� ��Ʈ���� ����(OutPutStream�� �ݾƼ�)
		
		System.out.println("�� ���̳�?");
		
	}

}
