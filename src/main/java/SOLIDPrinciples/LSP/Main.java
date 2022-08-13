package SOLIDPrinciples.LSP;

public class Main {
    public static void main(String[] args) {

        A a;
        char[] list = {'a', 'b', 'c'};
        for (char ch : list) {
            if (ch == 'a') {
                a = new A();
            } else if (ch == 'b') {
                a = new B();
            } else {
                a = new C();
            }
            System.out.println(a.print());
        }

    }
}
