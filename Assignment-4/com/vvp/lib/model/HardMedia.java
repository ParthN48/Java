package com.vvp.lib.model;

public class HardMedia extends Media {
	public int pgNo;
	public String publication;
	HardMedia(int bookId, String title, String  authorName, String location, int availability, int pgNo, String publication) {

		super(bookId, title, authorName, location, availability);
		this.pgNo = pgNo;
		this.publication = publication;
	}
}