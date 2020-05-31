package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @Gurpriya Kaur
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.suitSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
            Card LuckyCard = new Card();
            LuckyCard.setValue(4);
            LuckyCard.setSuit("Clubs");
            int num=0;
            for(int i=0;i<magicHand.length;i++)
            {
                if(LuckyCard.getValue()==magicHand[i].getValue()&&LuckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
                {
                    num=1;
                    
                }
            }
            if(num==1)
            {
                System.out.println("you won!!!!!!!!!");
                
            }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
