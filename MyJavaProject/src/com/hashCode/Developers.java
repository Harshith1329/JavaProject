package com.hashCode;

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
	
	public boolean equals(Object ob)
	{
		Developers temp = (Developers) ob;
		return super.equals(temp) && this.language==temp.language;
	}
	
	public int hashCode()
	{
		int hc = super.hashCode() + language.hashCode();
		return hc;
	}
	
}

