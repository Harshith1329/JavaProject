package com.arrays;

import java.util.Scanner;

class StoreEven {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the starting number");
			int n = sc.nextInt();
			System.out.println("Enter the number of even numbers you want");
			int size = sc.nextInt();
			
			int [] a = new int [size];
			
			for(int i=0; i<a.length; n++)
			{
				if(n%2==0)
					a[i++]=n;						// a[i++]=n --> if not using print stmt
				
			}
			System.out.println("Array is : ");
			
			for(int i=0; i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
}
