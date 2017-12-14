package CardComparison;

public class Card implements Comparable<Card> {
	public enum Suit{   
		DIAMOND, HEARTS, SPADES, CLUB;   
		} 
	public enum Rank{   
		TWO, THREE, FOUR, FIVE,SIX,SEVEN,EIGHT;   
		  
		
		} 
	  private final Rank rank;
      private final Suit suit;
      
      public Card(Rank rank,Suit suit)
      {
    	  this.rank = rank;
    	  this.suit = suit;
      }

	@Override
	public int compareTo(Card other) {
		if(this.rank == other.rank)
			return this.suit.compareTo(other.suit);
		return this.rank.compareTo(other.rank);
	} 
}
