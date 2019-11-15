package com.assignment;

class CountWordsInString {

	public static void main(String[] args) {
		
		String s = "Hi how are you";
		//String s1 = s.replaceAll(" ", "");

		char[] ch = s.toCharArray();
		
		int count=1;
		int word=0;
		
		for(int i=0; i<ch.length; i++)
		{
				
				if(ch[i] == ' ')
					count++;
			
			
		}
		System.out.println("The number of words in the string is "+count);
		
		
	}

}
