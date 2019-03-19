package com.oca.test.chapter2;

public class TestChapterTwo {

	/*
	* Review questions
	* 1. A, D +
	* 2. A, B, D +
	* 3. F +
	* 4. B, D, F +-
	* 5. A -
	* 6. F +
	* 7. D +
	* 8. B +
	* 9. F +
	* 10. D +
	* 11. A +
	* 12. D +
	* 13. A +
	* 14. C +
	* 15. E +
	* 16. D +
	* 17. D +
	* 18. A +
	* 19. D +
	* 20. B +
	* */

	public static void main(String[] args) {

		binaryPrecedence();
		promotion();
		unary();
		casting();
		branching();
		switchBranching();
	}

	private static void binaryPrecedence(){
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println(x == 14);

		x = 2 * ((5 + 3) * 4 - 8);
		System.out.println(x == 48);
	}

	private static void promotion(){
		{
			int x = 1;
			long y = 33;
			long z = x * y;
		}
		{
			double x = 39.21;
			float y = 2.1F;
			double z = x * y;
		}
		{
			short x = 10;
			short y = 3;
			int z = x / y;
		}
		{
			short x = 14;
			float y = 13;
			double z = 30;
			double k = x * y / z;
		}
	}

	private static void unary(){
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

	private static void casting(){
		{
			int x = (int) 1.0;
			short y = (short) 1921222; // Stored as 20678

			int z = (int) 9L;
			long t = 192301398193810323L;
		}
		{
			long x = 10;
			int y = 5;
			y *= x;
		}
	}

	private static void branching(){
		int hourOfDay = 10;

		if(hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Afternoon");
		}

		if(hourOfDay < 11)

			System.out.println("if with new lines");

		boolean isGood = false;
		if(isGood = true) {
			System.out.println("if with assignment");
		}
	}

	private static void switchBranching(){
		final int six = 6;

		int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case six:
				System.out.println("Saturday");
				break;
		}
	}
}
