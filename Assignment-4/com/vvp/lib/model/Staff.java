package com.vvp.lib.model;

public class Staff extends User {
	
	public int balance = 6;
	public String designation;
	Staff(int id, String name, String branch, String designation) {

		super(id, name, branch);
		this.designation = designation;
	}
}