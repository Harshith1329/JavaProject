package com.pac1;

// public access specifier

class C4 extends A4 {

	public static void main(String[] args) {
		
		System.out.println(i);  		// inheritance of class A4 from same package (static)
		C4 ob = new C4();
		System.out.println(ob.j);		// inheritance of class A4 from same package (non static)

	}

}
