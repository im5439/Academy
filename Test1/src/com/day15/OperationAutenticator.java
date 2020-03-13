package com.day15;

public class OperationAutenticator {

	public void inputFormat(String str) throws AuthenticatorException {
		
		String[] temp = str.split(",");
		
		if(temp.length != 2) {
			throw new AuthenticatorException("���� �Է� ���� ����!!: " + str);
		}
		
	}
	
	@SuppressWarnings("unused") // ������� ���� ������ �ִ���� ��� ǥ�� X
	public void number(String str) throws AuthenticatorException {
		
		try {
			
			if(str.indexOf(".") != -1) { // �Ǽ�
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}
			
		} catch (NumberFormatException e) {
			throw new AuthenticatorException("���� ��ȯ �Ұ�!!: " + str);
		}
		
	}
	
	public void operator(char ch) throws AuthenticatorException {
		
		switch(ch) {
		case '+':case '-':case '*':case '/':
			return;
		default:
			throw new AuthenticatorException("������ ����!!: " + ch);
		}
		
	}
	
	
}
