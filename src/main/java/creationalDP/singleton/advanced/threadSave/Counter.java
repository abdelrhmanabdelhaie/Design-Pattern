package creationalDP.singleton.advanced.threadSave;

//Thread-safe Singleton with lazy loading

//Lazy initialization == init once we need this class not once program run!
//#1- synchronized to look the function
//#2- synchronized to look the If condition
public class Counter {
    //lazy
    private static Counter counter = null;
    private int count;

    private Counter() {
    }

    //#
    public static Counter getInstance() {
        if (counter == null) synchronized (Counter.class) {
            if (counter == null) {
                counter = new Counter();
            }
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
