package com.naver;


public class MyException {

	public void inputformat(String set) throws Exception {

		// 숫자 ascii 48~57
		for (int i = 0; i < set.length(); i++) {
			char temp = set.charAt(i);
			if (temp < 48 || temp > 57) {
				throw new Exception("숫자만 입력 가능합니다.");
			}

		}

	}
	
}

class MyException2 {
	
	public void idSearch(String id1, String id2) throws Exception {
		
		
	}
	
}
