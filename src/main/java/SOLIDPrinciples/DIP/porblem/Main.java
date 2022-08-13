package SOLIDPrinciples.DIP.porblem;

public class Main {

    public static void main(String[] args) {

        Hotmail hotmail = new Hotmail("Abdo@h", "Rovy@h", "I love u");
        Gmail gmail = new Gmail("Rovy@G", "Abdo@G", "love u too");

        Notification notification = new Notification(hotmail, gmail);
        notification.sendHotmail();
        notification.sendGmail();
    }
}
