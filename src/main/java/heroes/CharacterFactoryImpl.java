package heroes;

import heroes.util.RandomUtil;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class CharacterFactoryImpl implements CharacterFactory {

    private final List<Class<? extends Character>> list = new ArrayList<>();

    public CharacterFactoryImpl() {
        Reflections scanner = new Reflections("heroes");
        Set<Class<? extends Character>> set = scanner.getSubTypesOf(Character.class);
        for (Class<? extends Character> characterClass : set) {
            if (!Modifier.isAbstract(characterClass.getModifiers())) {
                list.add(characterClass);
            }
        }
    }

    @Override
    public Character getRandomCharacter() throws IllegalAccessException, InstantiationException {
        Class<? extends Character> characterClass = list.get(RandomUtil.getRandomBetween(0, list.size()));
        return characterClass.newInstance();
    }

    @Override
    public Character getConcreteCharacter(Class<? extends Character> type) throws IllegalAccessException, InstantiationException {

        return type.newInstance();
    }
}








