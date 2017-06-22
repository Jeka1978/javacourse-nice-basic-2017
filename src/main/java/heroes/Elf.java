package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Elf extends Character {
    private String name;

    public Elf() {
        setPower(10);
        setHp(10);
    }

    @Override
    public int kick(Character character) {
        if (character.getPower() < this.getPower()) {
            int hp = character.getHp();
            character.setHp(0);
            return hp;
        } else {
            character.decreasePower(1);
            return 0;
        }
    }
}


