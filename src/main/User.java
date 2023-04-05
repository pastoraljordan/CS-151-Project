package main;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int number;
	private Carrier carrier;
	private String password;
	private List<Reminder> reminders;
	
	public User(int number, Carrier carrier, String password) {
		this.number = number;
		this.carrier = carrier;
		this.password = password;
		this.reminders = new ArrayList<>();
	}
	
	public void forgotPassword() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Reminder> getReminders() {
		return reminders;
	}

	public void setReminders(List<Reminder> reminders) {
		this.reminders = reminders;
	}

}
