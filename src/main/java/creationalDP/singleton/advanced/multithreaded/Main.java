package creationalDP.singleton.advanced.multithreaded;


public class Main {
    // Need to count all login users;
    //If you see the same value, then singleton was reused (yay!)
    //If you see different values, then 2 singletons were created (booo!!)
    public static void main(String[] args) {
        Thread User1 = new Thread(new User1());
        Thread User2 = new Thread(new User2());
        User1.start();
        User2.start();
    }


    static class User1 implements Runnable {
        @Override
        public void run() {
            Counter countUser1 = Counter.getInstance();
            countUser1.addUser();
            System.out.println("instance Object from Counter: " + countUser1);
            System.out.println("No.of Users: " + countUser1.getCounter());
        }
    }

    static class User2 implements Runnable {
        @Override
        public void run() {
            //with user 2 >> counter bust be 2 $$
            Counter countUser2 = Counter.getInstance();
            countUser2.addUser();
            System.out.println("instance Object from Counter: " + countUser2);
            System.out.println("No.of Users: " + countUser2.getCounter());
        }
    }
}

