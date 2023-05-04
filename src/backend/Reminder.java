package backend;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reminder {

    private String username;
    private String title;
    private String description;
    private Calendar date;
    private Repetition repetition;

    DateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");

    public Reminder(String username, String title, String description, Calendar date, Repetition repetition) {
        this.username = username;
        this.title = title;
        this.description = description;
        this.date = date;
        this.repetition = repetition;
    }
    public Reminder(String username, String title, String description, Calendar date, String repetition) {
        this.username = username;
        this.title = title;
        this.description = description;
        this.date = date;
        this.repetition = Repetition.valueOf(repetition);
    }
    
    public void printReminder() {
        DateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");
        String str = username + " " + title + " " + description + " " + sdf.format(date.getTime()) + " " + repetition;
        System.out.println(str);
    }
    
    public Object[] getValues() {
        Object[] values = new Object[4];
        values[0] = title;
        values[1] = description;
        DateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");
        String date = sdf.format(this.date.getTime());
        values[2] = date;
        values[3] = repetition;
        return values;
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

    public static void main(String[] args) throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        Date date = dateFormat.parse("jul 09, 2002 10:10");
        cal.setTime(date);
        Date date1 = cal.getTime();
        
        Reminder test = new Reminder("username", "title", "description", cal, Repetition.hourly);
        System.out.println(dateFormat.format(date1));
    }
}
