package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Alish Madhvani 
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)((Math.random()*12)+1)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //c.setValue(insert call to random number generator here) 
           //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             magicHand[i] = c;
        }
     
          Card luckyCard = new Card();
       
       
        luckyCard.setValue(5);                          
        luckyCard.setSuit(Card.SUITS[3]);
     
       for (Card magicHand1 : magicHand) {     
     
            if (luckyCard.getValue() == magicHand1.getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand1.getSuit())){
                System.out.println("You win It is  a match!");
            }else{
                System.out.println("Not a Match. the card was" + magicHand1.getValue() + " in suit: " + magicHand1.getSuit());
            }
       
    }

}
}
