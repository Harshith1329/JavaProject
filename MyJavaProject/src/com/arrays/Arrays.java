package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 3, 4, 40};
		
		// Accessing and displaying each element
		for(int index=0; index<a.length; index++)
		{
			System.out.println(a[index]); //10 //3 //4 //40
		}
		
		// Accessing and adding 10 to each element
		for(int i=0; i<a.length; i++)
		{
			a[i] = a[i] + 10; 
		}
		System.out.println("After adding 10 to each element");
		
		// Accessing and displaying
		for(int index=0; index<a.length; index++)
		{
			System.out.println(a[index]); //20 //13 //14 //50
		}
	}

}
