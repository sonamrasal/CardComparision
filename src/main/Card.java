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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suite == other.suite;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suite == null) ? 0 : suite.hashCode());
		return result;
	}

}
