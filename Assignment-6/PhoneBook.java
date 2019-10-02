import java.util.*;

class PhoneBook {
	public static void main(String args[]) {
		Properties phoneBook = new Properties();
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add name and Phone number");
			System.out.println("2.Search Phone number");
			System.out.println("3.Delete Phone number");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			int choice = keyboard.nextInt();
			ArrayList phoneNumber = new ArrayList();
			String name,result;
			keyboard.nextLine();
			switch(choice) {
				case 1: System.out.println("Enter name:");
						name = keyboard.nextLine();
						while(true) {
							System.out.println("Enter Phone Number:");
							phoneNumber.add(keyboard.nextLine());
							System.out.println("Do You want add another number");
							String ask = keyboard.nextLine();
							if(ask.equals("No"))
								break;
						}
						phoneBook.put(name,phoneNumber);
						break;

				case 2: System.out.println("Enter name:");
						name = keyboard.nextLine();
						result = phoneBook.get(name).toString();
						if(result == null)
							System.out.println("Phone number not found");
						else
							System.out.println("Name: " + name + "\nPhone number: " + result);
						break;

				case 3: System.out.println("Enter name:");
						name = keyboard.nextLine();
						result = phoneBook.get(name).toString();
						phoneBook.remove(name);
						System.out.println("\nName: " + name + "\nPhone number: " + result + "\nSuccesfully Removed..");
						break;		
						
				case 4: System.exit(0);
						break;

				default: System.out.println("Invalid choice..");
						 break;								
			}
		}
	}
}