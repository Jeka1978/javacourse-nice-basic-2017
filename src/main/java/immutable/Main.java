package immutable;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "java";
        str = str.toUpperCase();
        System.out.println("str = " + str);


        ImmutablePerson person = new ImmutablePerson(12);
        person = person.setAge(115);

        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.setAge(12);

    }
}
