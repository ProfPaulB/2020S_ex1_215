package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 * 2020-05-30
 * @author Safi Khalid
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Random randNum = new Random();
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit(Spade);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue(randNum.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[randNum.nextInt(4)]); 
            magicHand[i] = c;
            
        }
        
        Card userCard = new Card();
        
        System.out.print("Enter a card number: ");
        userCard.setValue(in.nextInt());
        System.out.print("Enter a card suit: ");
        userCard.setSuit(in.next());
        
        int i = 1;
        
        for (Card c : magicHand) {
            if (c == userCard){
                System.out.printf("Card number %d in the magic hand is the"
                        + " same as yours.\n", i);
                break;
                
            }
            else{
                System.out.printf("Card number %d in the magic hand is NOT the"
                        + " same as yours.\n", i);
            }
            i++;
        }
    }

}
