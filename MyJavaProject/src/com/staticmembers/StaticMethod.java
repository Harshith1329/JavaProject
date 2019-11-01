package com.staticmembers;

class StaticMethod {
	static int i;
	public static void main(String[] args) {
		SM2.m2();
		SM2.m1();
		
		System.out.println(SM2.i); // "i" is variable of class SM2
		System.out.println(i);  //"i" is global variable of class StaticMethod 
		SM1.test();   	// It will execute SIB of SM1 also
	}
	
}
