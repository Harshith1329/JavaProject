package com.nonstaticmembers;

class Demo3 {	
	
	void m1()		// non static method (context) 
	{
		System.out.println("from m1");	
		System.out.println(this);	// Demo3@123
		
		// 'this' can be used only in non static context  
		// because ob1 is local variable of main
		
	}
	
	void m2()
	{
		System.out.println("from m2");
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		Demo3 ob1 = new Demo3();
		
		
		System.out.println(ob1); 		// Demo3@123
		ob1.m1();   //we call non static method using object reference variable 
		
		
	}
}
