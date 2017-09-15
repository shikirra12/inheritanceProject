public class Main {
    public static void main(String[] args){
    EmailNotification myEmail = new EmailNotification("Coding Jobs", "I found a job!", "Corn", "Gmail");
    TextNotification myText = new TextNotification("OMW", "Are you at Starbucks?", "Bern", "AT&T");


        Object emailNotificationClone = myEmail.clone();
        emailNotificationClone.equals(myEmail);
//    myEmail.transport();
//    myText.transport();
//    myText.showStatus();
//    myEmail.showStatus();
//    myEmail.someMethod();
    }
}
