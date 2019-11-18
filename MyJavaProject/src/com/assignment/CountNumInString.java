package com.assignment;

class CountNumInString {

	public static void main(String[] args) {
		String s = "22Hi 34how are you 186252";

		char[] ch = s.toCharArray();
		
		int count =0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>=48 && ch[i]<=57)  	// check for ASCII values (because storing integer values in char type)
				{
					count++;
				}
				
			else
				continue;
			
		}

		System.out.println(count);
	}

}
