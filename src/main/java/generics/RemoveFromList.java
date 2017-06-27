package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class RemoveFromList {
    public static void main(String[] args) {
        List<String> heroes = new ArrayList<>();
        heroes.add("Arnold Shwarznegger");
        heroes.add("Stallone");
        heroes.add("Chuck Norris");
        heroes.add("Brus Willis");

        String heroToRemove = "Stallone";

//        heroes.removeIf(myHero -> myHero.equalsIgnoreCase(heroToRemove));


        Iterator<String> iterator = heroes.iterator();
        while (iterator.hasNext()) {
            String currentHero = iterator.next();
            if (currentHero.equalsIgnoreCase(heroToRemove)) {
                iterator.remove();
            }
        }

        System.out.println("heroes = " + heroes);










    }
}
