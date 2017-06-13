package zoo;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        int x = 12;
        AnimalDoctor animalDoctor = new AnimalDoctor();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animalDoctor.treat(cat);

    }
}
