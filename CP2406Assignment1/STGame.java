package CP2406Assignment1;

/**
 * Created by matt on 6/09/2016.
 */
public class STGame {

    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private static STDeck deck;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;

    }

    public  void selectDealer() {
        //todo: google how to get random int in java
        dealerId = 1;
    }

    public static void dealRandomCards() {

        players = new STPlayer[numPlayers];
        for (STPlayer player : players) {
           ArrayList<STCard> card = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards();

        }
    }
}
