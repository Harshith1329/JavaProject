package com.miscellaneous;

class MainB {

	public static void main(String[] args) {
		
		// Type 1 
		B obj1 = B.createObject();
		obj1.initialize(10);
		obj1.display();
		
		System.out.println("***********");
		
		
		// Type 2 : Chaining of two methods
		B obj2 = B.createObject().initialize(20);
		obj2.display();
		
		System.out.println("***********");
		// Type 3 : Chaining of three methods
		B.createObject().initialize(30).display();   // method chaining

		
	}

}
