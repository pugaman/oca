package com.oca.test.chapter1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class TestChapterOne {

	public static void main(String[] args) {
		printWelcome();
		printArgs(args);
		printRandom();
		createClasses();
		findAnswer(true);
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
}

