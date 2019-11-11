package com.downcasting;

class MainClass {

	public static void main(String[] args) {
		
		A ob1 = new A(10);
		B ob2 = new B(100,200); 
		C ob3 = new C(1000,2000,3000);
		
		A ob4 = new B(10,20);
		A ob5 = new C(1,2,3); 
		B ob6 = new C(10,20,30);
		
		
		A [] ob = {ob1, ob2, ob3, ob4, ob5, ob6};
		
		for(A x : ob )
		{
			display(x);
		}
	}

	static void display(A obj)
	{
		System.out.println(obj.i);
		
		if(obj instanceof B)
			System.out.println(((B)obj).j);
		
		if(obj instanceof C)
			System.out.println(((C)obj).k);
		
		System.out.println("_________________");
	}
}
