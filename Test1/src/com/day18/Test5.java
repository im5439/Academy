package com.day18;

import java.io.StringReader;
import java.io.StringWriter;

// StringReader
// StringWriter

public class Test5 {

	public static void main(String[] args) {

		try {
			
			int ch;
			String str = "Hello.....!!";

			StringReader sr = new StringReader(str);
			StringWriter sw = new StringWriter();

			while ((ch = sr.read()) != -1) {
				sw.write(ch);
			}
			
			System.out.println(sw.toString());

			StringBuffer sb = sw.getBuffer();
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
