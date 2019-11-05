package com.constructor;

class MainClass {
		
	public static void main(String[] args) {
		// Demo1 ob =new Demo1();  ---> Default Constructor
		
		System.out.println("Main of MainClass Started");
									// Constructor executes only during object creation
		Demo1 ob1 = new Demo1(); 	// user defined constructor is referred
									// Constructor gets memory in method area
									// not in class static area
		// ob.Demo1(); ---> CTE - cannot can be called using obj ref variable
 		Demo1 ob2 = new Demo1(); 
		
		System.out.println("main of MainClass ends");
	}
}
