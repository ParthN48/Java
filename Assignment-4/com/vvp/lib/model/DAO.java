package com.vvp.lib.model;

public class DAO {
	
	public static Student students[] = new Student[5];
	public static Staff staffs[] = new Staff[2];
	public static HardMedia hardMedia[] = new HardMedia[5];
	public static SoftMedia softMedia[] = new SoftMedia[5];

	public static void initData() {

		//id,name,department,sem
		students[0] = new Student(1, "Parth", "CE", 5); 
		students[1] = new Student(2, "Rushi", "CE", 5);
		students[2] = new Student(3, "Kuldip", "CE", 5);
		students[3] = new Student(4, "Abhishek", "CE", 5);
		students[4] = new Student(5, "Darshit", "CE", 5);

		//id,name,,branch,designation
		staffs[0] = new Staff(1, "Girishsir", "CE", "Professor"); 
		staffs[1] = new Staff(2, "Sagarsir", "CE", "Professor");

		//id,title,authorname,location,availibity,pgno,publication
		hardMedia[0] = new HardMedia(1, "Algorithm", "a", "f", 5, 980, "abc"); 
		hardMedia[1] = new HardMedia(2, "Java", "b", "g", 5, 520, "def");
		hardMedia[2] = new HardMedia(3, "System Programming", "c", "h", 5, 360, "ghi");
		hardMedia[3] = new HardMedia(4, "C++", "d", "i", 5,450, "jkl");
		hardMedia[4] = new HardMedia(5, "Cyber Security", "e", "j", 5, 264, "mno");

		//id,title,authorname,location,size,availibity
		softMedia[0] = new SoftMedia(1, "Algorithm", "a", "D:-CE-books-", "1.04 MB", 5); 
		softMedia[1] = new SoftMedia(2, "Java", "b", "D:-CE-books-", "2.32 MB", 5);
		softMedia[2] = new SoftMedia(3, "System Programming", "c", "D:-CE-books-", "5.55 MB", 5);
		softMedia[3] = new SoftMedia(4, "C++", "d", "D:-CE-books-", "1.01 MB", 5);
		softMedia[4] = new SoftMedia(5, "Cyber Security", "e", "D:-CE-books-", "3.03 MB", 5);
	}
}