package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackJackRounds {
	Dealer dealer = new Dealer();
	Player player = new Player();
	
	List<Card> cards = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void play() {
		System.out.println("***** WeLCoME To BlACkJaCk!! *****");
		System.out.println();
		System.out.println("Lets play a game! ");
		System.out.println();
		dealInitialCard();
	}

	public void exitGame() {
		System.out.println("Game over! Ya snooze, ya lose!!!! ");

	}

	public void dealInitialCard() {
		dealer.getDeck().shuffle();
		player.addCardsToHand(dealer.dealCard());
		player.addCardsToHand(dealer.dealCard());
		dealer.addCardsToHand(dealer.dealCard());
		dealer.addCardsToHand(dealer.dealCard());

		System.out.println("PLAYER CARDS: ");
		System.out.println();
		player.showCards();
		System.out.println();
		System.out.println("DEALER CARDS: ");
		System.out.println();
		dealer.showOneCard();
		System.out.println("Face down card");
		System.out.println();
		System.out.println("Do you want HIT or STAND ?");
		System.out.println("Enter the number (1) for HIT or the number (2) for STAND");

		if (player.isBust() || dealer.isBust()) {
			System.out.println("You busted on the first round! Better luck next time! ");
			showWinner();
		}
		int i = sc.nextInt();
		if (i == 1) {
			player.addCardsToHand(dealer.dealCard());
			dealerTurn();
		} else {
			dealerTurn();
		}
	}

	public void anotherRound() {
		System.out.println();
		System.out.println("Your cards are: ");
		if (!player.isBust()) {
			player.showCards();
			showWinner();
		}
		if (player.isBust()) {
			player.showCards();
			System.out.println();
			System.out.println("You lost!");
			System.out.println();
			System.out.println("Dealer hand: ");
			System.out.println();
			dealer.showCards();
			showWinner();
		}
	}

	public void playerTurn() {
		if (player.isBust()) {
			System.out.println();
			System.out.println("Player Busted!");
			System.out.println();
			player.showCards();
			showWinner();
			if (!player.isBust()) {
				dealerTurn();
			}
		}
	}

	public void dealerTurn() {
		if (dealer.hit()) {
			dealer.addCardsToHand(dealer.dealCard());
			System.out.println("Dealer hits: ");
			System.out.println();
			dealer.showCards();
			playerTurn();

		}
		if (dealer.isBust()) {
			System.out.println("Dealer lost! Player wins!");
			showWinner();
		}
	}

	public void showWinner() {

		if (!player.isBust() && dealer.isBust()) {
			System.out.println();
			System.out.println("Player winning cards! ");
			System.out.println();
			player.showCards();
		}
		if (!dealer.isBust() && player.isBust()) {
			System.out.println();
			System.out.println("Dealer winning cards! ");
			System.out.println();
			dealer.showCards();
		}
	}
}
