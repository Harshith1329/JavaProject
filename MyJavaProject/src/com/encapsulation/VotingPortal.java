package com.encapsulation;

class VotingPortal {

	public static void main(String[] args) {
		
		Voter v1 = new Voter(19);
		System.out.println("age is "+v1.getage());

		v1.setage(23);
		System.out.println("Updated age is "+v1.getage());
	}

}
