package unogame;

public class Card {
    	    
        public enum Suit {RED, YELLOW, BLUE, GREEN};
        public enum Value{ZERO, ONE, TWO, THREE, FROU, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW};
        private final Suit suit;
        private final Value value;
        private String Joker;
        
        public Card(Suit suit, Value value)
        {
           this.suit = suit;
           this.value = value;
        }
        
	public Value getValue() {
		return this.value;
	}

        
	public Suit getSuit() {
		return this.suit;
        }
        
}
