package com.inheritance;

class TestEngineer extends Employee {

	String tool;
	
	TestEngineer() {}
	
	TestEngineer(int id, double salary, String name,String tool)
	{
		super(id, salary, name);
		this.tool=tool;
	}
	
	
	public static void main(String[] args) {

		TestEngineer t1 = new TestEngineer(1,3000.50,"A","Selenium");
		
		
		System.out.println(t1.id);
		System.out.println(t1.salary);
		System.out.println(t1.name);
		System.out.println(t1.tool);
	}

}
