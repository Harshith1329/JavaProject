package com.pac2;

import com.pac1.A3;

// protected access specifier

class E3 extends A3 {

public static void main(String[] args) {
		
		System.out.println(i);   // inheritance of class A3 from different package (static)
		E3 ob = new E3();
		System.out.println(ob.j); // inheritance of class A3 from different package (non static)
	
		A3 ob1 = new A3();
		System.out.println(ob1.i); // --> cannot access using parent class object 
	}
}
