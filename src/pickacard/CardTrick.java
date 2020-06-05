package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Piotr Wysocki 5/30/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {        
            Card c = new Card(); 
            c.setValue((int)(Math.random() * 13) + 1);        
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);   
            magicHand[i] = c;         
        }
       
        Card luckyCard = new Card();
        luckyCard.setValue(3);                          
        luckyCard.setSuit(Card.SUITS[1]);
        System.out.println("Lucky card: " + luckyCard.getValue() + " " + luckyCard.getSuit());
        
        for (Card magicHand1 : magicHand) {         
            if (luckyCard.getValue() == magicHand1.getValue() 
                    && luckyCard.getSuit().equalsIgnoreCase(magicHand1.getSuit())){
                System.out.println("Winner! It's a match!");
            }else{
                System.out.println("No Match! " + magicHand1.getValue() + " " + magicHand1.getSuit());
            }
        }
    }
}
