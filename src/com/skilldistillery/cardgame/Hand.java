package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;

public abstract class Hand {

	List <Card> cards =  new ArrayList<>();
	
	
	public Hand() {
		//System.out.println("test");
	}


	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}
	
//	public void addCard(card: Card) {
//		
//	}
	public void clear() {
		
	}

	public int getHandValue() {
	return 0;	
	}


	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}


	
	
}
