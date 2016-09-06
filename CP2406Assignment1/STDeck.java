package CP2406Assignment1;

import java.util.ArrayList;

/**
 * Created by matt on 6/09/2016.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;

    //todo: list of all cards
    public STDeck() {
        cards = ArrayList<STCard>();

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
            cards.add(new STCard());
            //todo: google how to create random array of ints
        }

    }
    public ArrayList<STCard> dealCards(int i) {
        return null;
    }
}
