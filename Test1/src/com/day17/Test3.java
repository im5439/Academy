package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte stream�� 2byte stream���� ��ȯ�ϴ� stream

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("���ڿ� �Է�?");

		Reader rd = new InputStreamReader(System.in); // Reader �����(buffer �������) �Է��� ���� ���� Writer�� ����� ���� �ӽ�����

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.print(ch);
		}

	}

}
