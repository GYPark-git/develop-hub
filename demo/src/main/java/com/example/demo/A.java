package com.example.demo;

public class A {
	
	A a;
	
	public A getInstance() {
		
		if(a == null) {
			a = new A();
		}
		return a;
	}

}
