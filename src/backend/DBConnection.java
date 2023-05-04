package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DBConnection {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static void testConnection() throws SQLException {
        con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clearConnections() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {

        }
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {

        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {

        }
    }

    public static void createUsers() {
        clearConnections();
        try {
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String userTable = "CREATE TABLE Users ("
                    + "name varchar(255),"
                    + "number varchar(255),"
                    + "username varchar(255),"
                    + "password varchar(255));";
            stmt = con.createStatement();
            stmt.execute(userTable);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void createReminders() {
        clearConnections();
        try {
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            stmt = con.createStatement();
            String reminderTable = "CREATE TABLE Reminders ("
                    + "username varchar(255),"
                    + "title varchar(255),"
                    + "description varchar(255),"
                    + "date varchar(255),"
                    + "repetition varchar(255));";
            stmt.execute(reminderTable);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addUser(User user) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String insert = "INSERT INTO Users(name, number, username, password) "
                    + "VALUES ('"
                    + user.getName() + "', '"
                    + user.getNumber() + "', '"
                    + user.getUsername() + "', '"
                    + user.getPassword() + "');";
            stmt = con.createStatement();
            stmt.execute(insert);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addReminder(Reminder reminder) {
        clearConnections();
        try {
            DateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");
            String date = sdf.format(reminder.getDate().getTime());
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String insert = "INSERT INTO Reminders(username, title, description, date, repetition) "
                    + "VALUES ('"
                    + reminder.getUsername() + "', '"
                    + reminder.getTitle() + "', '"
                    + reminder.getDescription() + "', '"
                    + date + "', '"
                    + reminder.getRepetition() + "');";
            stmt = con.createStatement();
            stmt.execute(insert);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean validAccount(String username, String password) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String valid = "SELECT * FROM Users WHERE username = '" + username
                    + "' AND password = '" + password + "';";
            stmt = con.createStatement();
            rs = stmt.executeQuery(valid);
            if (rs.next()) {
                return true;
            }
            rs.close();
            stmt.close();
            con.close();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean validAccount(String username) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String valid = "SELECT * FROM Users WHERE username = '" + username + "';";
            stmt = con.createStatement();
            rs = stmt.executeQuery(valid);
            if (rs.next()) {
                return true;
            }
            rs.close();
            stmt.close();
            con.close();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean validAccountNumber(String number) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String valid = "SELECT * FROM Users WHERE number = '" + number + "';";
            stmt = con.createStatement();
            rs = stmt.executeQuery(valid);
            if (rs.next()) {
                return true;
            }
            rs.close();
            stmt.close();
            con.close();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean validReminder(String title) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String valid = "SELECT * FROM Reminders WHERE title = '" + title + "';";
            stmt = con.createStatement();
            rs = stmt.executeQuery(valid);
            if (rs.next()) {
                return true;
            }
            rs.close();
            stmt.close();
            con.close();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void printAll() {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String users = "SELECT name, number, username, password FROM Users;";
            String reminders = "SELECT username, title, description, date, repetition FROM Reminders;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(users);
            while (rs.next()) {
                String name = rs.getString("name");
                String number = rs.getString("number");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println(name + " " + number + " " + username + " " + password);
            }
            rs = stmt.executeQuery(reminders);
            while (rs.next()) {
                String username = rs.getString("username");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String date = rs.getString("date");
                String repetition = rs.getString("repetition");
                System.out.println(username + " " + title + " " + description + " " + date + " " + repetition);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static User getUser(String username) {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String select = "SELECT * FROM Users WHERE username = '" + username + "'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(select);
            if (rs.next()) {
                User user = new User(rs.getString("name"), rs.getString("number"),
                        rs.getString("username"), rs.getString("password"));
                rs.close();
                stmt.close();
                con.close();
                return user;
            }
            rs.close();
            stmt.close();
            con.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Reminder getReminder(String username, String title) throws ParseException {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String select = "SELECT * FROM Reminders WHERE (username = '" + username
                    + "' AND title = '" + title + "' ORDER BY date ASC);";
            stmt = con.createStatement();
            rs = stmt.executeQuery(select);
            if (rs.next()) {
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy: HH:mm aa");
                cal.setTime(sdf.parse(rs.getString("date")));
                Reminder reminder = new Reminder(rs.getString("username"), rs.getString("title"),
                        rs.getString("description"), cal, Repetition.valueOf(rs.getString("repetition")));
                rs.close();
                stmt.close();
                con.close();
                return reminder;
            }
            rs.close();
            stmt.close();
            con.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Reminder> getAllReminders(String username) throws ParseException {
        clearConnections();
        ArrayList<Reminder> allReminders = new ArrayList<Reminder>();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String select = "SELECT * FROM Reminders WHERE (username = '" + username
                    + "');";
            stmt = con.createStatement();
            rs = stmt.executeQuery(select);
            while (rs.next()) {
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy: HH:mm aa");
                cal.setTime(sdf.parse(rs.getString("date")));
                Reminder reminder = new Reminder(rs.getString("username"), rs.getString("title"),
                        rs.getString("description"), cal, Repetition.valueOf(rs.getString("repetition")));
                allReminders.add(reminder);
            }
            rs.close();
            stmt.close();
            con.close();
            return allReminders;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void clear() {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String clear = "DELETE FROM Users;";
            Statement stmt = con.createStatement();
            stmt.execute(clear);
            clear = "DELETE FROM Reminders;";
            stmt.execute(clear);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void deleteTables() {
        clearConnections();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
            String clear = "DROP TABLE Users;";
            Statement stmt = con.createStatement();
            stmt.execute(clear);
            clear = "DROP TABLE Reminders;";
            stmt.execute(clear);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBConnection.createUsers();
        DBConnection.createReminders();
        DBConnection.printAll();
    }
}
