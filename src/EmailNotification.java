import java.time.LocalDateTime;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtProvider;


    public EmailNotification(String subject, String body, String recipient, String smtProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtProvider = smtProvider;
        this.status = "Message Sent";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtProvider() {
        return smtProvider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtProvider != null ? smtProvider.equals(that.smtProvider) : that.smtProvider == null;
    }

    @Override
    protected Object clone() {
        EmailNotification newEmailNotification = new EmailNotification(this.getSubject(),this.getBody(),
                this.getRecipient(), this.getSmtProvider());
        return newEmailNotification;
    }

    @Override
    public String toString() {
        return "EmailNotification{}";
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtProvider != null ? smtProvider.hashCode() : 0);
        return result;
    }

    @Override
    public void someMethod() {
        super.someMethod();
    }

    @Override
    public void transport() {
//        super.transport();
        System.out.println("Subject: " + getSubject());
        System.out.println("Body: " + getBody());
        System.out.println("Recipient: " + getRecipient());
        System.out.println("Smart Provider: " + getSmtProvider());
    }
}

