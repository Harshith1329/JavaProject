package com.encapsulation;

class Employee {

	private int id;
	private double salary;
	private String name;
	
	Employee()
	{
		
	}
	
	Employee(int id, double salary, String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public double getsalary()
	{
		return salary;
	}
	
	public void setsalary(double salary)
	{
		if(salary>this.salary)
			{
				this.salary = salary;
				System.out.println("salary is "+this.salary);
			}
		else
			System.out.println("Invalid");
	}
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1,30000, "A");
		
		System.out.println(emp.id);
		System.out.println(emp.salary);
		System.out.println(emp.name);
		
		System.out.println(emp.getid());
		System.out.println(emp.getsalary());
		System.out.println(emp.getname());
		
		emp.setsalary(40000);
	}
	
}
