package com.skilldistillery.players;

import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;

public class Player {
	
	protected Hand hand;
	
	
	
	
	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public int Hit(Card card) {
		hand.addCard(card);
		return hand.getHandValue();	
		}
	
	public void Stand() {
		for (Card card : hand.getCards()) {
			System.out.println(card);
			
		}
	}
	
}
