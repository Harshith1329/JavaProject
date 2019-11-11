package com.miscellaneous;

class B {

	int i;
	
	static B createObject()  		// made static because if non static to call it
									// we have to create another object while
									// while calling in main()
	{
		B ob = new B();
		return ob;
		
		// OR             return new D(); 
	}
	
	B initialize(int i)
	{
		this.i=i;
		return this; 	//returning address of the object
	}
	
	B display()
	{
		System.out.println(i);
		return this;	// returning address of the object	
		
		// OR  System.out.println(this.i);
	}
	
	
}
