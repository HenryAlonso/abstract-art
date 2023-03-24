package com.abstractart.artapp;

public class Painting extends Art {
	
	String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
		
	}
	
	public void viewArt() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Description: " + this.description);
		System.out.println("Paint Type: " + this.paintType);
		System.out.println("\n");
	}

}
