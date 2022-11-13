package com.skilldistillery.blackjack.app;

import java.util.Scanner;

public class BlackJackApp {

	
	public BlackJackRounds bjr;

	public static void main(String[] args) {
		BlackJackApp bja =  new BlackJackApp();
		bja.play();
		
	}

	
	public void play() {
		bjr = new BlackJackRounds();
		bjr.play();
	
		
	}

}