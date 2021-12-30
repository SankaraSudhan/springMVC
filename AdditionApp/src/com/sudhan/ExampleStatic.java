package com.sudhan;

public class ExampleStatic {
	public static void main(String[] args) {
		
		Anotherclass ac = new Anotherclass();
		Anotherclass ac1 = new Anotherclass();
		System.out.println(ac.integer);
		ac.integer=ac.integer+1;
		System.out.println(ac.integer);
		System.out.println(ac1.integer);
		
	}
	
}
