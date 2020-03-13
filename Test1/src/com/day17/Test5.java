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
				System.out.write(data); //엔터까지 읽는다
				System.out.flush();
			}
			
			fis.close();
		
		} catch (Exception e) { //메모장 ANSI
			
		}

	}

}
