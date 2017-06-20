package classes.template_method;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 20/06/2017.
 */
@AllArgsConstructor
public abstract class Game {
    private Player player1;
    private Player player2;


    public final void play() {
        prepareBoard();
        while (!endOfGame()){
            player1.move();
            player2.move();
        }
        calculateScore();
        updateBestScores();
    }
    protected abstract boolean endOfGame();
    protected abstract void prepareBoard();
    protected abstract void calculateScore();
    private void updateBestScores() {
        // some code here
    }
}
