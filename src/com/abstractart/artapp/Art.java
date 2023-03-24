package com.abstractart.artapp;

public abstract class Art {

	String title;
	String author;
	String description;
	
	public Art (String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	public abstract void viewArt();
	
}
