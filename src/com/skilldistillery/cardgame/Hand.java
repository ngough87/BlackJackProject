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
	
	public void addCard(Card card) {
		cards.add(card);
	}
	public void clear() {
		cards= new ArrayList<>();
	}

	public int getValue() {
	int value = 0;
	
	for (Card card : cards) {
		value += card.getValue();
		
	} return value;
	}


	@Override
	public String toString() {
		return "Cards " + cards + " ";
	}


	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


	


	
	
}
