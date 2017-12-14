package test;

import org.junit.Test;

import CardComparison.Card;
import CardComparison.Card.Rank;
import CardComparison.Card.Suit;

public class CardTest {
	@Test
	public void shouldReturnZeroForSame()
	{
		Card card = new Card(Rank.TWO,Suit.CLUB);
		
	}

}
