package com.skilldistillery.players;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {

	private Deck deck =  new Deck();

	public Card dealCard() {
		
		
		return deck.dealCard();
	}

	public Card shuffleDeck() {
		Card card = null;
		
		return card;
	}
	
	
	
	public Card wash() {
		Card card = null;
		return card;
		
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	


	
}


