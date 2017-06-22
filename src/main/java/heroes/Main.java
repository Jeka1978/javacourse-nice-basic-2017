package heroes;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GameManager gameManager = new GameManagerImpl();

        gameManager.play();
    }
}
