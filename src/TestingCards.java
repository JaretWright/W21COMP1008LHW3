import java.util.ArrayList;
import java.util.Arrays;

public class TestingCards {
    public static void main(String[] args) {
        Card card1 = new Card("ace","spades");
        Card card2 = new Card("four","hearts");
        Card card3 = new Card("five","diamonds");
        Card card4 = new Card("queen", "hearts");
        Card card5 = new Card("king", "hearts");

        //ArrayList can be used to hold multiple objects
        //adding individual Card objects to the arraylist
        ArrayList<Card> myHand = new ArrayList<>();
        myHand.add(card1);
        myHand.add(card2);
        System.out.println(myHand);

        myHand.addAll(Arrays.asList(card3, card4, card5));
        System.out.println(myHand);

        //remove by position
        myHand.remove(0);
        System.out.println(myHand);

        //the card still exists in memory
        System.out.println(card1);

        System.out.println("\nCreating a deck of cards");
        DeckOfCards deck1 = new DeckOfCards();
    }
}
