package tests;

import static org.junit.Assert.*;
import main.Card;
import main.Rank;
import main.Suite;

import org.junit.Test;

public class CardTest {

	@Test
	public void aCardIsEqualToItself() {
		Card aceOfHearts = new Card(Rank.ACE, Suite.HEART);
		assertEquals(0, aceOfHearts.compareTo(aceOfHearts));
	}

	@Test
	public void fiveOfDiamondsIsGreaterThanTwoOfDiamonds() {
		Card fiveOfDiamonds = new Card(Rank.FIVE, Suite.DIAMOND);
		Card twoOfDiamonds = new Card(Rank.TWO, Suite.DIAMOND);
		assertTrue(fiveOfDiamonds.compareTo(twoOfDiamonds) > 0);
	}

	@Test
	public void fiveOfSpadesIsLessThanFiveOfClubs() {
		Card fiveOfSpades = new Card(Rank.FIVE, Suite.SPADE);
		Card fiveOfClubs = new Card(Rank.FIVE, Suite.CLUB);
		assertFalse(fiveOfSpades.compareTo(fiveOfClubs) < 0);
	}

	@Test
	public void twoCardsWithSameRankAndOrderAreEqual() {
		Card kingOfClubs = new Card(Rank.KING, Suite.CLUB);
		Card anotherKingOfClubs = new Card(Rank.KING, Suite.CLUB);
		assertEquals(0, kingOfClubs.compareTo(anotherKingOfClubs));
		assertEquals(kingOfClubs, anotherKingOfClubs);
	}

	@Test
	public void everyCardMustHaveARank() {
		try {
			Card cardWithNoRank = new Card(null, Suite.CLUB);
			fail("Exception expected since no rank is provided");
		} catch (NullPointerException npe) {
		}
	}
	
	@Test
	public void everyCardMustHaveASuite() {
		try {
			Card cardWithNoSuite = new Card(Rank.EIGHT, null);
			fail("Exception expected since no suite is provided");
		} catch (NullPointerException npe) {
		}
	}
}
