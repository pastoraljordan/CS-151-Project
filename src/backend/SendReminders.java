package backend;

import com.twilio.Twilio; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.rest.api.v2010.account.ValidationRequest; 
 
public class SendReminders { 
    // Find your Account Sid and Token at twilio.com/console 
    public static final String ACCOUNT_SID = "ACbe58ae439a79a2c84d420f319958949c"; 
    public static final String AUTH_TOKEN = ""; 
    
    public static void sendMessage(String number, String title, String desc) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber(number), 
                new com.twilio.type.PhoneNumber("+18444240538"),  
                    title + "\n"
                            + desc)      
            .create(); 
 
        System.out.println(message.getSid()); 
    }
    
    public static void validateNumber(String number) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        ValidationRequest validationRequest = ValidationRequest.creator(
                new com.twilio.type.PhoneNumber("+14158675310"))
            .setFriendlyName(number)
            .create();

        System.out.println(validationRequest.getFriendlyName());
    }
 
    public static void main(String[] args) { 
        SendReminders.sendMessage("+19253237905", "title", "body");
    } 
}