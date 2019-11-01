package com.nonstaticmembers;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 ob1 = new Demo1();
		Demo2 ob2 = new Demo2();
		
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		
		ob1.d=12;
		ob2.d=13;
		
		System.out.println(ob1.d);
		System.out.println(ob2.d);
	}

}
