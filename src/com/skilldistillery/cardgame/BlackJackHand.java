package com.skilldistillery.cardgame;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
		super();
	}

	public int getHandValue() {
		return 0;
	}

	public boolean isBlackjack() {
		return false;
	

	}
	
	public boolean isBust() {
		return false;
	}
}
