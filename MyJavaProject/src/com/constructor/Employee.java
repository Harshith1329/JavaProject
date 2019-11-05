package com.constructor;

class Employee {
	String name;
	double salary;
	int id;
	
	Employee()
	{
		System.out.println(this.name+" "+this.salary+" "+this.id);
	}
	
	Employee(String name, double salary, int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
		
		System.out.println(this.name+" "+this.salary+" "+this.id);
		
	}
}
