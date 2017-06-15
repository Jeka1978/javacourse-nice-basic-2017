package collections;

import guess_game.Player;

import java.util.HashSet;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Player> set = new HashSet<Player>();
        Player david = new Player("David");

        set.add(david);
        boolean contains = set.contains(david);
    }
}
