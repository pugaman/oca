package com.oca.test.chapter5;

public class Lion extends Animal {
	public Lion(int age) {
		super(age);
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
}
