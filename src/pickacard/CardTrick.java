package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Hoora Tavana
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
       Card luckyCard = new Card();
        luckyCard.setValue(9);                         
        luckyCard.setSuit(Card.SUITS[2]);



        int Hand = 0;
        for(int i = 0; i < magicHand.length; i++){
            if(value==magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                Hand=1;
            }
        }
        if(Hand==1){
            System.out.println("Congratulations! You won!!");           
        }
        else{
            System.out.println("you lost!!");
        }       
    }

}
