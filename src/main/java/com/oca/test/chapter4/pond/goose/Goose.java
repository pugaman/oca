package com.oca.test.chapter4.pond.goose;

import com.oca.test.chapter4.pond.bird.Bird;

public class Goose extends Bird {

	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}

	public void helpOtherGooseSwim() {
		Bird other = new Goose();
//		other.floatInWater(); // DOES NOT COMPILE
//		System.out.println(other.text); // DOES NOT COMPILE
	}
}
