package com.Interface;

class ATMImplementation implements ATM {

	long balance;
	
	ATMImplementation() {
		
	}
	
	ATMImplementation(long balance)
	{
		this.balance=balance;
	}

	@Override
	public void deposit(long dAmt) {
		
		if(dAmt>0)
			{
				balance = balance + dAmt;
				System.out.println("Your balance after depositing "+dAmt);
				checkBal();
			}
			
		else
			System.out.println("Enter valid amt");
		
	}

	@Override
	public long checkBal() {
		System.out.println(balance);
		return balance;
	}

	@Override
	public void withdrawal(long wAmt) {
		
		if(wAmt>balance)
		{
			balance = balance - wAmt;
			System.out.println("Your balance after withdrawing "+wAmt);
			checkBal();
		}
		else
			System.out.println("Insufficient Balance");
	}
	
	
}
