package com.snakeladder;

public class SnakeLadder {
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int win = 100;

	// Two player game
	public static void checkOption() {

		int initial_position_player1 = 0;
		int initial_position_player2 = 0;

		while ((initial_position_player1 < win) || (initial_position_player2 < win)) {
			int roll_die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
			int check_option = (int) ((Math.floor(Math.random() * 10)) % 3);
			switch (check_option) {
			case noPlay:
				initial_position_player1 += 0;
				System.out.println("Position of Player 1- " + initial_position_player1);
				break;
			case ladder:
				initial_position_player1 += roll_die;
				if (initial_position_player1 > 100) {
					initial_position_player1 -= roll_die;
					System.out.println("Position of Player 1- " + initial_position_player1);
				} else {
					System.out.println("Position of Player 1- " + initial_position_player1);
					if (initial_position_player1 == 100) {
						System.out.println("Player one wins");
						System.exit(1);
					}
				}
				break;
			case snake:
				initial_position_player1 -= roll_die;
				if (initial_position_player1 < 0) {
					initial_position_player1 = 0;
					System.out.println("Position of Player 1- " + initial_position_player1);
				} else {
					System.out.println("Position of Player 1- " + initial_position_player1);
				}
				break;
			}

			roll_die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
			check_option = (int) ((Math.floor(Math.random() * 10)) % 3);
			switch (check_option) {
			case noPlay:
				initial_position_player2 += 0;
				System.out.println("Position of Player 2- " + initial_position_player2);
				break;
			case ladder:
				initial_position_player2 += roll_die;
				if (initial_position_player2 > 100) {
					initial_position_player2 -= roll_die;
					System.out.println("Position of Player 2- " + initial_position_player2);
				} else {
					System.out.println("Position of Player 2- " + initial_position_player2);
					if (initial_position_player2 == 100) {
						System.out.println("Player two wins");
						System.exit(1);
					}
				}
				break;
			case snake:
				initial_position_player2 -= roll_die;
				if (initial_position_player2 < 0) {
					initial_position_player2 = 0;
					System.out.println("Position of Player 2- " + initial_position_player2);
				} else {
					System.out.println("Position of Player 2- " + initial_position_player2);
				}
				break;
			}
		}

	}

	public static void main(String[] args) {
		checkOption();
	}
}