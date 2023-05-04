# CS151 - Task Reminder
## Title: Task Reminder
#### Group 1: Adam Nguyen (left group/class), Jordan Pastoral, and Zongze Lu (left group/class)

### Proposal Contributions:
- Adam wrote the Problem, Previous/Similar Works, Assumptions, part of High Level Description, State and Use Case Diagrams
- Jordan wrote most of the High Level Description, Functionality, Sequence and Class Diagrams, and Operations

### Project Presentation Contributions:
- Jordan - essentially everything

### Project Code and Report Contributions:
- Jordan - essentially everything

#### Problem:
Have you ever forgotten about your plant just to find out it’s withered because you forgot to water it? Maybe you missed your dentist appointment because you simply forgot. What if you’re on a tight schedule and need a reminder to keep yourself on track? With Task Reminder you can set “tasks” that remind you at a time you set and can even be recurring if the task needs to be repeated. 

#### Previous/Similar Works:
- Reminders (by Apple Inc.)
- Basically any app that notifies you at a certain time or interval

#### Assumptions/Operating Environment/Intended Usage:
- Assumptions: To be used in a java environment or IDE, like Eclipse or Netbeans.
- Operating: Running Java SE 17.
- Intended Usage: To create and set your own reminders and to notify you of them through text message.

#### High-Level Description (changed from Project Proposal):
Our project will be a java app that will have the user login or create an account to be saved into an SQL Database using SQLite. From there the app has a few options, Dashboard, All Reminders, Create Reminder, Settings, and Log Out. The Dashboard just lists current reminders that are set for the current day. It gets the reminder information by using SQLite's database and by getting the information based on certain needs from the application. In the All Reminders tab, it is exactly what it says, it lists all of the user's reminders that they have created, but there is no interaction. In the Create Reminder tab, the user can create their own reminder, set the title, description, date, time, and reoccurance (once, hourly, daily, weekly). After creation, it will send the task to the TextHandler, which will send the text reminder through Twilio's messaging API. The TextHandler will use the data of the reminder to determine the date it will be sent. The Twilio API is used to gain access to a free version of Twilio's messaging functionalities, so can only verify numbers through the website itself. In the Settings tab, you can change your Name, Username, and Password to your liking. The log out tab does exactly what it says and logs out the user back to the login screen.  

#### Functionality:
The Task Reminder app is very simple, it shows you visually what reminders you have created, and is able to create reminders and send you texts through your phone at the time and date that you specify. You register your account with your phone number and it will send you texts to that number, provided it was inputted correctly.

| UML Diagram   | Summary Description|
| ------------- | ------------- |
| [Class Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Class.png)              | The Class Diagram shows all of the information that the code will be using. It includes classes, variables, methods, and the relationships between all of them.    |
| [State Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/State.png)              | The State Diagram displays the conditions, events, and actions Task Reminder would have. It shows when a program is running and what happens when the program is not running. It also shows what happens when an error occurs. Shows when you enter the Task Reminder Interface's start and end.                                  |
| [Use Case Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Use_Case.png)        | The Use Case Diagram displays the various interactions the user may encounter with Task Reminder. The main interactions are Homepage, User Functions, Edit Reminders, Exit, and Registration Page. Each of ther main interactions have sub-interactions such as Homepage having a Login and Register function.                 |
| [Sequence Diagram](https://github.com/pastoraljordan/CS-151-Task-Reminder/blob/main/diagrams/Sequence.png)        | The Sequence Diagram shows how the different classes interact with each other and show what happens in those scenarios.        |


#### Operations: 
- Start page has register and login boxes
- Register asks for name, phone number, username and password
- If account is valid aka not same phone number or username as other account, will create a new account
- Login asks for username and password
- If valid information, changes view to the dashboard
- User can check out the other panes
- To create a new reminder, it will prompt you to input a name and description for this reminder, as well as a date and time and how often it will repeat
- The reminder will automatically send the reminder text upon creation of the reminder
- In settings tab, can edit your user information, all except phone number

#### Solution:
The way we've solved the problem of reminding yourself is by using a device that almost everyone owns. People are always on their phones and are always aware when they receive a message, so we've taken advantage of that and used it to create the text messaging system of the app, so that you are able to get these messages very easily.

#### Steps to run the project:
Clone this repo into your preferred IDE. Will need authentication token from me and copy paste it into the AUTH_TOKEN string in the SendReminders.java file as I was unable to figure out how to keep this information private. After that, run the LoginMain.java file.

#### Snapshots of the Running Program
