package com.encapsulation;

class Voter {

	private int age;
	
	Voter()
	{
		
	}
	
	Voter(int age)
	{
		this.age=age;
	}
	
	public int getage()
	{
		return age;
	}
	
	public void setage(int age)
	{
		if(age>18 && age>this.age)
			{
				this.age=age;
				System.out.println("new age is "+this.age+ " and is above 18");
			}
		else
			System.out.println("Minor");
	}
}
