package com.snakeladder;

public class SnakeLadder {
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;

	// User check for a option
	public static void checkOption() {
		int initial_position = 0;
		int roll_die = (int) ((Math.floor(Math.random() * 10)) % 6) + 1;
		int check_option = (int) ((Math.floor(Math.random() * 10)) % 3);
		switch (check_option) {
		case noPlay:
			initial_position += 0;
			System.out.println(initial_position);
			break;
		case ladder:
			initial_position += roll_die;
			System.out.println(initial_position);
			break;
		case snake:
			initial_position -= roll_die;
			System.out.println(initial_position);
			break;
		}

	}

	public static void main(String[] args) {
		checkOption();
	}

}
