package com.instanceOf;

public class MainClass {

	public static void main(String[] args) {
											//	Execution Output
		A ob1 = new B();
		System.out.println(ob1 instanceof A); 	//true
		System.out.println(ob1 instanceof B);	//true
	//	System.out.println(ob1 instanceof D); 
	//	--> CTE --> No 'is a relationship between object type and class 
		
		B ob2 = new B();
		System.out.println(ob2 instanceof A);	//true
		System.out.println(ob2 instanceof B);	//true
	//	System.out.println(ob2 instanceof D); 
	//	--> CTE --> No 'is a' relationship between object type and class
		
		A ob3 = new A();
		System.out.println(ob3 instanceof A);	//true
		System.out.println(ob3 instanceof B);	//false
		
	}

}
