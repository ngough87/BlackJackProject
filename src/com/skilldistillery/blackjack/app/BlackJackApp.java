package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgame.BlackJackHand;
import com.skilldistillery.cardgame.Hand;

public class BlackJackApp {

	
	public static void main(String[] args) {
		BlackJackApp dealer = new BlackJackApp();
		Scanner sc = new Scanner(System.in);
		dealer.play(sc);
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
		if(answer.equalsIgnoreCase("Yes")) {
			
		} else {
			exitGame();
		}
	
	}
	
	private void exitGame() {
		System.out.println("Thanks for coming, goodbye now! ");
		
	}


	
		//I want to display the cards that have been dealt
		// ask player if they want to hit or stay
	// ask dealer if they want to hit or stay
	public void displayCardsDealt() {
		
	}
	
	
}
