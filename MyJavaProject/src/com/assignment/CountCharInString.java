package com.assignment;

class CountCharInString {

	public static void main(String[] args) {
		
		String s = "Hi how are you";
		//String s1 = s.replaceAll(" ", "");

		char[] ch = s.toCharArray();
		
		int count =0;
		
		for(char x : ch)
		{
			if(x!=' ')
				count++;
		}
		System.out.println("The number of characters in the string is "+count);

	}

}
