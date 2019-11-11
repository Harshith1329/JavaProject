package com.pac2;

import com.pac1.A3;

// protected access specifier

class D3 {

public static void main(String[] args) {
		
		System.out.println(A3.i); 	// CTE --> accessing class A from different package (static)
		A3 ob = new A3();
		System.out.println(ob.j);  // CTE --> accessing class A from different package (non static)
	}
	
}
