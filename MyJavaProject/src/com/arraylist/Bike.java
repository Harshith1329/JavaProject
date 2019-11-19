package com.arraylist;

class Bike {

	String color;
	double mileage;
	
	Bike()
	{
		
	}
	
	Bike(String color, double mileage) {
		super();
		this.color = color;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", mileage=" + mileage + "]";
	}
	
	
	
}
