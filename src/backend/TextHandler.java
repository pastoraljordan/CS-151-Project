package backend;

import static backend.Repetition.once;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TextHandler {

    private Timer timer;
    private Reminder reminder;
    private TimerTask task;
    private CurrentUser current = CurrentUser.currentUser;
    private User user = current.getCurrentUser();

    public TextHandler(Reminder reminder) {
        this.reminder = reminder;
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                SendReminders.sendMessage("+1" + user.getNumber(), reminder.getTitle(), reminder.getDescription());
                System.out.println("Sent Message");
                timer.cancel();
            }
        };

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");
        Calendar date = reminder.getDate();
        Repetition repeat = reminder.getRepetition();
        switch (repeat) {
            case once:
                timer.schedule(task, date.getTime());
                break;
            case hourly:
                timer.scheduleAtFixedRate(task, date.getTime(), 3600000);
                break;
            case daily:
                timer.scheduleAtFixedRate(task, date.getTime(), 86400000);
                break;
            case weekly:
                timer.scheduleAtFixedRate(task, date.getTime(), 604800000);
                break;
            default:
                timer.schedule(task, date.getTime());
                break;
        }
    }

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm aa");
        cal.setTime(sdf.parse("May 04, 2023 03:12 AM"));
        Reminder reminder = new Reminder("username", "Take out the trash", "Put it outside apartment", cal, once);
        TextHandler test = new TextHandler(reminder);
    }
}
