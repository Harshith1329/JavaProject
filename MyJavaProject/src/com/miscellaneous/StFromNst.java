package com.miscellaneous;

// St From Nst --> access 1.Directly or 2.Using ClassName

class StFromNst {

	static int i=10;
	void test()
	{
		System.out.println(i);
		System.out.println(StFromNst.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StFromNst ob1 = new StFromNst();
		ob1.test();
		
	
	}

}
