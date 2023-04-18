package backend;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Reminder {
	
	private String name;
	private String description;
	private Calendar date;
	private Priority priority;
	private Repetition repetition;
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy: HH:mm");
	
	public Reminder(String name, String description, Calendar date,
			Priority priority, Repetition repetition) {
		this.name = name;
		this.description = description;
		this.date = date;
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
