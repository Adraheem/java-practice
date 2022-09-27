package classwork.chapter7.gameOfCard;

public class DeckOfCardTest {
    private static final DeckOfCard deckOfCard = new DeckOfCard();

    public static void main(String[] args) {
        System.out.println("********************** BEFORE SHUFFLE **********************\n");
        printCards();

        deckOfCard.shuffle();

        System.out.println("\n\n********************** AFTER SHUFFLE **********************\n");
        printCards();
    }

    private static void printCards(){
        Card[] deck = deckOfCard.getDeck();

        for (int i = 0; i < deck.length; i++) {
            System.out.printf("%-25s", deck[i].toString());
            if((i+1)%4 == 0){
                System.out.println();
            }
        }
    }
}
