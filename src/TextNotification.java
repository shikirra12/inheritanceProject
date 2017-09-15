import java.time.LocalDateTime;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;


    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.status = "Not Delivered";
        someMethod();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }


    @Override
    public void transport() {
//        super.transport();
        System.out.println("Subject: " + getSubject());
        System.out.println("Body: " + getBody());
        System.out.println("Recipient: " + getRecipient());
        System.out.println("Sms Provider: " + getSmsProvider());
    }
}

