package SOLIDPrinciples.DIP.porblem;

public class Hotmail {


    private String from;
    private String to;
    private String body;


    public Hotmail(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }

    public void send(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Hotmail{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
