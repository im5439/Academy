package com.day8;

import java.util.Scanner;

//private  - 접근지정자
//this(ME)

class Circle {

	private int r; // 정보의 은닉화(캡슐화)

	// 초기화 메소드 
	public void setData(int r) { //setData(int r,Circle this)
		this.r = r;
	}

	public double area() { //area(Cirecle this)

		return this.r * this.r * 3.14;

	}

	public void write(double a) { //write(double a, Circle this)

		System.out.println("반지름 : " + r);
		System.out.println("넓이 : " + a);

	}

}

public class Test1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Circle ob = new Circle();
		
		int r;
		
		System.out.print("반지름? ");
		r = sc.nextInt();

		ob.setData(r);  // setData(r,ob)
		double a = ob.area(); // ob, area
		ob.write(a); // write(double a)
	}

}
