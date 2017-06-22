package heroes.util;

import java.util.Random;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class RandomUtil {
    private static Random random = new Random();
    public static int getRandomBetween(int min, int max) {
        return min + random.nextInt(max - min);
    }
}
