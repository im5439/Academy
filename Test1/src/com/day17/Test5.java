package com.day17;

import java.io.FileInputStream;

//FileInputStream

public class Test5 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			int data;
			while((data=fis.read())!=-1) {
				
				//System.out.print((char)data);
				System.out.write(data); //���ͱ��� �д´�
				System.out.flush();
			}
			
			fis.close();
		
		} catch (Exception e) { //�޸��� ANSI
			
		}

	}

}
