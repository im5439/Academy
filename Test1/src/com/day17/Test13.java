package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test13 {

	public static void main(String[] args) {
		
		String str1 = "d:\\doc\\temp\\java1\\test.tst";
		
		//规过1
		
		/*String path = str1.substring(0,str1.lastIndexOf("\\"));
		System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();
			
		}*/
		
		
		//规过2
		
		File f = new File(str1);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		
		try {
			
			FileOutputStream fos = new FileOutputStream(str1);
			
			System.out.print("巩磊凯?");
			
			int data;
			while((data=System.in.read())!=-1) {
				
				fos.write(data);
				fos.flush();
				
			}
			fos.close();
			
			
		} catch (Exception e) {
			
		}
		
	}

}
