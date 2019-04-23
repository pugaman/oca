package com.oca.test.chapter5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Canine {
	public double getAverageWeight() {
		return 50;
	}
}

public class Wolf extends Canine {
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
	}

	public static void main(String[] args) {
//		System.out.println(new Canine().getAverageWeight());
//		System.out.println(new Wolf().getAverageWeight());

//		System.out.println("Payed days: " + calculatePayedDays());
		testConvert();
	}

	public static int calculatePayedDays() {
		List<Integer> vacationDays = new ArrayList<>();
		vacationDays.add(29);
		vacationDays.add(30);
		for (int i = 1; i <= 17; i++) {
			vacationDays.add(i);
		}

		List<Integer> holidays = Arrays.asList(1, 9);
		vacationDays.removeAll(holidays);

		return vacationDays.size();
	}

	public static final BigDecimal value = new BigDecimal("0.1190476");

	public static String convert(String amount, int len) {
		BigDecimal from = new BigDecimal(amount);
		String res = value.multiply(from).setScale(0, RoundingMode.HALF_UP).toPlainString();
		if (res.length() > len) {
			throw new IllegalArgumentException("Amount is out of range: " + res);
		} else {
			return padStart(res, len, '0');
		}
	}

	public static String convertBack(String amount, int len) {
		if (BigDecimal.ZERO.equals(value)) {
			throw new IllegalArgumentException("Zero rate");
		}

		BigDecimal from = new BigDecimal(amount);
		return padStart(from.divide(value, 0, RoundingMode.HALF_UP).toPlainString(), len, '0');
	}

	public static void testConvert(){
		String amount = "100000";
		System.out.println("Amount: " + amount);

		String convertedAmount = convert(amount, 12);
		System.out.println("Converted amount: " + convertedAmount);

		String baseAmount = convertBack(convertedAmount, 12);
		System.out.println("Base amount: " + baseAmount);
	}

	public static String padStart(String string, int minLength, char padChar) {
		if (string.length() >= minLength) {
			return string;
		}
		StringBuilder sb = new StringBuilder(minLength);
		for (int i = string.length(); i < minLength; i++) {
			sb.append(padChar);
		}
		sb.append(string);
		return sb.toString();
	}

}
