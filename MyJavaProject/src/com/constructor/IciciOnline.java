package com.constructor;

// 

class IciciOnline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan l0 = new Loan(); 	// using non parameterised constructor Loan()
		l0.name="Home Loan";	
		l0.rateOfInterest=14;	// Assigning values using obj reference variable
		
		Loan l1 = new Loan("Vehicle Loan", 12.5); 	// assigning values during obj creation
		Loan l2 = new Loan("Personal Loan", 13.5);

		System.out.println("loan : "+l0.name+" roi : " +l0.rateOfInterest+" loanId : " +l0.loanId);
		System.out.println("loan : "+l1.name+" roi : " +l1.rateOfInterest+" loanId : " +l1.loanId);
		System.out.println("loan : "+l2.name+" roi : " +l2.rateOfInterest+" loanId : " +l2.loanId);
		
	}

}
