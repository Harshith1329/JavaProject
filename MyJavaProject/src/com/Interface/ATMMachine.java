package com.Interface;

import java.util.Scanner;

class ATMMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ATMImplementation account1 = new ATMImplementation();
		
		System.out.println("Enter : 1 to Deposit amt ");
		System.out.println("Enter : 2 to Check Balance ");
		System.out.println("Enter : 3 to Withdraw amt ");

		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : 
				System.out.println("Enter the amt to be deposited");
				long amount1 = sc.nextLong();
				account1.deposit(amount1);
				break;
				
			case 2 : 
				System.out.println("Your balance is");
				account1.checkBal();
				break;
				
			case 3 : 
				System.out.println("Enter the amt to be withdrawn");
				long amount2 = sc.nextLong();
				account1.withdrawal(amount2);
				break;	
				
			default :
				System.out.println("Invalid Choice");
				break;
		}
		
		
	}

}
