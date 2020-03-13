package com.day14;

//눈도장만

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		//Set : 중복값을 허용 안함(Map의 key)
		
		Set<String> s = new HashSet<>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		s.add("서울");
		System.out.println(s); // 중복값 허용 안함
		System.out.println("----------------------------------");
		
		//Stack : 데이터를 저장하는 collection
		Stack<String> st = new Stack<>();
		
		st.add("서울");
		st.push("부산"); // push <- insert
		st.push("대구");
		st.push("광주");
		
		while(!st.empty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
		
		//Queue
		Queue<String> q = new LinkedList<>();
		
		q.add("서울");
		q.offer("부산"); // offer <- insert
		q.offer("대구");
		q.offer("광주");
		
		while(q.peek() != null) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();
		
		List<String> lists1 = new LinkedList<>();
		
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");
		
		List<String> lists2 = new LinkedList<>();
		
		lists2.add("서울");
		lists2.add("부산");
		lists2.add("대구");
		
		lists2.addAll(lists1);  // collection에 collection이 들어갈수 있다. lists1 -> lists2에 추가
		
		for(String ss : lists1) {
			System.out.print(ss + " ");
		}
		System.out.println();
		//-------------------------------
		for(String ss : lists2) {
			System.out.print(ss + " ");
		}
		System.out.println();
		//-------------------------------
		lists2.subList(2, 5).clear();  // 2~5 삭제  (부산 대구 A B) - delete
		for(String ss : lists2) {
			System.out.print(ss + " ");
		}
		System.out.println();
		//-------------------------------

		String[] str = {"나","마","다","가","바","라"};
		
		for(String ss : str)
			System.out.print(ss + " "); // 나 마 다 가 바 라
		System.out.println();
		
		Arrays.sort(str);
		for(String ss : str)
			System.out.print(ss + " "); // 가 나 다 라 마 바
		
	}

}

/*
 
	[List]
	List<저장할자료형> lists = new ArrayList<저장할자료형>(); 
	List<저장할자료형> lists = new Vector<저장할자료형>(); 
	
	ArrayList<저장할자료형> lists = new ArrayList<저장할자료형>(); 
	Vector<저장할자료형> lists = new Vector<저장할자료형>(); 
	
	lists.add(값);  -  입력
	
	Iterator<저장할자료형> it = lists.iterator();  -  출력
	while(it.hasNext()){
		저장할자료형 data = it.next();
		...
	}
	
	----------------------------------------------------------------
	
	[Map]
	Map<키,저장할자료형> map = new HashMap<키,저장할자료형>();
	Map<키,저장할자료형> map = new Hashtable<키,저장할자료형>();
	
	HashMap<키,저장할자료형> map = new HashMap<키,저장할자료형>();
	Hashtable<키,저장할자료형> map = new Hashtable<키,저장할자료형>();
	
 	map.put(키,값);  -  입력
 
	Iterator<키자료형> it = map.keySet().iterator();  -  출력
	while(it.hasNext()){
		키자료형 key = it.next();
		저장할자료형 data = map.get(key);
		...
	}
	
	
 */


