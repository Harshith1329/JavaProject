package com.abtractclass;

class Lion extends Animal{

	@Override
	void talk() {
		
		System.out.println("Roarrr");
	}

	Lion()
	{
		
	}
	
	Lion(double height, double weight)
	{
		super(height,weight);
	}
}
