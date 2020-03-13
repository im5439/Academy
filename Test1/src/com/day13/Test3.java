package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test3 {

	private static final String city[] =
		{"서울","부산","대구","인천","광주","대전","울산"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		String str;
		
		System.out.println("벡터 초기 용량 : " + v.capacity()); // 10
		
		for(String c : city)
			v.add(c);
		System.out.println();
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("데이터(요소)의 갯수 : " + v.size()); // 7
		System.out.println("---------------------------------");
		
		// 치환
		v.set(0, "Seoul");
		v.set(1, "Busan");
		
		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");

		// 삽입
		v.insertElementAt("대한민국", 0);
		
		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
	
		// 검색
		int index = v.indexOf("대구"); //3
		System.out.println(index);
		
		if(index != -1) {
			System.out.println("검색성공 : " + index);
		} else
			System.out.println("검색실패 : " + index); // -1
		System.out.println("---------------------------------");
		
		// 오름차순
		Collections.sort(v);
		
		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		
		// 내림차순                   방법
		Collections.sort(v, Collections.reverseOrder());

		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");

		// 삭제
		v.remove("Busan"); // 7 넣어도 삭제 됨
		
		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		// 용량 증가
		for(int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));
		}
		
		for(String c : v){
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size());
		System.out.println("---------------------------------");
		
		//특정범위 삭제
		for(int i = 1; i <=10; i++) {    // 5 ~ 10까지 데이터 삭제
			v.remove(5);
		}

		for(String c : v){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size());
		System.out.println("---------------------------------");
		
		// 빈 공간 벡터 삭제
		v.trimToSize();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size());
		System.out.println("---------------------------------");
		
		// 모든데이터 삭제
		v.clear();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size());
		System.out.println("---------------------------------");
		
		// 빈 공간 벡터 삭제
		v.trimToSize();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size());
	}

}
