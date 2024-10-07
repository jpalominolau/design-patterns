package chainOfResponsability;

public abstract class Support {
    protected Support next;

    public void setNext(Support next) {
        this.next = next;
    }

    public abstract void handleSupport(String problem);
}
