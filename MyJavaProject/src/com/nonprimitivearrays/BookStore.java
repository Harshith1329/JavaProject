package com.nonprimitivearrays;

class BookStore {

	public static void main(String[] args) {
		
		Book[] rack = { new Book("The Spy Who Came in From Cold","John le Carre",1000,1), 
						new Book("The Girl on the Train","Paula Hawkins",2000,2), 
						new Book("The Day of the Jackal","Frederick Forsyth",3000,3),
						new Book("Th Da Vinci Code","Dan Brown",4000,4), 
						new Book("Gone Girl","Gillian Flynn",5000,5)}; 

		for(Book x : rack)				//for each
		{
			System.out.println(x.name);
			System.out.println(x.author);
			System.out.println(x.price);
			System.out.println(x.isbn);
			
			x.genre("Thriller");
		}
	}

}
