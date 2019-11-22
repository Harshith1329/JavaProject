package com.pac1;

//default / package access specifier

class C2 extends A2 {

	
	public static void main(String[] args) {
		
		System.out.println(i);  		// inheritance of class A2 from same package (static)
		C2 ob = new C2();
		System.out.println(ob.j);		// inheritance of class A2 from same package (non static)
	}
}
