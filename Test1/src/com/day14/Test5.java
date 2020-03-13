package com.day14;

// Generic

class Box2<T> {
	
	private T t;
	
	public void set(T t ) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U> void print(U u) {
		
		System.out.println(u);
		System.out.println("t클래스: " + t.getClass().getName());
		System.out.println("u메소드: " + u.getClass().getName());
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {

		Box2<Integer> b = new Box2<Integer>();
		
		b.set(new Integer(30)); // t : 30
		System.out.println(b.get());
		
		b.print("test");
		b.print(50);
		
	}

}
