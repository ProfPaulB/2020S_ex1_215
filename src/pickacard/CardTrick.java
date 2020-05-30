package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 * @author Fabian Bravo 2020-05-29
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        //These are lower bound and upper bound. 
        int min = 1;
        int max = 14;
        
        int secondmin = 0;
        int secondmax = 4;
        
        
        for (int i = 0; i < magicHand.length; i++) {
          Card c = new Card();
            c.setValue((int)(Math.random() * (max -min) + min));
            c.setSuit(Card.SUITS[(int)(Math.random() * (secondmax - secondmin) + secondmin)]);
            
            magicHand[i] = c;      
        }
        
        
        //Hard coding a new Card Object from Github
        Card luckyCard = new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(2);
        
        
       
        // and search magicHand here
        //Then report the result here
        String searchResults ="";
         for(Card c:magicHand){
             
             if(luckyCard.getValue() == c.getValue() && luckyCard.getSuit() == c.getSuit()){
                 searchResults = "We have a match!";
             }
             else{
                 searchResults = "Sorry, no match";
             }
        }
         
         System.out.println(searchResults);
         System.out.println("The lucky card used is: ");
         System.out.println(luckyCard.getValue()+luckyCard.getSuit());
         
         /*System.out.println("The magicHand is: ");
         for(Card c:magicHand){
             System.out.print(c.getValue()+c.getSuit()+ " ");
         }*/
        
    }

}
