package singleton;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = Boss.getBoss();
        Boss boss2 = Boss.getBoss();

        // So with this I am demostrating that I am calling the same instance of the boss which is created in my class Boss
        // The first instance create the Boss and the second instance call the already created Boss
        System.out.println(boss1 == boss2);
    }
}