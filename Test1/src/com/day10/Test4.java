package com.day10;

// String - class
// ����ϴ� �󵵴� ���� �����ϴ� �����ʹ� ũ��.
// �Һ��� ��Ģ


public class Test4 {

	public static void main(String[] args) {
		
	String ob1 = "Seoul";
	String ob2 = "Seoul";
	String ob3 = new String("Seoul");
	
	System.out.println("ob1==ob2: " + (ob1==ob2)); // true
	System.out.println("ob1==ob3: " + (ob1==ob3)); // false
	System.out.println("ob1.equals(ob3): " + ob1.equals(ob3)); // true
	//���ڴ� equals�� �� �ؾ��Ѵ�. object�� equals�� �������̵� �Ѱ�.
	
	ob2 = "korea"; // �ѹ� ������ "seoul" �����ȵǰ� "korea"�� ���� ������ �ּҸ� �ٲ�
	System.out.println("ob1==ob2: " + (ob1==ob2)); // false
	
	ob2 = "japan";
	System.out.println("ob1==ob2: " + (ob1==ob2)); // false

	ob2 = "Seoul"; // �ּ� ���� �ٲ�, �ѹ� ����� ���� ������ ����.
	System.out.println("ob1==ob2: " + (ob1==ob2)); // true
	
	System.out.println(ob2);
	System.out.println(ob2.toString());
	
	}

}
