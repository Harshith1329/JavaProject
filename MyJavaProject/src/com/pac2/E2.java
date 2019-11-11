package com.pac2;

import com.pac1.A2;

// default / package access specifier

class E2 extends A2 {

	public static void main(String[] args) {
		
		System.out.println(i);   // CTE --> inheritance of class A2 from different package (static)
		E2 ob = new E2();
		System.out.println(ob.j); // CTE-->	inheritance of class A2 from different package (non static)
	}
}
