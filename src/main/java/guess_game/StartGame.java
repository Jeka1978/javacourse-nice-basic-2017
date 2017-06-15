package guess_game;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class StartGame {

    public static final String B = "b";

    public static void main(String[] args) {

        String str = "a" + B + "c" +12+ "d";

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg);
        }
        str = sb.toString();

        GameManager gameManager = new GameManagerImpl();
        gameManager.play(20);
        gameManager.printBestScores();
        gameManager.play(10);
        gameManager.printBestScores();
    }
}
