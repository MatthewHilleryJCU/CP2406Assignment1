package CP2406Assignment1;

/**
 * Created by matt on 30/08/2016.
 */
public class assignment1 {

    private static final int NEW_GAME = 1;

    public static void main (String[] args){

        showWelcome();
        showMenu();
        int opt = getUserMenuInput();
        if(NEW_GAME == opt) {
            startNewGame();
        }
    }

    private static void startNewGame() {
        int numPlayers = getNumPlayers();
        STGame = new STGame(numPlayers);
        STGame.selectDealer();
        STGame.dealRandomCards();
    }

    private static int getNumPlayers() {
        //todo: see prac how to number
        return 2;
    }

    private static int getUserMenuInput() {
        //todo: see prac how to get int value
        return 1;
    }

    private static void showMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit Game");
        System.out.println("1. Start Game");
    }

    private static void showWelcome() {
        System.out.println("Hello");
    }
}
