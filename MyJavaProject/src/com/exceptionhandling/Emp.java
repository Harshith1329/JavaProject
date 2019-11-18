package com.exceptionhandling;

class Emp {

	static void salaryDetail(double salary)
	{
		if(salary>1000)
			System.out.println("Thank you");
		else
			throw new SalaryException();

	}
	
	public static void main(String[] args) {
		System.out.println("from main");
		salaryDetail(200);
		System.out.println("main ends");
	}
}
