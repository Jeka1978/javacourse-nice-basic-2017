package mySpring;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class Mekarer {
    private Speaker speaker = new ConsoleSpeaker();

    public void checkMissingProducts(){
        if (milkIsMissing()) {
            speaker.speak("Milk finished");
        }
    }

    private boolean milkIsMissing() {
        return true;
    }
}
