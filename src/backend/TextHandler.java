package backend;

import static backend.Repetition.once;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TextHandler {

    private Timer timer;
    private TimerTask task;
    private CurrentUser current = CurrentUser.currentUser;
    private User user = current.getCurrentUser();

    public TextHandler(Reminder reminder) {
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                SendReminders.sendMessage("+1" + user.getNumber(), reminder.getTitle(), reminder.getDescription());
                System.out.println("Sent Message");
                timer.cancel();
            }
        };

        Calendar date = reminder.getDate();
        Repetition repeat = reminder.getRepetition();
        LocalDate now = LocalDate.now();
        LocalDate reminderDate = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(reminderDate);
        if(now.isAfter(reminderDate)) {
            repeat = Repetition.other;
        }
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
                System.out.println("not after current time");
        }
    }
}
