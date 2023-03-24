package com.abstractart.artapp;

public class Sculpture extends Art {
	
	String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public void viewArt() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Description: " + this.description);
		System.out.println("Material: " + this.material);
		System.out.println("\n");
	}

}
