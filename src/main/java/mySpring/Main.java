package mySpring;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
      /*  Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf = " + elf);*/
    }
}
