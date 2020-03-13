package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

// Map <Ű,��> - List  (interface)
// HashTable -  Vector   ����ȭ����
// HashMap -  ArrayList  �񵿱�ȭ

// Ű�� �ߺ����� ������ ����.
// Ű�� �ߺ����̸� ���������� ����(����)
// Map�� Iterator�� ����.
// put(Ű, ��) - ������ �Է�

public class Test2 {

	public static final String name[] = { // value
			"�����","���γ�","��������","��ȿ��","ȫ�浿"
	};
	
	public static final String tel[] = { // key 
		"111-111", "222-222", "333-333", "111-111", "444-444" };

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}
		
		System.out.println(h); // key���� ������ ������ ��. ����� -> ��ȿ��
		
		
		String str;
		str = h.get("111-111"); // key������ value�� �˻�
		
		System.out.println(str);
		
		//Ű�� �����ϴ��� �˻�   - �� �˻纸�� ���̾�
		if(h.containsKey("222-222")) {
			System.out.println("222-222 �ִ�.");
		} else
			System.out.println("222-222 ����.");
		
		//���� �����ϴ��� �˻�
		if(h.containsValue("��������")) {
			System.out.println("�������� �ִ�.");
		} else
			System.out.println("�������� ����.");
		
		//����    key�� �����ϸ� value�� ����
		h.remove("222-222");
		if(h.containsKey("222-222")) {
			System.out.println("222-222 �ִ�.");
		} else
			System.out.println("222-222 ����.");
		System.out.println("----------------------");
		
		//Iterator<key�� �ڷ���>
		Iterator<String> it = h.keySet().iterator(); // map�� keySet()
		
		while(it.hasNext()) {
			
			String key = it.next();    // key�� ����
			String value = h.get(key);
			
			System.out.println(key + " " + value);
			
		}
		
	}

}
