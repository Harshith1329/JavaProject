package com.inheritance;

class B extends A {

	static int j = 20;
	static
	{
		System.out.println("from SIB of B");
	}
	
	static void test1()
	{
		System.out.println("from test1() of B");
	}
}
