package com.miscellaneous;

class Company {

	public static void main(String[] args) {
		
		Employee emp1 = Employee.createEmployee("z", 1000);
		
		Employee emp2 = Employee.createEmployee("A", 1000).displayDetails();
		
		Employee emp3 = Employee.createEmployee("B", 2000).displayDetails().Hike(3000).displayDetails();

	}

}
