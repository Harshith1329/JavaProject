package com.MethodOverloading;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		System.out.println(sum(10,20,30));
		System.out.println(sum(10.0,20));
	}
	
	public static void sum (int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static int sum (int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static double sum (double x, double y)
	{
		return x+y;
	}
	

}
