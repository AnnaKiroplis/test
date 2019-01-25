package card;

import java.util.Scanner;

public class Card {
    
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Card Type: ");
        String cardType = in.next();
        
        CardDealer card = new CardDealer(cardType);
        
        System.out.println(card.toString());
    }
    
}
