package chainOfResponsability;

public class SupportBoss extends Support {
    public void handleSupport(String problem) {
        if (problem.equals("advanced")) {
            System.out.println("The boss solve the problem");
        } else {
            System.out.println("The problem was too complicated to be solved");
        }
    }
}
