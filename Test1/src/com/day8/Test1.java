package com.day8;

import java.util.Scanner;

//private  - ����������
//this(ME)

class Circle {

	private int r; // ������ ����ȭ(ĸ��ȭ)

	// �ʱ�ȭ �޼ҵ� 
	public void setData(int r) { //setData(int r,Circle this)
		this.r = r;
	}

	public double area() { //area(Cirecle this)

		return this.r * this.r * 3.14;

	}

	public void write(double a) { //write(double a, Circle this)

		System.out.println("������ : " + r);
		System.out.println("���� : " + a);

	}

}

public class Test1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Circle ob = new Circle();
		
		int r;
		
		System.out.print("������? ");
		r = sc.nextInt();

		ob.setData(r);  // setData(r,ob)
		double a = ob.area(); // ob, area
		ob.write(a); // write(double a)
	}

}
