package lab1;

import com.nice.data.Person;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person2 = new Person();
        person2.setName("Jeka");

        Person person1 = new Person();
        person1.setName("Jeka");

        Person person3 = person2;

        System.out.println(person1==person2);
        System.out.println(person2==person3);

        System.out.println(person1.equals(person2));


    }
}
