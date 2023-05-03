package backend;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String number;
    private String username;
    private String password;
    private List<Reminder> reminders;

    public User(String name, String number, String username, String password) {
        this.name = name;
        this.number = number;
        this.username = username;
        this.password = password;
        this.reminders = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
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
