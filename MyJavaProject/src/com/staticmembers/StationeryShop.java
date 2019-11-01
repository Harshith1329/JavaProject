package com.staticmembers;

class StationeryShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Marker.price);
		System.out.println(Marker.colour);
		
		Marker.price=100;
		Marker.colour="Black";
		Marker.writing();
		
		Marker.price=80;
		Marker.colour="Blue";
		System.out.println("Marker colour is " +Marker.colour+ " and Marker price is " +Marker.price);
		Marker.writing();
	}

}
