package com.toString;

class Developers extends Emp{

	String language;
	
	Developers() {}
	
	Developers(int id, String name, double salary, String language)
	{
		super(id,name,salary);
		this.language=language;
	}
	
	public String toString()
	{
		return super.toString()+" "+language;
	}
}
