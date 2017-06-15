package guess_game;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class GameManagerImpl implements GameManager {

    private Random random = new Random();
    private Player bestPlayer = new Player("noname");

    public void play(int max) {
        int numberOfTries =0;
        int randomNumber = random.nextInt(max) + 1;
        int userNumber = 0;
        while (userNumber != randomNumber) {
            numberOfTries++;
            userNumber = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
            if (userNumber > randomNumber) {
                JOptionPane.showMessageDialog(null, "too big");
            }
            if (userNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "too low");
            }
        }

        JOptionPane.showMessageDialog(null, "you won!!!");

        updateBestScore(numberOfTries,max);

    }

    private void updateBestScore(int numberOfTries, int max) {
        System.out.println(numberOfTries);
        if (numberOfTries > bestPlayer.getScore()) {
            String name = JOptionPane.showInputDialog("what is your name?");
            bestPlayer = new Player(name,((double) max/numberOfTries));

        }
    }

    public void printBestScores() {
        System.out.println("bestPlayer = " + bestPlayer);
    }
}
