package com.pac1;

// public access specifier

public class A4 {

	public static int i;
	public int j;
	
	public static void main(String[] args) {
		
		System.out.println(i); 		// accessing class A4 from same class and same package (static)
		A4 ob = new A4();
		System.out.println(ob.j);	// accessing class A4 from same class and same package (non static)
		
		

	}

}
