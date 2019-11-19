package com.arraylist;

import java.util.ArrayList;

class HeroAL {

	public static void main(String[] args) {
		
		ArrayList hetro = new ArrayList();
		
		hetro.add(new Bike("Black", 35));
		hetro.add(new Emp(1, "A"));
		Movie m = new Movie("Bala",5);
		hetro.add(m);
		hetro.add(10);
		
		System.out.println(hetro);
	}

}
