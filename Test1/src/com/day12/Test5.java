package com.day12;

import java.util.Scanner;

interface FruitA {

	String Won = "원";

	public int getPrice();

	public String getName();

}

interface ItemFruit extends FruitA {

	public String getItems();

}

class Orange implements ItemFruit {

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}

}

class Apple implements ItemFruit {

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}

}

public class Test5 {

	public void packing(ItemFruit ob) { // <--- new Orange() , new Apple()
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();

		System.out.print("1.오렌지? 2.사과? ");
		int n = sc.nextInt();

		if (n == 1) {
			t.packing(new Orange()); // ---> (ItemFruit ob)
		} else
			t.packing(new Apple()); // ---> (ItemFruit ob)

		// 아래의 코딩과 같음
		
		//Orange ob = new Orange();
		
		// ItemFruit ob = new Orange();
		/*
		 * ItemFruit ob;
		 * 
		 * ob = new Orange(); // Orange ob1 = new Orange();
		 * System.out.println(ob.getItems());
		 * System.out.println(ob.getName());
		 * System.out.println(ob.getPrice()+ FruitA.Won);
		 * 
		 * ob = new Apple(); // Apple ob2 = new Apple();
		 * System.out.println(ob.getItems());
		 * System.out.println(ob.getName());
		 * System.out.println(ob.getPrice()+ FruitA.Won);
		 */

		/*
		 * int a;
		 * 
		 * a = 10; system.out.println(a); // 10
		 * 
		 * a = 20; system.out.println(a); // 20
		 * 
		 * 
		 * 
		 */

	}

}
