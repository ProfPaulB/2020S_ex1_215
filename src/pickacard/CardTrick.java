package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Ubaid Ur Rehman May 30,2020
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

        
        Card luckyCard = new Card();
        
        luckyCard.setValue(4);
        
        luckyCard.setSuit("Clubs");
        
        int match = 0;
        for(int i = 0; i < magicHand.length; i++){
            if(luckyCard.getValue()== magicHand[i].getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
            {
                match=1;
            }
        }
        if(match==1){
            System.out.println("You have a matching card!");            
        }
        else{
            System.out.println("Sorry, your card does not match");
        }
    }

}