package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Hobbit extends Character {

    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    @Override
    public int kick(Character character) {
        cry();
        return 0;
    }

    private void cry() {
        System.out.println("auauauau");
    }
}
