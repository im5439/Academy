package com.day10;

//String�� �޼ҵ�

public class Test7 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String[] ss = s1.split(","); // String���� ","�� ������ �迭�� ����

		for (String s : ss)
			System.out.print(s + " ");
		System.out.println();

		String s2 = "seoul";
		String s3 = "SeOul";

		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equalsIgnoreCase(s3)); // true - ��ҹ��� ���������ʰ� �� equalsIgnoreCase()

		String s4 = "abc.def.ghi";
		//           012345678910
		System.out.println(s4.indexOf(".")); // 3       �տ��� ����
		System.out.println(s4.lastIndexOf(".")); // 7   �ڿ��� ����
		System.out.println(s4.indexOf("def")); // 4
		System.out.println(s4.indexOf("x")); // -1      ������ ���� : -1
		// if(s4.indexOf('x') != -1) => s4�� �����Ͱ� ������ �̶�� ��

		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����"); // regex : ����ȭǥ���� 
		System.out.println(s6); // �츮���� ���۹α� �������� ���۹α�
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // �� �� ������ ���ش�.
		System.out.println(s7.replaceAll(" ", "")); // ������ ""(null)�� �ٲ��.
		System.out.println(s7.replaceAll("\\s", ""));
	
		char ch = "abcdefg".charAt(2);
		//         0123456
		System.out.println(ch); // 2�� �ִ� �� c
		
		System.out.println("abcdefg".length()); // 7
		
		System.out.println("abcdefg".startsWith("abc")); // true  - ���۰��� abc�� ���۵Ǵ°�
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//������ ����
		System.out.println(s8.compareTo(s9));
		System.out.println(s8.compareTo(s8));
		
		
	
	}

}
