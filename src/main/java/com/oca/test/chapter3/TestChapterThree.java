package com.oca.test.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
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
		dateTime();
		localDate();
		localTime();
		localDateTime();

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
		for (String b : array) System.out.println(b + " "); // new test
//		list.remove(1);
	}

	private static void dateTime(){
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}

	private static void localDate(){
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);
	}

	private static void localTime(){
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}

	private static void localDateTime(){
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
	}
}
