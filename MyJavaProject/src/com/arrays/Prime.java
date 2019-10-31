package com.arrays;

import java.util.Scanner; 

class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int size = 7;
		int[] a = new int[size];
		
		for(int i=0,n=333; i<a.length; n++)
		{
			if(isPrime(n))
				a[i++] = n;    //storing if Prime and also incrementing
							   //inside assignment expression
		}
		System.out.println("Array with 7 Prime Numbers from 333 :");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static boolean isPrime(int n)
	{
		int countOfFactors=2;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				countOfFactors++;
		}
		if(countOfFactors==2)
			return true; 
		else 
			return false;
	}

}


