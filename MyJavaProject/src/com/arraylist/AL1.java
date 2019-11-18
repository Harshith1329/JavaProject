package com.arraylist;

import java.util.ArrayList;

class AL1 {

	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add(20);
		a1.add("A");                 //Heterogeneous allowed
		System.out.println(a1);	//toString() overridden --> so ref var will display contents of obj
									// 10 20 A --> Order maintained
		
		a1.add(1, "B");
		System.out.println(a1);  	// 10 B 20 A  ---> Order disturbed
		
		a1.add("C");
		a1.add("E");
		
		System.out.println(a1.isEmpty());	// false
		System.out.println(a1.size());	    // 6 
		System.out.println(a1);            // 10 B 20 A C E
		
		Object ob = a1.set(5, "D");		  // After replacing obj is created and returned 
		System.out.println(ob);      // E
		System.out.println(a1);			  // 10 B 20 A C D  --> E is replaced by D
		
		
		System.out.println(a1.contains("F"));			// false
		a1.add(20);
		System.out.println(a1); 		//	10 B 20 A C D 20
		
		System.out.println(a1.indexOf(20));		// 2
		System.out.println(a1.lastIndexOf(20)); // 6
		
		System.out.println(a1.indexOf("a"));	//-1
		System.out.println(a1.remove(3));	    // A --> is removed
		System.out.println(a1.size());          // 6
		System.out.println(a1);                 // 10 B 20 C D 20
		
		a1.clear();
		System.out.println(a1.isEmpty());   	// true
		System.out.println(a1.size());			// 0
		
	}

}
