package com.day14;

// ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();

		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");

		Iterator<String> it = lists.iterator();

		while (it.hasNext()) {

			String str = it.next();
			System.out.print(str + " ");

		}
		System.out.println();

		ListIterator<String> it1 = lists.listIterator(); // move - �ѹ� �� �Ƚᵵ ��.

		while (it1.hasNext()) {

			System.out.print(it1.next() + " ");

		}
		System.out.println();

		while (it1.hasPrevious()) {
			System.out.print(it1.previous() + " ");
		}
		System.out.println("\n---------------------");

		List<String> lists1 = new ArrayList<>();

		lists1.addAll(lists); // collection �ȿ� collection�� �� �� �ִ�.
		lists1.add("��õ");

		int n = lists1.indexOf("�λ�");
		lists1.add(n + 1, "����");
		
		for(String s : lists1) {
			System.out.print(s + " ");
		}
		System.out.println("\n---------------------");
		
		List<String> lists2 = new ArrayList<>();
		
		lists2.add("�ڹ����α׷���");
		lists2.add("�����ӿ�ũ");
		lists2.add("�ڹٶ�?");
		lists2.add("����");
		lists2.add("������");

		String str;
		
		Iterator<String> it2 = lists2.iterator();
		
		while(it2.hasNext()) {
			
			str = it2.next();
			if(str.startsWith("�ڹ�")) { // "�ڹ�" ��� ���ڷ� �����ߴ���
				System.out.println(str);
			}
			
		}
		
	}

}
