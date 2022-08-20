package creationalDP.singleton.porblem;

//Examples: DB-connection / Logger
public class Counter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void addUser() {
        this.counter += 1;
    }
}
