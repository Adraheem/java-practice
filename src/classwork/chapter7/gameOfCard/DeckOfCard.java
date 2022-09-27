package classwork.chapter7.gameOfCard;

import java.security.SecureRandom;

public class DeckOfCard {
    private final int NUMBER_OR_CARDS = 52;
    private final static SecureRandom secureRandom = new SecureRandom();
    Card[] deck = new Card[NUMBER_OR_CARDS];

    // Generate the cards upon instantiation
    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int i = 0; i < NUMBER_OR_CARDS; i++) {
            deck[i] = new Card(faces[i%13], suits[i/13]);
        }
    }

    public Card[] getDeck(){
        return deck;
    }

    public void shuffle(){
        for (int i = 0; i < NUMBER_OR_CARDS; i++) {
            int j = secureRandom.nextInt(NUMBER_OR_CARDS);

            Card first = deck[i];
            Card second = deck[j];
            deck[i] = second;
            deck[j] = first;
        }
    }
}
