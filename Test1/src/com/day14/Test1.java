package com.day14;

// ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();

		lists.add("서울");
		lists.add("부산");
		lists.add("대구");

		Iterator<String> it = lists.iterator();

		while (it.hasNext()) {

			String str = it.next();
			System.out.print(str + " ");

		}
		System.out.println();

		ListIterator<String> it1 = lists.listIterator(); // move - 한번 더 안써도 됨.

		while (it1.hasNext()) {

			System.out.print(it1.next() + " ");

		}
		System.out.println();

		while (it1.hasPrevious()) {
			System.out.print(it1.previous() + " ");
		}
		System.out.println("\n---------------------");

		List<String> lists1 = new ArrayList<>();

		lists1.addAll(lists); // collection 안에 collection이 들어갈 수 있다.
		lists1.add("인천");

		int n = lists1.indexOf("부산");
		lists1.add(n + 1, "광주");
		
		for(String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println("\n---------------------");
		
		List<String> lists2 = new ArrayList<>();
		
		lists2.add("자바프로그래머");
		lists2.add("프레임워크");
		lists2.add("자바란?");
		lists2.add("서블릿");
		lists2.add("스프링");

		String str;
		
		Iterator<String> it2 = lists2.iterator();
		
		while(it2.hasNext()) {
			
			str = it2.next();
			if(str.startsWith("자바")) { // "자바" 라는 문자로 시작했는지
				System.out.println(str);
			}
			
		}
		
	}

}
