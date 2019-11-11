package com.miscellaneous;

// Nst From Nst --> access 1.Directly or 2.Using "this"

public class NstFromNst {

	int i=10;
	void test()
	{
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		 NstFromNst ob1 = new  NstFromNst();
		 ob1.test();
		
	}
}
