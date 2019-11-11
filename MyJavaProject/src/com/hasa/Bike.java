package com.hasa;

class Bike {

	double mileage;
	String colour;
	Engine e = new Engine(350);
	
	Bike() {}
	
	Bike(double mileage, String colour)
	{
		this.mileage=mileage;
		this.colour=colour;
	}
}
