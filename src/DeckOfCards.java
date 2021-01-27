import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    /**
     * This constructor will create will create a default
     * deck of cards that has 52 cards
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();

        //we need to create Card objects using all the suits
        //and all the face names
        //loop over all the suits
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i=0; i<suits.size(); i++)
        {
            System.out.println(suits.get(i));
            //   datatype in each   variable  : this is the list to go over
            //   position of list   name
            for (String             faceName  : faceNames)
            {
                System.out.println(faceName + " of " +suits.get(i));
            }
        }
    }
}
