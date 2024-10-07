package chainOfResponsability;

public class SupportApprentice extends Support {
    public void handleSupport(String problem) {
        if (problem.equals("simple")) {
            System.out.println("The apprentive solve the problem");
        } else if (next != null) {
            next.handleSupport(problem);
        }
    }
}
