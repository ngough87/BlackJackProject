package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {// used to generate cards

	//a Deck ---consists of a bunch of cards
	//has-a /composed of/ composition
	//dealing with a deck of cards// fixed number of cards
	//a deck is some kind of a colleciton cards
	// regular arrays are fixed in size
	//A list should be used
	//referrence sorting arrays and collections .... there is an example of shuffling in there
	
	private List<Card> deck =  new ArrayList<>();// backing store
	
	public Deck() {
		Rank[] ranks = Rank.values();// the enumerated types has the values in it
		Suit[] suits = Suit.values();
		//generate a fresh deck of all 52 cards
		for (Suit suit : suits) {
			//for each suit all 4 of them
		for (Rank rank : ranks) {
			//for each rank all 13 of them
			Card aCard = new Card(rank, suit);
			
			
			//where do the cards go? to the deck ... the list that we created on line 17
			deck.add(aCard);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);// shuffling the deck arraylist that was created
	}
	
	public int checkDeckSize() {
		return deck.size(); // arraylists can return the size of decks
	}
		
	public Card dealCard() {
		// the dealer removes top card
		return deck.remove(0);
	}
	}

