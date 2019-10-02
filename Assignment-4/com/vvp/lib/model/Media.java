package com.vvp.lib.model;

public class Media {
	
	public String title,authorName,location;
	public int availability,bookId;
	
	Media(int bookId, String title, String authorName, String location,int availability) {

		this.bookId = bookId;		
		this.title = title;
		this.authorName = authorName;
		this.location = location;
		this.availability = availability;
	}
}