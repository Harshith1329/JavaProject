package com.pac1;

// protected access specifier

public class A3 {

	protected static int i;
	protected int j;
	
	public static void main(String[] args) {
		System.out.println(i); 		// accessing class A3 from same class and same package (static)
		A2 ob = new A2();
		System.out.println(ob.j);	// accessing class A3 from same class and same package (non static)
	}
	
}
