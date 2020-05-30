package pickacard;

import java.util.Scanner;

/**
 * @author anmol sekhon
 * 
 * May 29, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();
            c.setValue(c.randomNumber());
            //System.out.println(c.randomNumber());
            
            c.setSuit(Card.SUITS[c.randomSuit()]);
            //System.out.println(Card.SUITS[c.randomNumber()]);
            
            magicHand[i] = c;
            
        }

        //insert code to ask the user for Card value and suit, create their card
        //and search magicHand here
        //Then report the result here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Card Value >>> ");
        int userCardValue = scan.nextInt();
        
        //flushing the scanner
        scan.nextLine();
        
        System.out.print("Enter Card Suit >>> ");
        String userCardSuit = scan.nextLine();
        
        
        Card userCard = new Card();
        userCard.setSuit(userCardSuit);
        userCard.setValue(userCardValue);
        
        System.out.println(userCard);
        
        for (int i=0; i<magicHand.length;i++) {
            System.out.println(magicHand[i]);
        }
        
        
    }
}
