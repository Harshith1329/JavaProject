package com.polymorphism;

public class MainBank {

	public static void main(String[] args) {
		
		Bank bank;
		
		bank = new ICICI();
		System.out.println(bank.roi());
		
		bank = new CanaraBank();
		System.out.println(bank.roi());
		
		bank = new SBI();
		System.out.println(bank.roi());
		
		bank = new SBIInTouch();
		System.out.println(bank.roi());
		

	}

}
