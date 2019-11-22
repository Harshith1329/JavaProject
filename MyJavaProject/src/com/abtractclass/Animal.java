package com.abtractclass;

abstract class Animal {

	
	double height;
	double weight;
	
	Animal() {
		
	}
	
	Animal(double height, double weight)
	{
		this.height=height;
		this.weight=weight;
	}
	
	abstract void talk();
}
