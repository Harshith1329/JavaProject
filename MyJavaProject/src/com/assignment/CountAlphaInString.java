package com.assignment;

class CountAlphaInString {

	public static void main(String[] args) {
		String s = "22Hi 34how are you 186252";

		char[] ch = s.toCharArray();
		
		int count =0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')  	
							
			{
				count++;
			}
				
			else
				continue;
			
		}
		System.out.println(count);

	}

}
