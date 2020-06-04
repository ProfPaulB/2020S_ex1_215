package pickacard;

/**
 * @author dancye
 * @author Paul Bonenfant
 * @author Ubaid Ur Rehman May 30,2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        // loop to increase hand size to 7
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();
            //generating random card number
            c.setValue((int)(Math.random()*13)+1); 
            //generating random suit
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            magicHand[i] = c;
        }
        //luckyCard Obj
        Card luckyCard = new Card();
        //user picking between 1-13
        luckyCard.setValue(4);
        //User setting suit
        luckyCard.setSuit("Clubs");
        
        int match = 0;
        
        //loop to determine match or no match
        for(int i = 0; i < magicHand.length; i++){
            if(luckyCard.getValue()== magicHand[i].getValue() 
            && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
            {
            match=1;
            }
        }
        
        //output if card matches or not
        if (match==1){
            System.out.println("You have a matching card!");            
        }
        else{
            System.out.println("Sorry, your card does not match");
        }
    }

}
