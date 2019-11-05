package com.constructor;

// Usage of non static initialiser block(IIB)

class Loan {

	String name;
	double rateOfInterest;
	String loanId;
	static int x;
	
	{
		++x;
		loanId = "icici"+x;      //non static Initialiser Block (IIB)
	}
	
	Loan()
	{
						// loadId update can be done in this constructor 
	}					// with help of this() call statement in other constructor
	
	Loan(String name, double rateOfInterest)
	{
		this.name = name;
		this.rateOfInterest = rateOfInterest;
	}
}
