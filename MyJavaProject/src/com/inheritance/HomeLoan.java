package com.inheritance;

class HomeLoan extends Loan {

	int HomeLoan_ID;
	
	HomeLoan() {}
	
	HomeLoan(double roi, int HomeLoan_ID)
	{
		super(roi);
		this.HomeLoan_ID=HomeLoan_ID;
		
	}
	
	public static void main(String[] args) {
		
		HomeLoan HL1 = new HomeLoan(12.5,342);
		
		System.out.println(HL1.roi);
		System.out.println(HL1.HomeLoan_ID);

	}

}
