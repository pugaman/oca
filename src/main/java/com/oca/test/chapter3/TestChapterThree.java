package com.oca.test.chapter3;

import java.util.Arrays;
import java.util.List;

public class TestChapterThree {

	/*
	 * Review questions

	 * */

	public static void main(String[] args) {

		stringChaining();
		arrayTypes();
		arrayStoreException();
		arrayToList();

	}

	private static void stringChaining() {
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
	}

	private static void arrayTypes() {
		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString());
	}

	private static void arrayStoreException() {
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
//		againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//		objects[0] = new StringBuilder(); // careful!
	}

	private static void arrayToList() {
		String[] array = {"hawk", "robin"}; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) System.out.print(b + " "); // new test
//		list.remove(1);
	}
}
