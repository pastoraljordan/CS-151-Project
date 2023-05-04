package backend;

import static backend.Repetition.once;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TextHandler {

    private Timer timer;
    private Reminder reminder;
    private TimerTask task;

    public TextHandler(Reminder reminder) {
        this.reminder = reminder;
        timer = new Timer();
        task = new TimerTask() {

            // Since the GmailTest works, may just refactor and use its methods
            @Override
            public void run() {
                try {
                    // GmailTest.sendMessage(reminder.getName(), reminder.getDescription());
                    System.out.println("Test Run");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        ;
        };

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
                
        }
    }
}
