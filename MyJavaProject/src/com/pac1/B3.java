package com.pac1;

// protected access specifier 

class B3 {

		public static void main(String[] args) {
		
		System.out.println(A3.i);		// accessing class A3 from different class but same package (static)
		A3 ob = new A3();
		System.out.println(ob.j);	// accesssing class A3 from different class but same package (non static)
	}
}
