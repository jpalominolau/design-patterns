package chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Support apprentice = new SupportApprentice();
        Support supervisor = new SupportSupervisor();
        Support boss = new SupportBoss();

        apprentice.setNext(supervisor);
        supervisor.setNext(boss);

        apprentice.handleSupport("simple");
        apprentice.handleSupport("intermediate");
        apprentice.handleSupport("advanced");
        apprentice.handleSupport("unknown");
    }
}
