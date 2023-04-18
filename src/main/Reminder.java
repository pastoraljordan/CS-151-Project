package main;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reminder {
	
	private String name;
	private String description;
	private Calendar date;
	private boolean use;
	private Priority priority;
	private Repetition repetition;
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy: HH:mm");
	
	public Reminder(String name, String description, Calendar date,
			Priority priority, Repetition repetition) {
		this.name = name;
		this.description = description;
		this.date = date;
		this.use = true;
		this.priority = priority;
		this.repetition = repetition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public boolean isUse() {
		return use;
	}

	public void setUse(boolean use) {
		this.use = use;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Repetition getRepetition() {
		return repetition;
	}

	public void setRepetition(Repetition repetition) {
		this.repetition = repetition;
	}
	
}
