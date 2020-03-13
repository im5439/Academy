package com.day15;

class MyException extends Exception {

	private static final long serialVersionUID = 1L; // �ƹ��ǹ̾��� �ڵ�

	public MyException(String msg) {
		super(msg);
	}

}

public class Test1 {

	private int value;

	public void setValue(int value) throws MyException {

		if (value < 0)
			throw new MyException("���� 0���� ������ �����ϴ�.");
		else
			this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Test1 ob = new Test1();
		
		try {
			
			ob.setValue(-20);
			
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println(ob.getValue());
		
		
	}

}
