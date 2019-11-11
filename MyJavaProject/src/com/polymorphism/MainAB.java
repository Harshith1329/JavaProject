package com.polymorphism;

public class MainAB {

	public static void main(String[] args) {
		
		A ob;
		ob = new A();	// just object creation
		ob.test();		// from test() of A
		
		ob = new B();	// upcasting
		ob.test();		// from test() of B

		ob = new C();
		ob.test();
	}

}
