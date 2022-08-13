package SOLIDPrinciples.DIP.solution;


public class Notification {

    private final Mail mail;

    public Notification(Mail mail) {
        this.mail = mail;
    }

    public void sendMail() {
        mail.send();
    }


}
