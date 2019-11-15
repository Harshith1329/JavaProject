package com.assignment;

class ManipulationOfString {

	public static void main(String[] args) {
		
		String s = "Welcome to India";
		
		char[] ch = s.toCharArray();
		
		
		// emoclew ot aidnI
		
		int temp1=0;
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]==' ' || i==ch.length-1)
			{
				for(int j=i; j>=temp1; j--)
				{
					System.out.println(ch[j]);	
				}
				
				temp1=i;			
			}
			else
				continue;
		}
		
		// India to Welcome
		
		int temp2=ch.length-1;
		for(int i=ch.length-1; i>=0; i--)
		{
			if(ch[i]==' ' || i==0)
			{
				for(int j=i; j<=temp2; j++)
				{
					System.out.println(ch[j]);	
				}
				
				temp2=i;			
			}
			else
				continue;
		}
		
	}

}
