package com.nonstaticmembers;
// to create object of different class (Demo1)
// and accessing variables from different objects

public class Demo2 {
	
		double d =2.0;
	
		public static void main(String[] args) {
			
			Demo1 ob1= new Demo1();
			Demo1 ob2= new Demo1();
			
			System.out.println(ob1);		// Demo1@121
			System.out.println(ob2);		// Demo1@122
			
			System.out.println(ob1.d);		// 0
			System.out.println(ob2.d);		// 0
			
			ob1.d=12.0;
			System.out.println(ob1.d);		// 12.0
			System.out.println(ob2.d);		// 0.0
			
			ob1.d=30.0;
			ob2.d=40.0;
			System.out.println(ob1.d);		// 30.0
			System.out.println(ob2.d);		// 40.0
			
			
			
		}
	
}
