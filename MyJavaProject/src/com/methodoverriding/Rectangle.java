package com.methodoverriding;

class Rectangle extends Shape {

	void area ()
	{
		int l=12;
		int b=13;
		
		System.out.println(l*b);
	}
}
