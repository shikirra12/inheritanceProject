import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport() {
        throw new NoTransportException();
    }

    public String getStatus() {
        return status;
    }
    public void showStatus(){
        System.out.println("Current Status:" + getStatus());
    }
    protected void someMethod(){
        System.out.println("SOME TEXT");
    }
}
