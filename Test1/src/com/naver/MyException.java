package com.naver;


public class MyException {

	public void inputformat(String set) throws Exception {

		// ���� ascii 48~57
		for (int i = 0; i < set.length(); i++) {
			char temp = set.charAt(i);
			if (temp < 48 || temp > 57) {
				throw new Exception("���ڸ� �Է� �����մϴ�.");
			}

		}

	}
	
}

class MyException2 {
	
	public void idSearch(String id1, String id2) throws Exception {
		
		
	}
	
}
