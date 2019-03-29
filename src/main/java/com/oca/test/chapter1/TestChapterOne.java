package com.oca.test.chapter1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class TestChapterOne {

	private String brand;
	private boolean empty;

	/*
	* Review questions
	* 1. A, B, E +
	* 2. D +
	* 3. B, D, E +
	* 4. A, B +
	* 5. C, D +
	* 6. E +
	* 7. A, B +-
	* 8. B +
	* 9. A, C, D, E +
	* 10. E +
	* 11. C, D +
	* 12. G +
	* 13. A, D +
	* 14. D +
	* 15. A, E +
	* 16. B, C, D +
	* 17. A, E +
	* 18. C, E +-
	* 19. B, D +
	* 20. B, E +
	* 21. A +
	* 22. B, C, E, F +-
	* 23. C, F +-
	*
	*  = 19/23 = 83%
	* */
	public static void main(String[] args) {
		printWelcome();
		printArgs(args);
		printRandom();
		createClasses();
		findAnswer(true);
		printDouble();
	}

	private static void printDouble(){
		double amount = 0xE;
		System.out.println(amount);
	}

	private static void printWelcome() {
		System.out.println("Welcome!");
	}

	private static void printArgs(String... args) {
		if (args.length < 2) {
			return;
		}

		System.out.println(args[0]);
		System.out.println(args[1]);
	}

	private static void printRandom() {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}

	public static void read(Files files) {
		Paths.get("name");
	}

	private static void createClasses() {
		Chick c = new Chick();
		Chicken ch = new Chicken();
	}


	private static void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}

