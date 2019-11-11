package com.pac1;

//default / package access specifier

class B2 {

	public static void main(String[] args) {
		
		System.out.println(A2.i);		// accessing class A2 from different class but same package (static)
		A2 ob = new A2();
		System.out.println(ob.j);	// accesssing class A2 from different class but same package (non static)
	}
}
