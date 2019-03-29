package com.oca.test.chapter4;

public class TestChapterFour {

	/*
	 * Review questions
	 * 1. B, C +
	 * 2. A, D +
	 * 3. A, C, D +
	 * 4. A, B, E, G +-
	 * 5. D, F, G +-
	 * 6. D +
	 * 7. B, C, D, F +
	 * 8. B, C, E +
	 * 9. E +-
	 * 10. B +
	 * 11. B, E +
	 * 12. C -
	 * 13. D -
	 * 14. B +
	 * 15. E +
	 * 16. B +
	 * 17. B, D, E +
	 * 18. C, G +
	 * 19. A, G +
	 * 20. E +
	 * 21. C +
	 * 22. E +
	 * 23. A +
	 * 24. B, C, E +
	 * 25. A, E +
	 * 26. A +
	 * 27. C +
	 * 28. A, D, F +
	 * 29. A, F +
	 *
	 *  = 24/29 = 83%
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
