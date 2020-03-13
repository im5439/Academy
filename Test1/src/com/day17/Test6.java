package com.day17;

import java.io.FileOutputStream;

//FileOutputStream

public class Test6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");

			int data;

			System.out.print("문자열 입력?");// abc

			while ((data = System.in.read()) != -1) {

				fos.write(data);// 엔터까지
				fos.flush();// OutPutStream은 엔터를 쳐야함
			}

		} catch (Exception e) {

		}

	}

}
