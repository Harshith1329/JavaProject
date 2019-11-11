package com.pac2;

import com.pac1.A2;

//default / package access specifier

class D2 {
	
	public static void main(String[] args) {
		
		System.out.println(A2.i); 	// CTE --> accessing class A from different package (static)
		A2 ob = new A2();
		System.out.println(ob.j);  // CTE --> accessing class A from different package (non static)
	}
}
