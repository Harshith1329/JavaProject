package com.staticmembers;

class SM1 {
	
	int x;          // non static member variables
	static int i =10;  // static member variables
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		i=20;
		System.out.println(SM1.i);
		
		System.out.println(A1.x);
		A1.x=20;
		System.out.println(A1.x);
	}
	
	static
	{
		SM1 ob = new SM1();
		ob.x = 20;
		System.out.println("Static Initialiser Block - executed during class Loading Process of class SM1");
	}
	
	static void test()
	{
		System.out.println("Static Method");
	}

}
