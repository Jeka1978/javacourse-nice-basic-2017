package homework;

import heroes.util.RandomUtil;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class DBUtils {

    public static int getMailCode() {
        return RandomUtil.getRandomBetween(1, 3);
    }
}
