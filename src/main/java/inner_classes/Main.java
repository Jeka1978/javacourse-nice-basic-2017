package inner_classes;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        Person.Builder builder = new Person.Builder();
        Person person1 = builder.age(20).salary(25).build();
        System.out.println("person1 = " + person1);

        Person person = builder.age(50).build();
        System.out.println("person = " + person);
    }
}
