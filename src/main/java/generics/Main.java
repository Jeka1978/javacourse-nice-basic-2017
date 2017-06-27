package generics;

import zoo.Cat;

import java.util.*;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("scala");
        words.add("scala");
        words.add("groovy");
        words.add("groovy");

        Set<String> set = new HashSet<>(words);

        for (String s : set) {
            System.out.println(s);
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(words);

    }
}
