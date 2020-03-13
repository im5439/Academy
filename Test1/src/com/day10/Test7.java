package com.day10;

//String의 메소드

public class Test7 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String[] ss = s1.split(","); // String값을 ","로 나눠서 배열로 저장

		for (String s : ss)
			System.out.print(s + " ");
		System.out.println();

		String s2 = "seoul";
		String s3 = "SeOul";

		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equalsIgnoreCase(s3)); // true - 대소문자 구분하지않고 비교 equalsIgnoreCase()

		String s4 = "abc.def.ghi";
		//           012345678910
		System.out.println(s4.indexOf(".")); // 3       앞에서 부터
		System.out.println(s4.lastIndexOf(".")); // 7   뒤에서 부터
		System.out.println(s4.indexOf("def")); // 4
		System.out.println(s4.indexOf("x")); // -1      데이터 없다 : -1
		// if(s4.indexOf('x') != -1) => s4의 데이터가 있으면 이라는 뜻

		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓"); // regex : 정규화표현식 
		System.out.println(s6); // 우리나라 大韓민국 좋은나라 大韓민국
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // 양 쪽 공백을 없앤다.
		System.out.println(s7.replaceAll(" ", "")); // 공백을 ""(null)로 바꿔라.
		System.out.println(s7.replaceAll("\\s", ""));
	
		char ch = "abcdefg".charAt(2);
		//         0123456
		System.out.println(ch); // 2에 있는 값 c
		
		System.out.println("abcdefg".length()); // 7
		
		System.out.println("abcdefg".startsWith("abc")); // true  - 시작값이 abc로 시작되는가
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//사전식 정렬
		System.out.println(s8.compareTo(s9));
		System.out.println(s8.compareTo(s8));
		
		
	
	}

}
