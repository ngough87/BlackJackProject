package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackJackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;

public class Player {
	
	protected BlackJackHand hand = new BlackJackHand();
	
	public Player() {}
	
	public int addCardsToHand(Card card) {
		hand.addCard(card);
		return hand.getHandValue();	
		}
	
	public BlackJackHand getHand() {
		return hand;
	}

	public void setHand(BlackJackHand hand) {
		this.hand = hand;
	}

	public void showCards() {
		for (Card card : hand.getCards()) {
			System.out.println(card);
			
		}
	}
	public boolean gameOver(){ {
		if(hand.getValue() == 21) {
			return true;
		}
	}return false;
	}
	
	public boolean isBust() {
		if (hand.getValue() > 21) {
			return true;
		}
		return false;
	}
		public void Hit(Card card) {
		hand.addCard(card);
	}
		public void winningHand() {
			hand.getHandValue();
		}
	
		
		
		
	}
	
	

