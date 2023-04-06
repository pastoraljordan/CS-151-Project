package main;

import java.util.Scanner;

public class AppController {

	private User user;
	
	public String registerUser(String number, Carrier carrier) throws Exception {
		
		// Temporary "account creation", waiting on frontend creation
		Scanner reader = new Scanner(System.in);
		System.out.println("Create a password: ");
		String password = reader.nextLine();
		user = new User(number, carrier, password);
		
		// Add user to a database or list in class
		
		return "New User successfully created";
	}
	
	public void deleteUser() {
		
		// Remove current user from the database or list in class
		
	}
	
	public boolean validateUser() {
		
		// Checks if there is a user in the database (or list in class) that matches
		
		return false;
	}
}
