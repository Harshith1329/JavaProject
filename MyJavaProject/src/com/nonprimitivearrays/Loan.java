package com.nonprimitivearrays;

class Loan {

	String name;
	double roi;
	
	void interest()
	{
		System.out.println(name+" is granted at  "+roi);
	}
	
	Loan()
	{
		
	}
	
	Loan(String name, double roi)
	{
		this.name=name;
		this.roi=roi;
	}
	
	public static void main(String[] args) {
		
		Loan l1 = new Loan("Vehicle Loan",13.5);
		Loan l2 = new Loan("Educational Loan",14.5);
		Loan l3 = new Loan("Home Loan",15.5);
		
		Loan [] loan = {l1, l2, l3, new Loan("Personal Loan",16)};
		
		for(int i=0;i<loan.length;i++)
		{
			System.out.println(loan[i].name+" "+loan[i].roi);
			
			loan[i].interest();		// calling a non static method (using object)
			
		}
	}

}
