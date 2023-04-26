package backend;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Reminder {

    private String username;
    private String name;
    private String description;
    private Calendar date;
    private Repetition repetition;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy: HH:mm");

    public Reminder(String username, String name, String description, Calendar date, Repetition repetition) {
        this.username = username;
        this.name = name;
        this.description = description;
        this.date = date;
        this.repetition = repetition;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Repetition getRepetition() {
        return repetition;
    }

    public void setRepetition(Repetition repetition) {
        this.repetition = repetition;
    }

}
