package com.vvp.lib.view;
import java.util.*;
import com.vvp.lib.model.*;
import com.vvp.lib.controller.*;

public class Libview {
			
	static void initView() {
			
		DAO data = new DAO();
		DAO.initData();
		Scanner keyboard  = new Scanner(System.in);
			
		while(true) {
			try {
				System.out.println("1.Issue Book");
				System.out.println("2.Return Book");
				System.out.println("3.Check your Balance");
				System.out.println("4.Search Book by Id");
				System.out.println("5.Search Book by Title");
				System.out.println("6.Exit");
				System.out.println("Enter your choice:");
				int choice = keyboard.nextInt();
				keyboard.nextLine();
				switch(choice) {
					case 1: System.out.println("Enter User Type: ");
	            			String userType = keyboard.nextLine();
	            			System.out.println("Enter BookId:");
							int bookId = keyboard.nextInt();
							System.out.println("Enter UserId:");
							int userId = keyboard.nextInt();
							String result = Transaction.issueBook(bookId,userId,userType);
							System.out.println("\n" + result + "\n");							System.out.println();
							break;

					case 2: System.out.println("Enter User Type: ");
	              			userType = keyboard.nextLine();
							System.out.println("Enter BookId:");
							bookId = keyboard.nextInt();
							System.out.println("Enter UserId:");
							userId = keyboard.nextInt();
							result = Transaction.returnBook(bookId,userId,userType);
							System.out.println("\n" + result + "\n");
							break;

					case 3: System.out.println("Enter User Type: ");
	              			userType = keyboard.nextLine();
	              			System.out.println("Enter userId:");
							userId = keyboard.nextInt();
							int bal = Transaction.checkBalance(userId,userType);
							if (bal == -1)
								System.out.println("\nInvalid UserId.\n");
							else
								System.out.println("\nbalance of UserId " + userId + " is " + bal + "\n");
							break;

					case 4: System.out.println("enter book Type hardMedia / softMedia:");
							String bookType = keyboard.nextLine();
							System.out.println("enter bookid:");
							bookId = keyboard.nextInt();
							String title = Transaction.searchBook(bookId,bookType);
							System.out.println("\nBook found at location: "+ title + "\n");
							break;

					case 5: System.out.println("enter book Type hardMedia / softMedia:");
							bookType = keyboard.nextLine();
							System.out.println("enter book title to search:");
							title = keyboard.nextLine();
							title = Transaction.searchBook(title,bookType);
							System.out.println("\nBook found at location: "+ title + "\n");
							break;

					case 6: System.exit(0);
							break;

					default: System.out.println("Enter valid input..\n");
							 break;										
				}
			}catch(InsufficientBookBalanceException ibbe){
				System.out.println(ibbe);
			}
			catch(BookNotAvailableException bnae){
				System.out.println(bnae);
			}
			catch(BookNotFoundException bnfe){
				System.out.println(bnfe);
			}
			catch(UserNotFoundException unfe){
				System.out.println(unfe);
			}catch(InvalidUserTypeException iute){
        		System.out.println(iute);
        	}	
        	catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
		
	public static void main(String args[]) {
		initView();
	}
}
