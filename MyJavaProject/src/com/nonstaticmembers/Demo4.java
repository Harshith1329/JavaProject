package com.nonstaticmembers;

class Demo4 {

	void m1()		// non static method (context) 
	{
		System.out.println("from m1");	
		System.out.println(this);	
		
		// 'this' can be used only in non static context  
		
	}
	
	void m2()
	{
		System.out.println("from m2");
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		Demo4 ob1 = new Demo4();
		Demo4 ob2 = new Demo4();
		
		System.out.println(ob1);	// Demo@123
		System.out.println(ob2);	// Demo@124
	
		ob1.m1();   		// Demo4@123
		ob1.m2();			// Demo4@123
		ob2.m1();			// Demo4@124
		ob2.m2();			// Demo4@124
	}
}