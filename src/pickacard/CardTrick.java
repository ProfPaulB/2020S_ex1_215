package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);         
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
    
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter card value ");
        int value = input.nextInt();
        
        System.out.println("enter card suit");
        String suit = input.next();
        
        int result = 0;
        for(int i = 0; i < magicHand.length; i++){
            if(value==magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                result=1;
            }
        }
        if(result==1){
            System.out.println("Congratulations!! You are a Winner");            
        }
        else{
            System.out.println("you are a loser");
        }       
    }

}
