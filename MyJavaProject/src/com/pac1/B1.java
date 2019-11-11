package com.pac1;

//private access specifier

class B1 {

	public static void main(String[] args) {
		System.out.println(A1.i);  cte --> i is private not visible beyond same class
		A1 ob = new A1();
		System.out.println(A1.j);  cte --> j is private not visible beyond same class
		
	}
}
