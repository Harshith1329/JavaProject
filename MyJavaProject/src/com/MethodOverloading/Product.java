package com.MethodOverloading;

class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product(2,3);
		product(2,3,4);
		product(2.0,3);
		
		//System.out.println(product(2,3));		//	if printing in main, 
		//System.out.println(product(2,3,4));   // then use return type
		//System.out.println(product(2.0,3));   // other than void in methods
	}

	public static void product(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void product(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void product(double a, double b)
	{
		System.out.println(a+b);
	}
	
}
