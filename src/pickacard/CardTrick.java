package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Edgar Chavez
 * Date: 5/30/2020
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * (3 + 1))]);
            magicHand[i] = c;
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 13: ");
        int userValue = scan.nextInt();
        
        System.out.print("Enter a suit: ");
        String userSuit = scan.next();
        userSuit = userSuit.substring(0,1).toUpperCase() 
                + userSuit.substring(1).toLowerCase();
        
        Card userCard = new Card(userSuit, userValue);
        System.out.println(userCard.toString());
        //System.out.println("----------------------");
        
        boolean cardMatches = false;
        
        for (Card card : magicHand) {
            //System.out.println(card.toString());
            if (userCard.getSuit().matches(card.getSuit()) 
                    && userCard.getValue() == card.getValue()){
                cardMatches = true;
            } 
        }
        
        String message = cardMatches ? "Match!" 
                : "Sorry, your card is not there";
        System.out.println(message);
    }
}
