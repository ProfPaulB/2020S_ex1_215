package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Jean Hoang
 * @author # 991580595
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        String mhSuit = "";

        Card c = null;
        for (int i = 0; i < magicHand.length; i++) {
            c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * magicHand.length));
            c.getValue();

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(String.valueOf((int) (Math.random() * ((3) + 1))));
            mhSuit = c.getSuit();

        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter card value: ");
        int ipValue = in.nextInt();

        System.out.print("Enter the suit: ");
        String ipSuit = in.next();

        System.out.printf("You draw a value of %d, suit is %s\n", ipValue, ipSuit);

        // and search magicHand here
        System.out.println("Card value goes from 1-52 \n" +
                "Suit values:\n" +
                "==================================\n" +
                "0. Hearts\n" +
                "1. Diamonds\n" +
                "2. Spades\n" +
                "3. Clubs\n");
        System.out.print("The magic hand draws: ");
        System.out.println(c);
        //Then report the result here
    }

}
