package creationalDP.singleton.solution;


public class Main {
    // Need to count all login users;
    public static void main(String[] args) {
        Counter countUser1 = Counter.getInstance();
        countUser1.addUser();
        System.out.println("instance Object from Counter: " + countUser1);
        System.out.println("No.of Users: " + countUser1.getCounter());

        //with user 2 >> counter bust be 2 $$
        Counter countUser2 = Counter.getInstance();
        countUser2.addUser();
        System.out.println("instance Object from Counter: " + countUser2);
        System.out.println("No.of Users: " + countUser2.getCounter());

    }
}
