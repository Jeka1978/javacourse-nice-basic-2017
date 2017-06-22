package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class GameManagerImpl implements GameManager {
    private CharacterFactory characterFactory = new CharacterFactoryImpl();
    @Override
    public void play() throws InstantiationException, IllegalAccessException {
        Character c1 = characterFactory.getRandomCharacter();
        Character c2 = characterFactory.getRandomCharacter();
        play(c1,c2);
    }

    @Override
    public void play(Character c1, Character c2) {
        System.out.println("Lets fight begin");
        System.out.println("In the left corner: "+c1);
        System.out.println("In the right corner: "+c2);
        while (c1.isAlive() && c2.isAlive()) {
            int damage = c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName()+" made "+damage+" damage on "+c2);
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName()+" made "+damage+" damage on "+c1);
        }
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() +" won!!!");
        }
        if (c2.isAlive()) {
            System.out.println(c2 +"won!!!");
        }
    }
}








