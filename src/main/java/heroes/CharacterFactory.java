package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public interface CharacterFactory {
    Character getRandomCharacter() throws IllegalAccessException, InstantiationException;

    Character getConcreteCharacter(Class<? extends Character> type) throws IllegalAccessException, InstantiationException;
}
