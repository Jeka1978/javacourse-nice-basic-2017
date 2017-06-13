package zoo;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class AnimalDoctor {
    public void treat(Animal animal) {



        if (animal instanceof Dog) {
          ((Dog) animal).bringStick();
        } else {
            System.out.println("doctor is treating....");
            animal.makeVoice();
        }


    }
}
