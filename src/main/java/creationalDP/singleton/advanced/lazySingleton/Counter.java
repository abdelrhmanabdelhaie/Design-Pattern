package creationalDP.singleton.advanced.lazySingleton;

//Examples: DB-connection / Logger

//Lazy initialization == init once we need this class not once program run!
public class Counter {
    //lazy
    private static Counter counter = null;
    private int count;

    private Counter() {
    }

    public static Counter getInstance() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }

    public int getCounter() {
        return count;
    }

    public void addUser() {
        this.count += 1;
    }
}
