package com.day12;

// 4.����Ŭ����(Annonymous, �͸���,������ class)    - �ݵ�� ���

public class Test9 {

	public Object getTitle() {
		
		return new Object() {   // new Object(){} ������ Ŭ����
			
			@Override
			public String toString() {
				return "�͸��� Ŭ����";  // ȣ���� �ʿ䰡 ����. getTitle()�� ȣ���ϸ� �ڵ� ���� 
			}
			
		};
		
	}
	
	public static void main(String[] args) {

		Test9 ob = new Test9();
		
		System.out.println(ob.getTitle());
		
	}

}
