package com.inheritance;

class MainClass {

	public static void main(String[] args) {
		
		B.i=20;
		System.out.println(B.i);
		System.out.println(A.i);
		
		A.i=30;
		System.out.println(B.i);

		A.test();
		B.test();
		B.test1();
		
		// A.j=30; --> CTE		(parent class cannot access child class static members)
		// A.test1() --> CTE  (parent class cannot access child class static members)
	}

}
