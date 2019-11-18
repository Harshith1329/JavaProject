package com.assignment;

class CountSpCharInString {

	public static void main(String[] args) {
		
		String s = "22Hi 34how >*+<=?@are you 186252 #$%;&:";

		char[] ch = s.toCharArray();
		
		int count =0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>=33 && ch[i]<=47) 	
			{
				count++;
			}
				
			else if(ch[i]>=58 && ch[i]<=64) 
			{
				count++;
			}
			else
				continue;
			
		}

		System.out.println(count);

	}

}
