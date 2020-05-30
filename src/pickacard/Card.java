package pickacard;

/**
 * @author anmol sekhon
 * 
 * May 29, 2020
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    public int randomSuit() {
        int number;
        
        number = (int)(Math.random()*3.5);
        
        return number;
    }
    
    public int randomNumber() {
        int number;
        
        number = (int)(Math.random()*13);
        
        return number;
    }
    
    public String toString() {
        
        return getValue() + " of " + getSuit();
    }
   
    
}
