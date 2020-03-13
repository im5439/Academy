package com.day15;

public class OperationAutenticator {

	public void inputFormat(String str) throws AuthenticatorException {
		
		String[] temp = str.split(",");
		
		if(temp.length != 2) {
			throw new AuthenticatorException("숫자 입력 형식 오류!!: " + str);
		}
		
	}
	
	@SuppressWarnings("unused") // 사용하지 않은 변수가 있더라고 경고 표시 X
	public void number(String str) throws AuthenticatorException {
		
		try {
			
			if(str.indexOf(".") != -1) { // 실수
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}
			
		} catch (NumberFormatException e) {
			throw new AuthenticatorException("숫자 변환 불가!!: " + str);
		}
		
	}
	
	public void operator(char ch) throws AuthenticatorException {
		
		switch(ch) {
		case '+':case '-':case '*':case '/':
			return;
		default:
			throw new AuthenticatorException("연산자 오류!!: " + ch);
		}
		
	}
	
	
}
