package com.abstractart.artapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array list to hold our art pieces
		ArrayList<Art> museum = new ArrayList<>();
		
		Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "A starry night", "Oil");
		Painting painting2 = new Painting("Cirlces", "1st grader", "A bunch of circles", "Oil");
		Painting painting3 = new Painting("Snowy View", "Art teacher", "Snow falling down", "Oil");
		
		Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "Sculpture of a hero David", "Marble");
		Sculpture sculpture2 = new Sculpture("Knight", "Sculptor", "Knight taking a majestic stance", "Bronze");
		
		//add our art pieces to our array list
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		//shuffle our art pieces to view in a random order
		Collections.shuffle(museum, new Random());
		
		//Use viewArt to view all our pieces in a random order
		for (Art artwork : museum) {
			artwork.viewArt();
		}
		

	}

}
