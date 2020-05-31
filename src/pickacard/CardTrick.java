package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author mishail May 30,2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)(Math.random()*13)+1);         
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
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
            System.out.println("You win");            
        }
        else{
            System.out.println("you lose");
        }
    }

}
