package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @Shrey Patel
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random num = new Random();
        Scanner in = new Scanner(System.in);
        int randNumber;
        int randSuit;
        randNumber = num.nextInt(14);
        randSuit = num.nextInt(4);


        for (int i = 0; i < magicHand.length; i++) {

            Card c = new Card();
            c.setValue(randNumber);
            c.setSuit(Card.SUITS[randSuit]);
        }
        
        System.out.println("Pick a card, any card");
        System.out.println("Enter and number between 1-13 and a suit");
        System.out.print("Card number?  ");
        int cardNum = in.nextInt();
        System.out.print("What suit?  ");
        int suitNum = in.nextInt();
        
        if (randNumber == cardNum && randSuit == suitNum){
               System.out.println("Your card is in the Magic hand!");
        }
        else{
            System.out.println("Your card isn't in the magic hand");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
