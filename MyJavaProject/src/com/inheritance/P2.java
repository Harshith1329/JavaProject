package com.inheritance;

class P2 extends P1 {

	int j; 
	
	{
		System.out.println("from IIB of P2");
	}
	
	P2()
	{
// implicitly uses super() call stmt to call P1() constructor ---> 
		 											//	Constructor Chaining from subclass to superclass
		
		System.out.println("From P2()");
	}
	
	public static void main(String[] args) {
		
		P1 ob1 = new P1();
		
		System.out.println("*****************");
		
		P2 ob2 = new P2();  	
		
		// ORDER OF EXECUTION :
		
		// 1. loads P1(parent class) first 
		// 2. the non static variables of P1 get memory inside P2(child class) 
		// 3. all the non static initializers  of P1 get executed
		// 4. stmts inside constructor of P1 gets executed
		// 5. then loads P2(child class)
		// 6. the non static variables of P2 get memory inside P2(child class)
		// 7. all the non static initializers  of P2 get executed
		// 8. stmts inside constructor of P2 gets executed
		
		ob2.i = 10;
		ob2.j = 20;
		
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
	}			
}
