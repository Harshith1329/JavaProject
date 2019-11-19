package com.arraylist;

class Emp {

	int id;
	String name;
	
	Emp()
	{
		
	}
	
	Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
