package com.miscellaneous;

class Employee {
	
	int id;
	String name;
	int salary;
	static int x;
	
	Employee()
	{
		++x;
		id=x;
	}
	
	Employee(String name,int salary)
	{
		this();
		this.name=name;
		this.salary=salary;
	}
	
	static Employee createEmployee(String name, int salary)
	{
		return new Employee(name, salary);
	}

	Employee Hike(int salary)
	{
		this.salary=salary;
		System.out.println("Salary hiked for "+this.name);
		return this;
	}
	
	Employee displayDetails()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		
		System.out.println("************");
		return this;
	}
}
