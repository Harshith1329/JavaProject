package com.arrays;

public class Syntax2 {

	public static void main(String[] args) {
		int size = 5;
		int[] array = new int[size];
		
		
		for(int i=0, j=1; i<array.length; i++)  //j++
		{
			System.out.println(array[i]);
		}
		
		// Accessing and storing natural numbers till last index
		for(int i=0, j=1; i<array.length; i++)  //j++
		{
			array[i] = j++;
		  //  j++;
			
			System.out.println(array[i]);
		}
		
		System.out.println("Array in reverse order");
		for(int i = array.length-1; i>=0; i--)  //j++
		{
			System.out.println(array[i]);
			
		}
		
	}
}
