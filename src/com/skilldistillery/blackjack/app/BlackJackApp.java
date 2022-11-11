package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackJackApp {
		Dealer dealer = new Dealer();
		Player player = new Player();
		
	public static void main(String[] args) {
		BlackJackApp gameNPC = new BlackJackApp();
		Scanner sc = new Scanner(System.in);
		gameNPC.play(sc);
		sc.close();
	}

	//I want to prompt the player, if they would like to play
	//if yes, deal cards, if no exit
	public void play(Scanner sc)	{
	System.out.println("Welcome to Blackack! "
			+ "Do you want to start a game? ");
	System.out.println("Enter Yes or No");
	sc.nextLine();
	String answer = sc.nextLine();	
		for(answer.equals("Yes")) {
			displayCardsDealt();
			
		} if (answer.equals("No")) { //((answer.equalsIgnoreCase("No")))
			System.out.println("Thanks for playing, goodbye now! ");
			break;
		}
		
			
	}
	
	public void exitGame() {
		System.out.println("Thanks for coming, goodbye now! ");
		
	}
	
	//deal another card
	public void anotherRound() {
		
	}
	
		//I want to display the cards that have been dealt
		// ask player if they want to hit or stay
	// ask dealer if they want to hit or stay
	public void displayCardsDealt() {
		
		
	}
	
	
	public void playerturn() {
		
		while (player.getHand().getHandValue() <= 21 || (dealer.getHand().getHandValue() <= 21)) { 
			checkCards();
		} if (player.getHand().getHandValue() >= 21 || (dealer.getHand().getHandValue() >= 21)) {
			showWinner();
		}
	}
	
	public void dealerTurn() {
		
	}
	
	public void checkCards() {
		
		
	}
	
	public void showWinner() {
		
		
	}
	
}
