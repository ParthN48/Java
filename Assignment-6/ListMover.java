import java.util.*;
import java.io.*;

public class ListMover {
	public static void main(String args[]) {
		int i;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> subjects = new ArrayList<String>();
		ArrayList<String> selectedsubjects = new ArrayList<String>();
		while(true) {
			System.out.println("1.Add Subject");
			System.out.println("2.Select Subject");
			System.out.println("3.Display List");
			System.out.println("4.Exit");
			System.out.println("Enter choice: ");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice) {
				case 1 : System.out.println("Enter Subject: ");
						 subjects.add(keyboard.nextLine());
						 break;

				case 2 : for(i = 0; i < subjects.size(); i++) {
						 	System.out.println(i + " : " + subjects.get(i));	
						 }
						 System.out.println("Enter Index: ");
						 choice= keyboard.nextInt();
						 selectedsubjects.add(subjects.get(choice));
						 subjects.remove(choice);	
						 break;

				case 3 : System.out.println("\nSubjects: ");
						 for(i = 0; i < subjects.size(); i++) {
						 	System.out.println(i + " : " + subjects.get(i));	
						 }
						 System.out.println();
						 System.out.println("Selected Subjects: ");
						 for(i = 0; i < selectedsubjects.size(); i++) {
						 	System.out.println(i + " : " + selectedsubjects.get(i));	
						 }
						 System.out.println();
						 break;

				case 4 : System.exit(0);
						 break;

				default : System.out.println("Invalid Input..");
						  break;		 		 
			}
		}
	}
}