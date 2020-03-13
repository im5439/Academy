package com.day13;

import java.util.Iterator;
import java.util.Vector;

// Collection Framework(���)  
// List(I) - (ArrayList(�񵿱�ȭ),  Vector(����ȭ����-����))
// Map(I) - ( HashMap, TreeMap, Hashtable) �ٽ�

// MS : OS�� F/w ����,  datnet F/w(C#)���� ���� �� �ٸ� os(datnet f/w��ġ��)���� ����Ҽ� ���� 

public class Test1 {
	
	private static final String city[] =
		{"����","�λ�","�뱸","��õ","����","����","���"};

	public static void main(String[] args) {
		
		//Generic:<String>
		Vector<String> v = new Vector<String>(); // Vector�� �ڷ����� Object
		
		for(String c : city) {
			v.add(c); // UPCAST   String c -> Vector v(object)
		}
		
//		v.add(10);  - int�� ����
		
		String str;
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		//���1
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		//���2
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		// Iterator(�ݺ���) for�� ��� ��
		// Collection ���� ��±�
		
		//���3
		Iterator<String> it = v.iterator(); // copy
		
		while(it.hasNext()) { // hasNext() �����Ͱ� ������ ����
			
			str = it.next(); // �����͸� �о��  move
			System.out.print(str + " ");
			
		}
		System.out.println("\n----------------");
		
		while(it.hasNext()) { // <-- ��� �ȵ� Iterator<String> it1 = v.iterator(); �����������. ������ �ٸ���
			
			str = it.next(); 
			System.out.print(str + " ");
			
		}
		
	}

}
