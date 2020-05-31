package pickacard;

import java.util.Scanner;

/**
 * @author anmol sekhon
 * 
 * May 29, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        // creates a new card array of length 7
        Card[] magicHand = new Card[7];
        
        //this loop creates a new card with random values 
        //and puts it in the array 'magicHand'
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();
            
            c.setValue(c.randomNumber());          
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
            
        }

        //Scanner object 'scan' created for scanning inputs
        Scanner scan = new Scanner(System.in);
        
        /**
         * an int 'match' initialized to zero 
         * this will be used to check the number of matches
         * found later
         */
        int match = 0;
        
        //prompting user to enter a value for the card
        System.out.print("Enter Card Value >>> ");
        //scanning and storing the value in 'userCardValue'
        int userCardValue = scan.nextInt();
        
        //flushing the scanner
        scan.nextLine();
        
        //prompting user to enter the Suit to which the card belongs
        System.out.print("Enter Card Suit >>> ");
        
        //scanning and storing the scanned string in 'userCardSuit'
        String userCardSuit = scan.nextLine();
        
        //creating a new userCard object for user and
        //sets the values according to the values the user entered
        Card userCard = new Card();
        userCard.setSuit(userCardSuit);
        userCard.setValue(userCardValue);
        
        //checking if user's card matches with any card in magicHand
        //and counting if any match is found
        for (int i=0; i<magicHand.length;i++) {
                        
            if ((magicHand[i].toString()).equals(userCard.toString())){
                System.out.println("\nMatch Found!");
                
                match++;
            }
        }
        
        //presenting a report to user at the end
        System.out.println(userCard.report(match));
        
    }
}
