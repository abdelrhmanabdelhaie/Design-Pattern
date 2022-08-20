package creationalDP.singleton.solution;

//Examples: DB-connection / Logger

//Our target is one instance for any user
//Solution:
//#1- Disable creating new Object >> private Constructor
//#2- Create a static creation method that acts as a constructor.
public class Counter {

    //#2
    private static final Counter counter = new Counter();
    private int count;

    //#1
    private Counter() {
    }

    //#2
    public static Counter  getInstance(){
        return counter;
    }

    public int getCounter() {
        return count;
    }

    public void addUser() {
        this.count += 1;
    }
}
