package com.vvp.lib.model;

public class Student extends User {
	
	public int semester,balance = 4;
	
	Student(int id, String name, String branch, int semester) {

		super(id, name, branch);
		this.semester = semester;
	}		
}