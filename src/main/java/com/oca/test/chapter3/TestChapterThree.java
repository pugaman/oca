package com.oca.test.chapter3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;

public class TestChapterThree {

	/*
	 * Review questions
	 * 1. G +
	 * 2. A, C, D +
	 * 3. B, C, E +
	 * 4. B +
	 * 5. F +
	 * 6. B +
	 * 7. E +-
	 * 8. A, D, E +
	 * 9. C +
	 * 10. F +
	 * 11. E +
	 * 12. A +
	 * 13. F +
	 * 14. A, C +
	 * 15. C, E, F +
	 * 16. C +
	 * 17. B, F +-
	 * 18. A, C, D, E +
	 * 19. C +-
	 * 20. D +
	 * 21. C +
	 * 22. D +
	 * 23. A +
	 * 24. C +
	 * 25. D +
	 * 26. A, B, D +
	 * 27. B +
	 * 28. D, F +
	 * 29. D +
	 * 30. F +
	 * 31. B +
	 * 32. E +
	 * 33. A -
	 *
	 *  = 29/33 = 88%
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
		manipulatingDateTime();
		formattingDateTime();
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

	private static void dateTime() {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}

	private static void localDate() {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);
	}

	private static void localTime() {
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}

	private static void localDateTime() {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
	}

	private static void manipulatingDateTime() {
		System.out.println();
		{
			LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
			System.out.println(date); // 2014-01-20
			date = date.plusDays(2);
			System.out.println(date); // 2014-01-22
			date = date.plusWeeks(1);
			System.out.println(date); // 2014-01-29
			date = date.plusMonths(1);
			System.out.println(date); // 2014-02-28
			date = date.plusYears(5);
			System.out.println(date); // 2019-02-28
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			LocalTime time = LocalTime.of(5, 15);
			LocalDateTime dateTime = LocalDateTime.of(date, time);
			System.out.println(dateTime); // 2020-01-20T05:15
			dateTime = dateTime.minusDays(1);
			System.out.println(dateTime); // 2020-01-19T05:15
			dateTime = dateTime.minusHours(10);
			System.out.println(dateTime); // 2020-01-18T19:15
			dateTime = dateTime.minusSeconds(30);
			System.out.println(dateTime); // 2020-01-18T19:14:30
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			LocalTime time = LocalTime.of(5, 15);
			LocalDateTime dateTime = LocalDateTime.of(date, time)
					.minusDays(1).minusHours(10).minusSeconds(30);
			System.out.println(dateTime);
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			date.plusDays(10);
			System.out.println(date);
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2015, 1, 20);
			LocalTime time = LocalTime.of(6, 15);
			LocalDateTime dateTime = LocalDateTime.of(date, time);
			Period period = Period.ofMonths(1);
			System.out.println(date.plus(period)); // 2015-02-20
			System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
//			System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
		}
	}

	private static void formattingDateTime() {
		System.out.println(); // MONDAY
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			System.out.println(date.getDayOfWeek()); // MONDAY
			System.out.println(date.getMonth()); // JANUARY
			System.out.println(date.getYear()); // 2020
			System.out.println(date.getDayOfYear()); // 20
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			LocalTime time = LocalTime.of(11, 12, 34);
			LocalDateTime dateTime = LocalDateTime.of(date, time);
			System.out.println(date
					.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
			System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

			System.out.println();

			DateTimeFormatter shortDateTime =
					DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
			System.out.println(shortDateTime.format(dateTime)); // 1/20/20
			System.out.println(shortDateTime.format(date)); // 1/20/20
//			System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
		}
		System.out.println();
		{
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			LocalTime time = LocalTime.of(11, 12, 34);
			LocalDateTime dateTime = LocalDateTime.of(date, time);
			DateTimeFormatter shortF = DateTimeFormatter
					.ofLocalizedDateTime(FormatStyle.SHORT);
			DateTimeFormatter mediumF = DateTimeFormatter
					.ofLocalizedDateTime(FormatStyle.MEDIUM);
			System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
			System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
			System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
		}
	}
}
