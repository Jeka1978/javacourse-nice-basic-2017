package mySpring;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class IRobot {
    @InjectByFieldType
    private Speaker speaker;
    @InjectByFieldType
    private Cleaner cleaner;


    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
