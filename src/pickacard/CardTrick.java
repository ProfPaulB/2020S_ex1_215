package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author sarthak may30 
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card cardTrick = new Card (7,"Spades");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the card ");     
        int CardValue = input.nextInt();
        input.nextLine();
        
        
        System.out.print("Enter suit ");
        
        String CardSuit = input.nextLine();

        Card luckyCard = new Card();
        luckyCard.setSuit(CardSuit);
        luckyCard.setValue(CardValue);
        
        int matches = 0; 
         for (int i=0; i<magicHand.length;i++) {
                        
            if ((magicHand[i].toString()).equals(luckyCard.toString())){
                System.out.println("you won");
                
                matches++;
            }
            
        }
        if (matches == 0) {
            System.out.println("you lost");
        }
    }
  }

}
