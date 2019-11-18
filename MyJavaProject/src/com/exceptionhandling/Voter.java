package com.exceptionhandling;

class Voter {

	int age;
	Voter()
	{
		
	}
	
	Voter(int age)
	{
		if(age>18)
			System.out.println("Registered");
		else
			throw new WrongAgeException();
	}
	
	void ageChange(int age)
	{
		if(age>this.age)
			System.out.println("Updated");
		else
			throw new WrongAgeException();
	}
	
	
}
