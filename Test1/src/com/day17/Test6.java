package com.day17;

import java.io.FileOutputStream;

//FileOutputStream

public class Test6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");

			int data;

			System.out.print("���ڿ� �Է�?");// abc

			while ((data = System.in.read()) != -1) {

				fos.write(data);// ���ͱ���
				fos.flush();// OutPutStream�� ���͸� �ľ���
			}

		} catch (Exception e) {

		}

	}

}
