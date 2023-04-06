package main;

import java.util.Date;
import java.util.Calendar;


public class ReminderTesting {
	
	public static void main(String[] args) {
		
		User jordan = new User("9253237905", Carrier.ATT, "password");
		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 2023);
		today.set(Calendar.MONTH, Calendar.APRIL);
		today.set(Calendar.DAY_OF_MONTH, 6);
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		
		Reminder remind = new Reminder("Test", "for testing purposes", today, Priority.low, Repetition.hourly);
		
		jordan.addReminder(remind);
	}
}
