package chainOfResponsability;

public class SupportSupervisor extends Support {
    public void handleSupport(String problem) {
        if (problem.equals("intermediate")) {
            System.out.println("The supervisor solve the problem");
        } else if (next != null) {
            next.handleSupport(problem);
        }
    }
}
