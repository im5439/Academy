package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

//		4. �⵵�� �Է¹ް�, �������� �ƴ����� ���.
//		��) 2010 �Է½� -> 2010 => ���
//		    2012 �Է½� -> 2012 => ����
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year;
		String leapsyear;
		
		System.out.print("�⵵�� �Է��ϼ���. ");
		year = Integer.parseInt(br.readLine());
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leapsyear = "����";
		} else {
			leapsyear = "���";
		}
		
		System.out.println(year + " => " + leapsyear);
		
		
		
	}

}
