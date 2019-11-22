package com.nonstaticmembers;

// initializing the value of formal argument of a method to non static 'i'

class A {

	static A ob1;
	int i;
	static int x;
	
	void Initialise(int i)
	{
		this.i = i;					// initializing the value of formal argument to non static 'i'
		System.out.println(i); 		// print the value of formal argument
		System.out.println(this.i);
		i=20;			// formal argument 'i' will change not the non static i
		System.out.println(i); 
		System.out.println(this.i);
		x=20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ob1 = new A();
		
		//ob1.i =10;
		System.out.println(ob1.i);
		
		
		ob1.Initialise(10);
		
		System.out.println(ob1.i);
		
		
	}

}
