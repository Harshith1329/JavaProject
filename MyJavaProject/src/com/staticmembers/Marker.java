package com.staticmembers;

class Marker {
	
	static int price;
	static String colour;
	
	static
	{
		System.out.println("from Marker");
	}
	
	static void writing()
	{
		System.out.println("Marker of colour "+colour+" is writing");
	}
}
