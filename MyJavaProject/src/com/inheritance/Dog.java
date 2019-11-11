package com.inheritance;

class Dog extends Animal {

	String color;
	
	Dog() {}

	Dog(int height,int weight, String color)
	{
		super(height, weight);
		this.color=color;
	}
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog(22,27,"White");
		
		System.out.println("Height is : "+d1.height);
		System.out.println("Weight is : "+d1.weight);
		System.out.println("Color is :"+d1.color);
		
	}

}
