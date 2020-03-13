package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일 복사

public class Test7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 원본파일? d:\\doc\\test.txt
		// 대상 파일? d:\\doc\\out1.txt
		// 복사완료!!

		try {

			Scanner sc = new Scanner(System.in);

			String str1, str2;
			int data;

			System.out.print("원본파일? ");
			str1 = sc.next();

			System.out.print("대상파일? ");
			str2 = sc.next();

			FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);

			while ((data = fis.read()) != -1) {
				fos.write(data);
				fos.flush();
			}

			fis.close();
			fos.close();

			System.out.println("복사 완료!!");

		} catch (Exception e) {

		}

	}

}
