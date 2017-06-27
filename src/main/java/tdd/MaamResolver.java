package tdd;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class MaamResolver {
    private static MaamResolver ourInstance = new MaamResolver();

    public static MaamResolver getInstance() {
        return ourInstance;
    }

    private MaamResolver() {
    }

    public double getMaam(){
        return 0.17;
    }
}
