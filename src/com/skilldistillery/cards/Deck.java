package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> deck =  new ArrayList<>();
	
	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for (Suit suit : suits) {
		for (Rank rank : ranks) {
			Card aCard = new Card(rank, suit);
			
			
			deck.add(aCard);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public int checkDeckSize() {
		return deck.size(); 
	}
		
	public Card dealCard() {
		return deck.remove(0);
	}
	}

