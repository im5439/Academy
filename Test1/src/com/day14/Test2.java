package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

// Map <키,값> - List  (interface)
// HashTable -  Vector   동기화지원
// HashMap -  ArrayList  비동기화

// 키는 중복값을 가질수 없다.
// 키가 중복값이면 마지막값이 저장(수정)
// Map은 Iterator가 없다.
// put(키, 값) - 데이터 입력

public class Test2 {

	public static final String name[] = { // value
			"배수지","유인나","안젤리나","공효진","홍길동"
	};
	
	public static final String tel[] = { // key 
		"111-111", "222-222", "333-333", "111-111", "444-444" };

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}
		
		System.out.println(h); // key값이 같으면 수정이 됨. 배수지 -> 공효진
		
		
		String str;
		str = h.get("111-111"); // key값으로 value를 검색
		
		System.out.println(str);
		
		//키가 존재하는지 검사   - 값 검사보다 많이씀
		if(h.containsKey("222-222")) {
			System.out.println("222-222 있다.");
		} else
			System.out.println("222-222 없다.");
		
		//값이 존재하는지 검사
		if(h.containsValue("안젤리나")) {
			System.out.println("안젤리나 있다.");
		} else
			System.out.println("안젤리나 없다.");
		
		//삭제    key를 삭제하면 value도 삭제
		h.remove("222-222");
		if(h.containsKey("222-222")) {
			System.out.println("222-222 있다.");
		} else
			System.out.println("222-222 없다.");
		System.out.println("----------------------");
		
		//Iterator<key의 자료형>
		Iterator<String> it = h.keySet().iterator(); // map은 keySet()
		
		while(it.hasNext()) {
			
			String key = it.next();    // key를 꺼냄
			String value = h.get(key);
			
			System.out.println(key + " " + value);
			
		}
		
	}

}
