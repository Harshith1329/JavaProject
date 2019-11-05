package com.constructor;

// understanding imporatance of this() call stmt

class P4 {

	{
		System.out.println("from IIB");
	}
	
	P4()
	{
		System.out.println("from P4()");
	}
	
	P4(int i)
	{
		this();
		System.out.println("from P4(int)");
	}
	
	P4(float f)
	{
		this(10);
		System.out.println("from (float)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P4 ob1 = new P4();
		System.out.println("******");
		
		P4 ob2 = new P4(100);
		System.out.println("++++++");
		
		P4 ob3 = new P4(10.0f);
		
	}

}
