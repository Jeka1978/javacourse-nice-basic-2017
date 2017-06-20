package interfaces;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Main {
    public static void main(String[] args) {
       Recorder recorder = new RecorderImpl();

        recorder.record();
    }
}
