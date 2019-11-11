package com.miscellaneous;

class MainA {

	
	static void display(A x)			// accepting objects as formal arguments
	{
		System.out.println("i: "+x.i+" j: "+x.j);	
	}
	
	public static void main(String[] args) {
		
			A ob1 = new A(10,20.2);
			A ob2 = new A(11,21.3);
			display(ob1);		// calling a static method
			display(ob2);		// passing objects(address) as actual arguments	
			
		}

	}

}
