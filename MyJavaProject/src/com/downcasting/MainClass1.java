package com.downcasting;

class MainClass1 {

	public static void main(String[] args) {
		
		A1 ob1 = new A1(100);
		B1 ob2 = new B1(100,200);
		C1 ob3 = new C1(100,300);
		
		A1 ob4 = new B1(10,20);
		A1 ob5 = new C1(10,30);
		
		A1 [] ob = {ob1, ob2, ob3, ob4, ob5};
		
		for(A1 x : ob )
		{
			display(x);
		}
	}

	static void display(A1 obj)
	{
		System.out.println(obj.i);
		
		if(obj instanceof B1)
			System.out.println(((B1)obj).j);
		
		if(obj instanceof C1)
			System.out.println(((C1)obj).k);
		
		System.out.println("_________________");
	}

}


