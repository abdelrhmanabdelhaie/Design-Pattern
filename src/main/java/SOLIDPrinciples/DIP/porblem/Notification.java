package SOLIDPrinciples.DIP.porblem;

public class Notification {

    private Hotmail hotmail;
    private Gmail gmail;

    public Notification(Hotmail hotmail, Gmail gmail) {
        this.hotmail = hotmail;
        this.gmail = gmail;
    }

    public void sendHotmail(){
        hotmail.send();
    }

    public void sendGmail(){
        gmail.send();
    }

    public Hotmail getHotmail() {
        return hotmail;
    }

    public void setHotmail(Hotmail hotmail) {
        this.hotmail = hotmail;
    }

    public Gmail getGmail() {
        return gmail;
    }

    public void setGmail(Gmail gmail) {
        this.gmail = gmail;
    }
}
