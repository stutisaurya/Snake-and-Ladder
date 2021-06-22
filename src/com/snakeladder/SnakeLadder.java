package com.snakeladder;

public class SnakeLadder {
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int win = 100;

	// User check for a option
	public static void checkOption() {

		int count = 0;
		int initial_position = 0;
		while (initial_position < win) {
			int roll_die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
			int check_option = (int) ((Math.floor(Math.random() * 10)) % 3);
			switch (check_option) {
			case noPlay:
				initial_position += 0;
				System.out.println(initial_position);
				break;
			case ladder:
				initial_position += roll_die;
				if (initial_position > 100) {
					initial_position -= roll_die;
					System.out.println(initial_position);
				} else {
					System.out.println(initial_position);
				}
				break;
			case snake:
				initial_position -= roll_die;
				if (initial_position < 0) {
					initial_position = 0;
					System.out.println(initial_position);
				} else {
					System.out.println(initial_position);
				}
				break;
			}
			count++;
		}

		System.out.println("Number of times dice was played to win the game is " + count);
	}

	public static void main(String[] args) {
		checkOption();
	}
}