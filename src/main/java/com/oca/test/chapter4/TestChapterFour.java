package com.oca.test.chapter4;

import java.util.BitSet;

public class TestChapterFour {

	/*
	 * Review questions
	 * 1.
	 * */

	public static void main(String[] args) {
		walk(1); // 0
		walk(1, 2); // 1
		walk(1, 2, 3); // 2
		walk(1, new int[]{4, 5}); // 2
//		walk(1, null);

		printFly();
	}

	public void walk1(int... nums) {
	}

	public void walk2(int start, int... nums) {
	}
//	public void walk3(int... nums, int start) { } // DOES NOT COMPILE
//	public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

	public static void walk(int start) {
		System.out.println(start);
	}

	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

//	public void fly(int numMiles) { }
	public void fly(short numFeet) {	}
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	public static void fly(short numFeet, int numMiles, int numInches) throws Exception { }

	public static void printFly(){
		TestChapterFour chapterFour = new TestChapterFour();
		chapterFour.fly("test");
		chapterFour.fly(56);
	}

	public void fly(String s) {
		System.out.print("string ");
	}
	public void fly(Object o) {
		System.out.print("object ");
	}

}
