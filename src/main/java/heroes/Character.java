package heroes;

import lombok.Data;
import reflectios_examples.TestMethod;

/**
 * Created by Evegeny on 22/06/2017.
 */
@Data
public abstract class Character {
    private int power;
    private int hp;

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract int kick(Character enemy);

    public void decreaseHp(int delta) {
        this.setHp(this.getHp()-delta);
    }
    public void decreasePower(int delta) {
        this.setPower(this.getPower()-delta);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " power=" + power +
                ", hp=" + hp;
    }
}













