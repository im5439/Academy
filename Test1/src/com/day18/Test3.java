package com.day18;

import java.io.BufferedReader;
import java.io.FileReader;

// FileReader
// 파일에서 바이트를 읽어들여 문자, 바이트 스트림으로 변환

public class Test3 {

	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("d:\\doc\\test.txt");  // FileReader가 2바이트로 바꿈
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				
				System.out.println(str);
				
				fr.close();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
