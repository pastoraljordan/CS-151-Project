# CS151 - Task Reminder
## Title: Task Reminder
#### Group 1: Adam Nguyen, Jordan Pastoral, and Zongze Lu
#### Working on Proposal: Adam Nguyen, Jordan Pastoral, and Zongze Lu

#### Problem:
Have you ever forgotten about your plant just to find out it’s withered because you forgot to water it? Maybe you missed your dentist appointment because you simply forgot. What if you’re on a tight schedule and need a reminder to keep yourself on track? With Task Reminder you can set “tasks” that remind you at a time you set and can even be recurring if the task needs to be repeated. 

#### Previous/Similar Works:
Reminders (by Apple Inc.)

#### Assumptions/Operating Environment/Intended Usage:
Assumptions for our project are that the user requires tasks to be reminded to them at a particular time or date, whether it’s one-time or scheduled for multiple scenarios. The operative environment is the website. The intended usage is to create a “task” and set when and if you want if it’s reoccurring or not. The “task” can range from feeding your pet, watering your plants, appointments, events, etc. 

#### High-Level Description:
Our project will create a reminder for the user on the specific time and date they choose, and can set if they want it to repeat on a set interval that they choose. It will save this reminder to some sort of memory. These reminders can be toggled on and off so that the user can have multiple reminders set up without having to delete any, but they can be deleted if needed. Our approach will most likely involve the usage of Timer, Date and Time, and TimerTask to help implement these reminders. We will set objects that contain all the information listed, such as the date and time it will happen, the times it will reoccur, the priority of the reminder, etc. There will also be a way to change each reminder and set it to be on or off, through helper methods and booleans of the object itself. Will send a personalized text depending on the reminder's settings. Will create separate Gmail account for this application to send out text messages, and will use Google's Gmail API, to create the emails and send to the phone number set up with the reminder. Also will ask for the user's carrier since it would need the related number's email extension, e.g. @txt.att.net for AT&T numbers. For the moment, we will have limited carriers, just the major ones for now, but can pay to use a larger Email to SMS Gateway provider to gain access to their API. Will use the reminder information to create a personalized text based on the given reminder info. Looking for a way to utilize scheduled emails in Gmail, but if not, will just use built in Timer methods to send reminders at a later time.

#### Functionality:
Web browser is preferred because it’s much easier to input and track your task reminders on a browser rather than running an application. Task reminders are meant to make your life easier, having it on the web allows the user to start using our project much faster than it would be to download an application. When it's time for a reminder to go off, it will send a text message to your phone. Depending on the priority, it can send a text at the start of the morning, few hours before, or a few minutes before.

| UML Diagram   | Summary Description|
| ------------- | ------------- |
| [Class Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Class.png)         | The Class Diagram shows all of the information that the code will be using. It includes classes, variables, methods, and the relationships between all of them.        |
| State Diagram         | Text        |
|[Use Case Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Use_Case.png)   | Text        |
| [Sequence Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Sequence.png)        | The Sequence Diagram shows how the different classes interact with each other and show what happens in those scenarios.        |


#### Operations: 
- Ask for carrier of phone number
- Add phone number to receive text reminders
- Create a reminder that contains: The date and time of the reminder, the priority of it, how often it would be repeated (daily, weekly, monthly)
- Toggle on/off the reminder
- Change the date and time of the reminder
- Change the priority
- Change the amount of times it is repeated
- Change the title/description of the reminder
- Delete the reminder
