package com.nonstaticmembers;

class Demo5 {

	int i =10;
	
	// Demo5 ob4 = new Demo5();  --> only inside the method under execution
	
	void m1()		// non static method (context) 
	{
		Demo5 ob3 = new Demo5();
		//System.out.println("from m1");	
		System.out.println(this);	
		
		System.out.println(ob3.i);  
		
	}
	
	void m2()
	{
		Demo5 ob4 = new Demo5();
		
		System.out.println("from m2");
		System.out.println(this);
		
		System.out.println(this.i);  // using non static variables using 'this' 
		System.out.println(i);			// using non static variables directly 
		
		System.out.println(ob4.i);
	}
	
	public static void main(String[] args) {
		
		Demo5 ob1 = new Demo5();
		Demo5 ob2 = new Demo5();
		
		System.out.println(ob1.i);	// Demo@123
		System.out.println(ob2.i);	// Demo@124
	
		ob1.m1();
		ob1.m2();
		
	}
}
