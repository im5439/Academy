package com.day17;

import java.io.IOException;

//Stream
//������ ����½� ��絥���͸�  ���¿� ���þ��� �Ϸõ� �帧���������ϴ� ��
//byte ��Ʈ�� 1byte(�����ϳ�)

//in

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int data;//�����Ͱ� ������ -1
		
		System.out.print("���ڿ�?");//abcd
		
		while((data=System.in.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}

	}

}
