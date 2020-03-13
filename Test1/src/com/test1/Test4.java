package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

//		4. 년도를 입력받고, 윤년인지 아닌지를 출력.
//		예) 2010 입력시 -> 2010 => 평년
//		    2012 입력시 -> 2012 => 윤년
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year;
		String leapsyear;
		
		System.out.print("년도를 입력하세요. ");
		year = Integer.parseInt(br.readLine());
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leapsyear = "윤년";
		} else {
			leapsyear = "평년";
		}
		
		System.out.println(year + " => " + leapsyear);
		
		
		
	}

}
