package com.oca.test.chapter1;

public class Name {
	String first = "Theodore";
	String last = "Moose";
	String full = first + last;

	public static void main(String[] args) {
		Name name = new Name();
		System.out.println(name.full);
	}

}
