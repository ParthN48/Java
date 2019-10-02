package com.vvp.lib.controller;
import com.vvp.lib.model.*;

public class Transaction {
	
	public static int i,j;

	public static String issueBook(int bookId, int userId, String userType)
	throws BookNotAvailableException,InsufficientBookBalanceException,BookNotFoundException,UserNotFoundException,InvalidUserTypeException {

		String msg = "";
		if(userType.equals("student")) {

			for (i = 0; i < DAO.hardMedia.length; i++) {

				if (DAO.hardMedia[i].bookId == bookId)
					break;
			
				if(i == DAO.hardMedia.length) {
					msg += "Invalid bookID";
					throw new BookNotFoundException(msg);
				}	
			}
			
			for (j = 0; j < DAO.students.length; j++) {
				if (DAO.students[j].id == userId)
					break;
							
				if(j == DAO.students.length) {
					msg += "Invalid userID";
					throw new UserNotFoundException(msg);
				}
			}
			
			if(DAO.students[j].balance < 1) {
				msg += "Maximum Book limit reached. You have already issued 4 books.";
				throw new InsufficientBookBalanceException(msg);
			}
			
			if(DAO.hardMedia[i].availability < 1) {
				msg  += "All Books with this book id are already issued.No more books available.";
				throw new BookNotAvailableException(msg);
			}
			
			DAO.students[j].balance--;
			DAO.hardMedia[i].availability--;
			
			msg += "Successfully issued.";
		}

		else if(userType.equals("staff")) {

	    	for(i = 0; i < DAO.staffs.length; i++) {

	        	if(DAO.staffs[i].id == userId)
	         		break;

	        	if(i == DAO.staffs.length) {
	          		msg += "Invalid userId";
	          		throw new UserNotFoundException(msg);
	        	}
	      	}
	      	for(j = 0; j < DAO.hardMedia.length; j++) {

	        	if(DAO.hardMedia[j].bookId == bookId)
	          		break;
	        
	        	if(i == DAO.hardMedia.length) {
	          		msg += "Invalid user or book Id";
	          		throw new BookNotFoundException(msg);
	        	}
	     	}

	      	if(DAO.staffs[i].balance < 1) {
	        	msg += "Insufficient balance to issue book";
	        	throw new InsufficientBookBalanceException(msg);
	      	}
	      	if(DAO.hardMedia[j].availability < 1) {
	        	msg += "Book is not available";
				throw new BookNotAvailableException(msg);
		 	}

	    	DAO.staffs[i].balance--;
	    	DAO.hardMedia[j].availability--;
	    	msg += "book issued successfully";
    	}
    	else {
	    	msg += "Invalid user type";
	    	throw new InvalidUserTypeException(msg);
    	}
    	return msg;
 	}	

	public static String returnBook(int bookId, int userId, String userType)
	throws BookNotAvailableException,InsufficientBookBalanceException,BookNotFoundException,UserNotFoundException,InvalidUserTypeException {
		
		String msg = "";
		if(userType.equals("student")){	
			for (i = 0; i < DAO.hardMedia.length; i++) {

				if (DAO.hardMedia[i].bookId == bookId)
					break;
				
				if(i == DAO.hardMedia.length) {
					msg += "Invalid bookID";
					throw new BookNotFoundException(msg);
				}
			}	
				
			for (j = 0; j < DAO.students.length; j++) {

				if (DAO.students[j].id == userId)
					break;
				
				if(j == DAO.students.length) {
					msg  += "Invalid userID";
					throw new UserNotFoundException(msg);
				}
			}
				
			if(DAO.students[j].balance >= 4) {
				msg  += "You haven't issued any book";
				throw new InsufficientBookBalanceException(msg);
			}

			if(DAO.hardMedia[i].availability >= 5) {
				msg  += "You haven't issued any book";
				throw new BookNotAvailableException(msg);
			}

			DAO.students[j].balance++;
			DAO.hardMedia[i].availability++;
			
			msg  += "Successfully returned.";
		}
		else if(userType.equals("staff")){	
			for (i = 0; i < DAO.hardMedia.length; i++) {

				if (DAO.hardMedia[i].bookId == bookId)
					break;
				
				if(i == DAO.hardMedia.length) {
					msg += "Invalid bookID";
					throw new BookNotFoundException(msg);
				}
			}	
				
			for (j = 0; j < DAO.staffs.length; j++) {

				if (DAO.staffs[j].id == userId)
					break;
				
				if(j == DAO.staffs.length) {
					msg  += "Invalid userID";
					throw new UserNotFoundException(msg);
				}
			}
				
			if(DAO.staffs[j].balance >= 6) {
				msg  += "You haven't issued any book";
				throw new InsufficientBookBalanceException(msg);
			}

			if(DAO.hardMedia[i].availability >= 5) {
				msg  += "You haven't issued any book";
				throw new BookNotAvailableException(msg);
			}

			DAO.staffs[j].balance++;
			DAO.hardMedia[i].availability++;
			
			msg  += "Successfully returned.";
		}
		else {
			msg += "Invalid user type";
			throw new InvalidUserTypeException(msg);
		}
		return msg;
	}		

	public static int checkBalance(int userId, String userType) {

		if(userType.equals("student")) {
			for(i = 0; i < DAO.students.length; i++) {
				if(DAO.students[i].id == userId)	
					return DAO.students[i].balance;
			}
    	}
        else if(userType.equals("staff")) {
			for(i = 0; i < DAO.staffs.length; i++) {
				if(DAO.staffs[i].id == userId)	
					return DAO.staffs[i].balance;
			}
		}
		return -1;
	}

	public static String searchBook(int bookId, String bookType)
	throws BookNotFoundException {
		String msg = "";
		if(bookType.equals("hardMedia")) {
			for(i = 0; i < DAO.hardMedia.length; i++) {
				if(DAO.hardMedia[i].bookId == bookId) {
					return DAO.hardMedia[i].location;
					break;
				}
			}
			if(i == DAO.hardMedia.size()) {
				msg = "Book not Found!";
      			throw new BookNotFoundException(msg);
			}
		}
		else if(bookType.equals("softMedia")) {
			for(i = 0; i < DAO.softMedia.length; i++) {

				if(DAO.softMedia[i].bookId == bookId) {
					return DAO.softMedia[i].location;
					break;
				}
			}
			if(i == DAO.softMedia.size()) {
				msg = "Book not Found!";
      			throw new BookNotFoundException(msg);
			}
		}
		return msg;	
	}
		
	public static String searchBook(String bookTitle, String bookType)
	throws BookNotFoundException {

		String msg = "";
		if(bookType.equals("hardMedia")) {
			for(i = 0; i < DAO.hardMedia.length; i++) {

				if(DAO.hardMedia[i].title.equals(bookTitle)) {
					return DAO.hardMedia[i].location;
					break;
				}
			}
			if(i == DAO.hardMedia.size()) {
				msg = "Book not Found!";
      			throw new BookNotFoundException(msg);
			}
		}
		else if(bookType.equals("softMedia")) {
			for(i = 0; i < DAO.softMedia.length; i++) {

				if(DAO.softMedia[i].title.equals(bookTitle)) {
					msg += DAO.softMedia[i].location;
					break;
				}		
			}
			if(i == DAO.softMedia.size()) {
				msg = "Book not Found!";
      			throw new BookNotFoundException(msg);
			}
		}
		return msg;
	}	
}