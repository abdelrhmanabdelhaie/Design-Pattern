package SOLIDPrinciples.DIP.solution;



public class Main {

    public static void main(String[] args) {
        Mail hMail=new Hotmail("Abdo@h", "Rovy@h", "I love u");
        Mail gMail=new Gmail("Rovy@G", "Abdo@G", "love u too");


        Notification notification = new Notification(hMail);
        notification.sendMail();
    }
}
