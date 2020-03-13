package com.day13;

import java.util.Iterator;
import java.util.Vector;

// Collection Framework(방법)  
// List(I) - (ArrayList(비동기화),  Vector(동기화지원-느림))
// Map(I) - ( HashMap, TreeMap, Hashtable) 핵심

// MS : OS에 F/w 내장,  datnet F/w(C#)으로 만든 언어를 다른 os(datnet f/w설치시)에서 사용할수 있음 

public class Test1 {
	
	private static final String city[] =
		{"서울","부산","대구","인천","광주","대전","울산"};

	public static void main(String[] args) {
		
		//Generic:<String>
		Vector<String> v = new Vector<String>(); // Vector의 자료형은 Object
		
		for(String c : city) {
			v.add(c); // UPCAST   String c -> Vector v(object)
		}
		
//		v.add(10);  - int값 못들어감
		
		String str;
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		//방법1
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		//방법2
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		// Iterator(반복자) for문 대신 씀
		// Collection 전용 출력기
		
		//방법3
		Iterator<String> it = v.iterator(); // copy
		
		while(it.hasNext()) { // hasNext() 데이터가 있을때 까지
			
			str = it.next(); // 데이터를 읽어옴  move
			System.out.print(str + " ");
			
		}
		System.out.println("\n----------------");
		
		while(it.hasNext()) { // <-- 출력 안됨 Iterator<String> it1 = v.iterator(); 생성해줘야함. 변수명 다르게
			
			str = it.next(); 
			System.out.print(str + " ");
			
		}
		
	}

}
