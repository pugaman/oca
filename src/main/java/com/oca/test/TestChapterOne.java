package com.oca.test;

public class TestChapterOne {

	public static void main(String[] args) {
		printWelcome();
		printArgs(args);
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

}

