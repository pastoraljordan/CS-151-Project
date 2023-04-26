package backend;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    private ArrayList<User> users;
    private User user;

    public String registerUser(String number, Carrier carrier) throws Exception {

        // SQLite
        // Temporary "account creation"
        Scanner reader = new Scanner(System.in);
        System.out.println("Create a password: ");
        String password = reader.nextLine();
        reader.close();
        user = new User(number, carrier, password);
        users.add(user);

        // Add user to a database or list in class
        return "New User successfully created";
    }

    public void deleteUser(User delete) {

        // Remove current user from the database or list in class
        users.remove(delete);

    }

    public boolean validateUser(User valid) {

        // Checks if there is a user in the database (or list in class) that matches
        return users.contains(valid);
    }
}
