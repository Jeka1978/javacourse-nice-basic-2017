package interfaces;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Batman implements Bird,Plane {
    public void fly() {
        System.out.println("I'm flying!!!");
    }

    public static void main(String[] args) {
        Plane batman = new Batman();
//        batman.land();
    }
}
