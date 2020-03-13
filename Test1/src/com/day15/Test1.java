package com.day15;

class MyException extends Exception {

	private static final long serialVersionUID = 1L; // 아무의미없는 코딩

	public MyException(String msg) {
		super(msg);
	}

}

public class Test1 {

	private int value;

	public void setValue(int value) throws MyException {

		if (value < 0)
			throw new MyException("수는 0보다 작을수 없습니다.");
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
