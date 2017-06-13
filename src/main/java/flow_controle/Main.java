package flow_controle;

import com.nice.data.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(), new Person());
        for (Person person : people) {
            System.out.println("person = " + person);
        }
    }
}
