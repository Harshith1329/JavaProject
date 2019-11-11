package com.inheritance;

class Bollywood extends Movies {

	
	Bollywood() {}
	
	Bollywood(int rating, String name, String language)
	{
		super(rating, name, language);
	}
	
	public static void main(String[] args) {
		
		Bollywood b1 = new Bollywood(5,"Dream Girl", "Hindi");
		
		System.out.println(b1.rating);
		System.out.println(b1.name);
		System.out.println(b1.language);

	}

}
