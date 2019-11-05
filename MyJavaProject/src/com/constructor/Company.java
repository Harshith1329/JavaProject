package com.constructor;

class Company {

	public static void main(String[] args) {
		
		Employee e0 =  new Employee(); //non parameterized constructor --> assign default values
		Employee e1 = new Employee("ABC", 10.9, 1);
		Employee e2 = new Employee("XYZ", 12.9, 2);
		Employee e3 = new Employee("PQR",13.9,3);
		
		e0.id=0;          //
		e0.name="A";	 // Assigning value to e0 object after object creation
		e0.salary=9.5;	//
		
		System.out.println(e0.name+" "+e0.salary+" "+e0.id);
		System.out.println(e1.name+" "+e1.salary+" "+e1.id);
		System.out.println(e2.name+" "+e2.salary+" "+e2.id);
		System.out.println(e3.name+" "+e3.salary+" "+e3.id);
	}

}
