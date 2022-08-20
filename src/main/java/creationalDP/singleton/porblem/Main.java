package creationalDP.singleton.porblem;

public class Main {
    // Need to count all login users;
    public static void main(String[] args) {
        Counter countUser1 = new Counter();
        countUser1.addUser();
        System.out.println("instance Object from Counter: " + countUser1);
        System.out.println("No.of Users: " + countUser1.getCounter());

        //with user 2 >> counter bust be 2 !!
        //but class counter made 2 instance in the memory
        //so to solve it we must make 1 instance for every user >> Singleton
        Counter countUser2 = new Counter();
        countUser2.addUser();
        System.out.println("instance Object from Counter: " + countUser2);
        System.out.println("No.of Users: " + countUser2.getCounter());

    }
}
