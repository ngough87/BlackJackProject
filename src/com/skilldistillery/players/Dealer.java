package com.skilldistillery.players;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {

	private Deck deck =  new Deck();
	
	public Dealer() {
		
	}
	public Card dealCard() {
		return deck.dealCard();
	}

	public Card shuffleDeck() {
		Card card = null;
		
		return card;
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public void showCards() {
		for (Card card : this.getHand().getCards()) {
			System.out.println(card);
			
		}
	}

	public void showOneCard() {
		System.out.println(getHand().getCards().get(1));
	}
	
	public boolean isBust() {
		if (hand.getValue() > 21) {
			return true;
		}
		return false;
	}
	public boolean hit() {
		if (hand.getValue() <= 16) {
			return true;
		}
		return false;
	}

public void winningHand() {
	hand.getHandValue();
}

}


