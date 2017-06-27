package guava_collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class Pub {

    private Multimap<String, String> client2Beer = ArrayListMultimap.create();
    private Random random = new Random();


    public void addClientWithBeer(String client, String beer) {
        client2Beer.put(client, beer);
    }

    public String getRandomBeer(String client) {
        Collection<String> beers = client2Beer.get(client);
        ArrayList<String> strings = new ArrayList<>(beers);
        return strings.get(random.nextInt(beers.size()));
    }


    public static void main(String[] args) {
        Pub pub = new Pub();
        pub.addClientWithBeer("Uri","Kriek");
        pub.addClientWithBeer("Uri","Malt");
        pub.addClientWithBeer("Uri","Tuborg");
        pub.addClientWithBeer("Uri","Guiness");


        String beer = pub.getRandomBeer("Uri");
        System.out.println("beer = " + beer);


    }





}
