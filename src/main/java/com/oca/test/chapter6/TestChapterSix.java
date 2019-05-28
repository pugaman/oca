package com.oca.test.chapter6;

public class TestChapterSix {

	/*
	 * Review questions
	 * 1. B +
	 * 2. B, D +
	 * 3. C +
	 * 4. B +
	 * 5. A, B, C, D, E +-
	 * 6. C +
	 * 7. C +
	 * 8. E +
	 * 9. B +
	 * 10. E +
	 * 11. A +
	 * 12. A, B, D, G +
	 * 13. A, B, C, E +
	 * 14. A, C, D, E +
	 * 15. A, B, D, E +
	 * 16. B +
	 * 17. A, C, D, E +
	 * 18. B, C, E +-
	 * 19. B, C, E +-
	 * 20. A, E +
	 *
	 *  = 17/20 = 85%
	 * */
	public static void main(String[] args) {
		TestChapterSix testChapterSix = new TestChapterSix();
//		testChapterSix.explore();
		testChapterSix.visitPorcupine();
	}

	void explore() {
		try {
			seeAnimals();
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			getUp();
		} finally {
			seeAnimals();
		}
	}

	void fall() {
		throw new RuntimeException();
	}

	void getUp() {
		System.out.println("Getting up");
	}

	void seeAnimals() {
		System.out.println("Seeing animals");
	}

	public void visitPorcupine() {
		try {
			seeAnimal();
		} catch (AnimalsOutForAWalk e) {// first catch block
			System.out.print("try back later");
		} catch (ExhibitClosed e) {// second catch block
			System.out.print("not today");
		}
	}

	void seeAnimal() {
		throw new ExhibitClosedForLunch();
	}

}

class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }


