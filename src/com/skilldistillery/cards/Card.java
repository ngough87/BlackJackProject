package com.skilldistillery.cards;

import java.util.Objects;


//IMPORTANT  this class should be the definition of a card

public class Card {
//has-a relationship (aka association)
	private Rank rank;
	private Suit suit;
	
	public Card() {} // no arg costructor, this will force to generate getters and setters
	
	public Card(Rank rank,Suit suit) { // parameter that is sent in
		this.rank = rank;// assign to the field in the class, the parameter set in in the constructor line 12
		this.suit = suit;
	}
	
	//getValue
	public int getValue() { // value of card is retrieved from this cards rank
		return this.rank.getValue();
	}
	
	
	// hascode and equals is needed for comparison and for sorting. 
	//For any class you create, you generally want to have a corresponding hash and equals

	@Override
	public int hashCode() { 
		return Objects.hash(rank, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	


	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	//toString is convenient for debugging code 
	//you will not always have a toString in the production environment.
	//easy way to display one of the cards
	@Override
	public String toString() {
		return  rank + " of " + suit ;
	}
	
	
	
	
}
