package heroes;

import heroes.util.RandomUtil;
import lombok.Setter;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class King extends Character {
    @Setter
    private KickStrategy kickStrategy = new Sword();


    public King() {
        setHp(RandomUtil.getRandomBetween(5,15));
        setPower(RandomUtil.getRandomBetween(5,15));
    }

    @Override
    public int kick(Character enemy) {
        return kickStrategy.kick(this, enemy);
    }
}
