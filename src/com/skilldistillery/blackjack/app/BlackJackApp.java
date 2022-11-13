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
		//showOptions();
	
		
	}


	
	
	
	
	
	
	
	
	
//	private void showOptions() {
//		System.out.println("***** WeLCoME To BlACkJaCk!! *****");
//		System.out.println();
//		System.out.println("1. Would you like to play a game?");
//		System.out.println();
//		System.out.println("2. Or EXIT and play later?");
//		System.out.println();
//		System.out.println("Please enter the number 1 for option 1,");
//		System.out.println("OR enter the number 2 for option 2. ");
//		int playNotPlay = sc.nextInt();
//		
//		switch(playNotPlay) {
//		
//		default:
//			System.out.println("That is not an option. Try again.");
//			showOptions();
//			break;
//		case 1: 
//			bjr.play();
//			break;
//		case 2:
//			bjr.exitGame();
//			break;
//		
//		}
//	sc.close();
	}
//}

