package com.pac1;

// default / package access specifier

public class A2 {

	static int i;
	int j;
	
	private A2() {}
	
	public static void main(String[] args) {
		System.out.println(i); 		// accessing class A2 from same class and same package (static)
		A2 ob = new A2();
		System.out.println(ob.j);	// accessing class A2 from same class and same package (non static)
	}
}
