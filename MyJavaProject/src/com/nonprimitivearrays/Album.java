package com.nonprimitivearrays;

class Album {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song[] playlist = { new Song("Aaaaa","a",100), new Song("Bbbbb","b",2000), new Song("Ccccc","c",350),
				new Song("Ddddd","d",400), new Song("Eeeee","e",500)}; 

for(Song x : playlist)				//for each
{
	System.out.println(x.name+" "+x.singer+" "+x.likes);
}
	}

}
