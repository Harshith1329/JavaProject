package com.toString;

class Company {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1,"A",1000);
		System.out.println(e1);
		
		Emp[] e = {e1, new Emp(2,"B",2000), new Emp(3,"C",3000)};
		
		for(Emp x : e)
		{	
			System.out.println(x);
		}
		
		System.out.println(e); 	// e is ref var of Array object (not of object of Emp) 
								//  ---> so it returns the address of array object 
		
		
		Emp e2 = new TestEngineer(4,"D",4000,"Selenium");
		Emp e3 = new Developers(5,"E",5000,"Java");
		
		System.out.println(e2);
		System.out.println(e3);
		
		
	}

}
