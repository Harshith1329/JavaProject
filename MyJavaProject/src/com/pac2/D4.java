package com.pac2;

import com.pac1.A4;

//public access specifier

class D4 {

public static void main(String[] args) {
		
		System.out.println(A4.i); 	// CTE --> accessing class A4 from different package (static)
		A4 ob = new A4();
		System.out.println(ob.j);  // CTE --> accessing class A4 from different package (non static)
	}
	
}
