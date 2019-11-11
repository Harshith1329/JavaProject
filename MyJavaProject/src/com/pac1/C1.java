package com.pac1;

//private access specifier

class C1 extends A1 {

	public static void main(String[] args) {
			System.out.println(A1.i);  cte --> i is private not visible beyond same class
			C1 ob = new C1();
			System.out.println(A1.j);  cte --> private members are not inherited in sub class object
			
		}
}
