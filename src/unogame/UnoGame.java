package unogame;

public class UnoGame {

    public static void main(String[] args) {
        
        CardHand ch = new CardHand();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
        
    }
    
}
