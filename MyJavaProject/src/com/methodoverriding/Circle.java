package com.methodoverriding;

class Circle extends Shape {

	void area ()
	{
		int r=2;
		double a;
		a= 3.14 * r * r;
		System.out.println(a);
	}
}
