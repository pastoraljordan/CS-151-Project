package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
			if(con != null)
				con.close();
		}
		catch (SQLException e) {
			
		}
		try {
			if(stmt != null)
				stmt.close();
		}
		catch (SQLException e) {
			
		}
		try {
			if(rs != null)
				rs.close();
		}
		catch (SQLException e) {
			
		}
	}
	
	public static void createTable(){
		clearConnections();
		try {
			con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
			String userTable = "CREATE TABLE Users ("
					+ "name varchar(255),"
					+ "email varchar(255),"
					+ "username varchar(255),"
					+ "password varchar(255));";
			stmt = con.createStatement();
			stmt.execute(userTable);
			String reminderTable = "CREATE TABLE Reminders ("
					+ "username varchar(255),"
					+ "title varchar(255),"
					+ "description varchar(255)"
					+ "date varchar(255),"
					+ "repetition varchar(255));";
			stmt.execute(reminderTable);
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addUser(User user){
		clearConnections();
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
			String insert = "INSERT INTO Users(name, email, username, password) "
					+ "VALUES ('"
					+ user.getName() + "', '"
					+ user.getEmail() + "', '"
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
	
	public static void addReminder(Reminder reminder){
		clearConnections();
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:CS151.db");
			String insert = "INSERT INTO Reminders(username, title, description, date, repetition) "
					+ "VALUES ('"
					+ reminder.getUsername() + "', '"
					+ reminder.getName() + "', '"
					+ reminder.getDescription() + "', '"
					+ reminder.getDate() + "', '"
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
			if(rs.next()) {
				return true;
			}
			rs.close();
			stmt.close();
			con.close();
			return false;
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*private static void printAll() {
		clearConnections();
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
			String print = "SELECT firstname, lastname, email, password, username FROM Users;";
			stmt = con.createStatement();
			rs = stmt.executeQuery(print);
			while(rs.next()) {
				String first = rs.getString("firstname");
				String last = rs.getString("lastname");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String username = rs.getString("username");
				System.out.println(first + " " + last + " " + email + " " + password + " " + username);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}*/
	
	public static User getUser(String username) {
		clearConnections();
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
			String select = "SELECT * FROM Users WHERE username = '" + username + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(select);
			if(rs.next()) {
				User user = new User(rs.getString("name"), rs.getString("email"),
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
			
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Reminder getReminder(String username, String name) throws ParseException {
		clearConnections();
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:TaskReminder.db");
			String select = "SELECT * FROM Reminders WHERE (username = '" + username
					+ "' AND title = '" + name + "');";
			stmt = con.createStatement();
			rs = stmt.executeQuery(select);
			if(rs.next()) {
				Calendar date = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy HH:mm:ss");
				date.setTime(sdf.parse(rs.getString("date")));
				Reminder reminder = new Reminder(rs.getString("username"), rs.getString("title"),
						rs.getString("description"), date, Repetition.valueOf(rs.getString("repetition")));
				rs.close();
				stmt.close();
				con.close();
				return reminder;
			}
			rs.close();
			stmt.close();
			con.close();
			return null;
			
		} catch(SQLException e) {
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
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
