package main;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;

public class EmailHandler extends TimerTask {

	private Timer timer;
	private String textMessage;
	private Reminder reminder;
	
	//Since the GmailTest works, may just refactor and use its methods
	
	public void createMessage(Reminder reminder) {
		
		timer = new Timer();
		Repetition repeat = reminder.getRepetition();
		
		switch (repeat) {
		case hourly:
			break;
		case daily:
			break;
		case weekly:
			break;
		}
		
	}

	public void run(Reminder reminder) {
		try {
			GmailTest.sendMessage(reminder.getName(), textMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
