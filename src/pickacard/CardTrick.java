package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Robin Methot,  May 29
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        // Enter the lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");
        
        String magicHandSuit = null;
        
        Card c = null;
        for (int i = 0; i < magicHand.length; i++) {
            c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 3) + 1]);
            magicHandSuit = c.getSuit();
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("There are 52 cards in the deck and four suits.\n"
                + "Hearts, Diamonds, Spades, and Clubs.");
        
        if (luckyCard.getValue() == c.getValue() && luckyCard.getSuit().equalsIgnoreCase(c.getSuit())){
            System.out.print("\nThe Lucky Card was the " + c.getValue() +
                    " of " + c.getSuit() + ".");
            System.out.print("\nCongratulations, you won!");
        } else {
            System.out.print("\nThe Lucky Card was the " + c.getValue() +
                    " of " + c.getSuit() + ".");            
            System.out.print("\nSorry, please try again.");
        }        
    }
}
