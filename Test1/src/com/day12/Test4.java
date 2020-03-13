package com.day12;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() {

	}

	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {   //비교하려고 만듬. 사용안함
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;

	}

	@Override
	public void write() {
		System.out.println(hak + ":" + name + ":" + total());
	}
	
	public boolean equals(Object ob) { // ob1.equals(ob2)   UPCAST 됨.
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) {
			
			TestImpl t = (TestImpl)ob; // downcast
			
				if(t.hak.equals(hak) && name.equals(t.name)){
					flag = true;
					
				}
			}
			
		return flag;
	}

}

public class Test4 {

	public static void main(String[] args) {

		TestImpl ob1 = new TestImpl("11111111", "abc", 80, 90);
		TestImpl ob2 = new TestImpl("11111111", "abc", 100, 100);

		if (ob1.equals(ob2)) { // Object
			System.out.println("ob1과 ob2는 동일 인물!! ");
		} else
			System.out.println("ob1과 ob2는 안 동일 인물!! ");
		
		ob1.write();
		ob2.write();
		
	}

}
