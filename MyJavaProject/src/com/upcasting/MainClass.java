package com.upcasting;

class MainClass {

	public static void main(String[] args) {

		A ob1 = new B(); 	// Upcasting
		System.out.println(ob1.i);
		// System.out.println(ob1.j);  --> CTE : using parent type ref var 
										// we cant access members of child class

		B ob2 = new B();	// Object creation of same class type as constructor
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3 = ob2;		// Upcasting
		System.out.println(ob3.i);
		// System.out.println(ob3.j);  --> CTE : using parent type ref var 
		// we cant access members of child class
		
	}

}
