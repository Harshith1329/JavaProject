package com.miscellaneous;

// St From St --> access 1.Directly 2.Using ClassName

public class StFromSt {
	
	static int i;
	static void test()
	{
		i=20;
		System.out.println(i);
		System.out.println(StFromSt.i);
	}
	
	public static void main(String[] args) {
		StFromSt.test();
	}

}
