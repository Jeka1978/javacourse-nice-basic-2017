package heroes;

import heroes.util.RandomUtil;

import static heroes.util.RandomUtil.getRandomBetween;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Sword implements KickStrategy {
    @Override
    public int kick(Character character, Character opponent) {
        int damage = getRandomBetween(0, character.getPower());
        opponent.decreaseHp(damage);
        return damage;
    }
}
