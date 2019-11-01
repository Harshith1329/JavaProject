package com.staticmembers;

class SM2 {

	static int i; 		//Defined Inside Class Body
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;			// Defined Inside Method Body 
		System.out.println(i);
		System.out.println(SM2.i);
		m1();
		System.out.println(SM2.i);
	}
	
	public static void m1()
	{
		i=10;
		System.out.println(i);
		
	}

	public static void m2()
	{
		System.out.println("from m2 of SM2");
	}
}
