package com.assignment;

class CountVowelsInString {

	public static void main(String[] args) {
		
		String s = "Hi how are you";
		String s1 = s.replaceAll(" ", "");
		char[] ch = s1.toCharArray();
		
		int count =0; 
		
		for(char x : ch)
		{
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
				count++; 	
				
		}
		
		System.out.println("The number of vowels in ( "+s+ " ) is "+count);

	}

}
