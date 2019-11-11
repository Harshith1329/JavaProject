package com.inheritance;

class SmartPhone extends Mobile {

	String browser;
	
	SmartPhone() {}
	
	SmartPhone(String sim, String Model_Num, String browser)
	{
		super(sim, Model_Num);
		this.browser=browser;
	}
	
	public static void main(String[] args) {
		

		SmartPhone sm1 = new SmartPhone("Jio", "M1901F7S", "Chrome");
		
		System.out.println(sm1.sim);
		System.out.println(sm1.Model_Num);
		System.out.println(sm1.browser);
	}

}
