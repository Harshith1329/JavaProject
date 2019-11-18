package com.hashCode;

class Company {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "A", 3000);
		Emp e2 = new Emp(1, "A", 3000);
		
		Emp e3 = new TestEngineer(2,"B",4000,"Selenium");
		Emp e4 = new TestEngineer(2,"B",4000,"Selenium");
		
		Emp e5 = new Developers(3,"C",5000,"Java");
		Emp e6 = new Developers(3,"C",5000,"Java");
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e3.equals(e4));
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		System.out.println(e5.equals(e6));
		System.out.println(e5.hashCode());
		System.out.println(e6.hashCode());
		
		
	}

}
