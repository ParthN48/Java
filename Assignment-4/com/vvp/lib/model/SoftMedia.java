package com.vvp.lib.model;

public class SoftMedia extends Media {
	
	String size;
	
	SoftMedia(int bookId, String title, String authorName, String location, String size, int availability) {

		super(bookId, title, authorName, location, availability);
		this.size = size;
	}
}