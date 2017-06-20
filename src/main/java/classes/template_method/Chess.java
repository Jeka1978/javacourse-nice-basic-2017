package classes.template_method;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Chess extends Game {
    public Chess(Player player1, Player player2) {
        super(player1, player2);
    }

    protected boolean endOfGame() {
        return false;
    }

    protected void prepareBoard() {

    }

    protected void calculateScore() {

    }









    public static void main(String[] args) {
    }







}
