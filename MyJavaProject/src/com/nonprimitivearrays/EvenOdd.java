package com.nonprimitivearrays;

class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {2,4,6,8,10};
		
		// using normal for loop
		System.out.println("using for loop");
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]+1);
		}
		
		// using "for each" 
		System.out.println("using for each");
		for(int x : array)
		{
			System.out.println(x+1);
		}
	}

}
