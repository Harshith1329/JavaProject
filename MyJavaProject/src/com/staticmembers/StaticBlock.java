package com.staticmembers;

class StaticBlock {

	static int i;
	
	static
	{
		System.out.println("from Sib1");
		System.out.println(i);
		i=20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		System.out.println(i);
	}
	
	static 
	{
		System.out.println("from Sib2");
	}

}
