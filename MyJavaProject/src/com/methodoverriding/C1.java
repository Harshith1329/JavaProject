package com.methodoverriding;

class C1 extends B1 {

	int k=30;
	void display()
	{
		super.display();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
