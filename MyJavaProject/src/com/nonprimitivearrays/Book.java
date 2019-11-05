package com.nonprimitivearrays;

class Book {

	String name;
	String author;
	int price;
	int isbn;
	
	void genre(String genre)
	{
		System.out.println(genre+" is the genre");
	}
	
	Book()
	{
		
	}
	
	Book(String name,String author,int price,int isbn)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.isbn=isbn;
	}
}
