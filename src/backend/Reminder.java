package backend;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Reminder {

    private String username;
    private String title;
    private String description;
    private String date;
    private Repetition repetition;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy: HH:mm");

    public Reminder(String username, String title, String description, String date, Repetition repetition) {
        this.username = username;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Repetition getRepetition() {
        return repetition;
    }

    public void setRepetition(Repetition repetition) {
        this.repetition = repetition;
    }

}
