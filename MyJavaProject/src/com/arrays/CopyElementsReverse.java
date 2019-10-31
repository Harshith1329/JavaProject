package com.arrays;

import java.util.Scanner;

class CopyElementsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] a = new int[size];	//Creating array with size given by user
		
		System.out.println("Pass the elements of the Array");
		
		for(int i=0; i<a.length; i++)  	//taking array elements from user
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Your Array : ");
		for(int i=0; i<a.length; i++)	//Displaying array to check
		{
			System.out.println(a[i]);
		}
		
		int [] b = new int[size];  //Creating a new array to copy in reverse
		
		for(int i=0,j=a.length-1; j>=0; j--,i++)
		{
			b[i] = a[j]; 		//Storing a's elements inside b in reverse
		}
		
		System.out.println("New array in reverse order of your input Array  : ");
		for(int i=0; i<b.length; i++)	//Displaying array to check
		{
			System.out.println(b[i]);
		}
	}

}
