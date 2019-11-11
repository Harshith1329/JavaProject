package com.inheritance;

class A {

	static int i = 10;
	static
	{
		System.out.println("SIB of A");
	}
	
	static void test ()
	{
		System.out.println("from static void test() of A");
	}
}
