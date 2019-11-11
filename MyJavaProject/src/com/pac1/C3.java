package com.pac1;

// protected access specifier

class C3 extends A3 {

		public static void main(String[] args) {
		
		System.out.println(i);  		// inheritance of class A3 from same package (static)
		C3 ob = new C3();
		System.out.println(ob.j);		// inheritance of class A3 from same package (non static)
	}
}
