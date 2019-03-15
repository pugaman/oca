package com.oca.test.chapter1;

public class Swan {
	{ System.out.println("Snowy"); }

	int numberEggs;// instance variable

	public static void main(String[] args) {
		Swan mother = new Swan();
		mother.numberEggs = 1; // set variable
		System.out.println(mother.numberEggs); // read variable
	}
}
