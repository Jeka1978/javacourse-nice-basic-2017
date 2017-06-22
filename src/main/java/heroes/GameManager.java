package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public interface GameManager {
    void play() throws InstantiationException, IllegalAccessException;

    void play(Character c1, Character c2);
}
