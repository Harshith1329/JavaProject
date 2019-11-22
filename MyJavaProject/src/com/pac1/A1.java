package com.pac1;

// private access specifier

class A1 {

	private static int i;
	private int j;
	
	private A1() {}

	
	public static void main(String[] args) {
		System.out.println(i);			// accessing private (static) member from same class
		A1 ob = new A1();
		System.out.println(ob.j); 		// accessing private (non static) member from same class
	}
}


// X and Y (com.pac1) --> private constructors