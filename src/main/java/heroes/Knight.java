package heroes;

import heroes.util.RandomUtil;
import lombok.Setter;

import java.util.Random;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Knight extends Character {
    @Setter
    private KickStrategy kickStrategy = new Sword();


    public Knight() {
        setHp(RandomUtil.getRandomBetween(2,12));
        setPower(RandomUtil.getRandomBetween(2,12));
    }

    @Override
    public int kick(Character enemy) {

       return kickStrategy.kick(this,enemy);
    }
}
