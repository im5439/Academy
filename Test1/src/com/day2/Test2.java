package com.day2;

class Test2 {

	public static void main(String[] args) {

		//�ڷ���(������),����
		int a = 20;
		int b = 5;
		//int a = 20, b = 5;

		int c,d;

		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);//������ ��
		//System.out.println(d);//������ ��
		
		c = a+b;	//20+5
		d = a-b;	//20-5

		System.out.println(c);//25
		System.out.println(d);//15


		System.out.println(a + " + " + b + " = " + c);//20+5=25
		System.out.println(a + " - " + b + " = " + d);//20-5=15


		System.out.printf("%d + %d = %d %n",a,b,c);
		System.out.printf("%d - %d = %d \n",a,b,d);
		System.out.println();
		//System.out.print(); error(�ݵ�� ���� �Է�)


	
	}
}
