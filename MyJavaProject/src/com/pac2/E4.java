package com.pac2;

import com.pac1.A4;

//public access specifier

class E4 extends A4 {

public static void main(String[] args) {
		
		System.out.println(i);   // CTE --> inheritance of class A4 from different package (static)
		E4 ob = new E4();
		System.out.println(ob.j); // CTE-->	inheritance of class A4 from different package (non static)
	}
	
}
