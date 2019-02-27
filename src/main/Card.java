package main;

public class Card implements Comparable<Card> {

	private final Rank rank;
	private final Suite suite;

	public Card(Rank rank, Suite suite) {
		if(null == rank || null == suite) {
			throw new NullPointerException();
		}
		this.rank = rank;
		this.suite = suite;
	}

	@Override
	public int compareTo(Card card) {
		int rankCompare = this.rank.compareTo(card.rank);
		return rankCompare == 0 ? this.suite.compareTo(card.suite) : rankCompare;
	}

}
