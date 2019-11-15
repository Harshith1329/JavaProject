package com.toString;

class TestEngineer extends Emp {

	String tool;
	
	TestEngineer() {}
	
	TestEngineer(int id, String name, double salary, String tool)
	{
		super(id,name,salary);
		this.tool=tool;
	}
	
	public String toString()
	{
		return super.toString()+" "+tool;
	}
}
