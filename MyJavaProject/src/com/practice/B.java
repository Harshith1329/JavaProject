package com.practice;

class B extends A{

	void sum()
	{
		int sum=0;
		System.out.println("from B:"+sum);
	} 
	
	void sum(int a, int b)
	{
		int sum=0;
		//sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		B ob = new B();
		ob.sum(2, 3);
		ob.sum();
		
		
		A ob1 = new A();
		ob.sum();
		
		A ob2 = new B();
		ob2.sum();
		
		
		//sum(2,3);
		
	}

}
