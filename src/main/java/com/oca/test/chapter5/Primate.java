package com.oca.test.chapter5;

public class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail2 {
	public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail2 {
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);

		HasTail2 hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}
