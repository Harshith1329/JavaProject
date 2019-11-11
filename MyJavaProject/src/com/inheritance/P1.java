package com.inheritance;

// P1--> Parent Class 

// non static variables and IIB (non static block) 

class P1 {

	int i;
	
	{
		System.out.println("from IIB of P1");
	}
	
	P1()
	{
		System.out.println("from P1()");
	}
	
}
