package singleton;

public class Boss {
    private static Boss theBoss;

    private Boss() {
        System.out.println("The only one the miracle one, the only Boss!");
    }

    public static Boss getBoss(){
        if (theBoss == null) {
            theBoss = new Boss();
        }

        return theBoss;
    }
}
