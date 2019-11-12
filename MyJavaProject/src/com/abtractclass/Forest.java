package com.abtractclass;

class Forest {

	public static void main(String[] args) {
		
	//	Animal a = new Animal();   -->  cannot create object for abstract class
		
		Dog d1 = new Dog(10,30);
		Lion l1 = new Lion(13,35);
		
		System.out.println(d1.height+" "+d1.weight);
		d1.talk();
		
		System.out.println(l1.height+" "+l1.weight);
		l1.talk();
		
		Animal a1 = new Dog (15,40);
		a1.talk();
		
		Animal a2 = new Lion(16,45);
		a2.talk();

	}

}
