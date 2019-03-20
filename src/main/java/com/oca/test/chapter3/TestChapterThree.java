package com.oca.test.chapter3;

public class TestChapterThree {

	/*
	* Review questions

	* */

	public static void main(String[] args) {

		stringChaining();
		arrayTypes();
		arrayStoreException();

	}

	private static void stringChaining(){
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
	}

	private static void arrayTypes(){
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString());
	}

	private static void arrayStoreException() {
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
//		againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		objects[0] = new StringBuilder(); // careful!
	}
}
