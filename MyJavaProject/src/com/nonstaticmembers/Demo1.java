package com.nonstaticmembers;
//demo program to create an object

class Demo1 {
	
	int i; // non static variable
	boolean flag; // non static member variable
	double d = 1.0;
		
	public static void main(String[] args) {
			System.out.println(new Demo1()); // printing new object address but not storing address
			System.out.println(new Demo1()); // 2nd object created with new address
			
			System.out.println(new Demo1().i); // to display 'i' in new object  
			
			// If object not stored in variable then Object goes to garbage
			
			Demo1 x = new Demo1();	// non primitive datatype (class name)	Ex: Demo1 x
			System.out.println("x: "+x);   // x--> 'local' reference variable (store address of object)
		
			// x contains non static variables "i" and "flag" in HEAP AREA
			
			Demo1 y = x;					// storing reference of x in y (non primitive) variable
			System.out.println(x==y);		// true (because both has reference of same object) 
			System.out.println("x: "+x);	// address of x
			System.out.println("y: "+y);	// address of y
			
			Demo1 z=null;
			System.out.println(x==z);		// false(because not equal)
			System.out.println("x: "+x);	// address of x
			System.out.println("z: "+z);	// null
			
			
			System.out.println(x.i); 		// 0
			x.i=200;
			System.out.println(x.i); 		// 200
			
			System.out.println(x.flag);		// false
			y.flag=true;
			System.out.println(x.flag);		// true
		}
}
