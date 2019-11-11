package com.pac1;

// public access specifier

class B4 {

public static void main(String[] args) {
		
		System.out.println(A4.i);		// accessing class A4 from different class but same package (static)
		A4 ob = new A4();
		System.out.println(ob.j);	// accessing class A4 from different class but same package (non static)
	}
	
}
