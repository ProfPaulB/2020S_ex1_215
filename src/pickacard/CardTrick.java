package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Juan Aranda, May 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        boolean inHand = false;
        Card[] magicHand = new Card[7];
        Card magicCard = new Card();
        Scanner sc = new Scanner(System.in);
        
        //Task5
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Clubs");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) ((Math.random() * 13) + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) ((Math.random() * 4))]);
            magicHand[i] = c;

            System.out.println("Card in hand " + magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        System.out.print("Enter card value:");
        magicCard.setValue(sc.nextInt());
        System.out.print("Enter card suit:");
        sc.nextLine();
        magicCard.setSuit(sc.nextLine());

        //System.out.println(magicCard);
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == magicCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(magicCard.getSuit())) {
                inHand = true;
                break;
            }
        }

        //Then report the result here
        if (inHand) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

}
