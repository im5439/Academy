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

		System.out.print("���ڿ� �Է�?");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out); // writer�� �����Ͱ� �� ������ ����

		while ((data = rd.read()) != -1) {
			wr.write(data);
			wr.flush();// �����Ͱ� ���� �ʾƵ� ����
		}

	}

}
