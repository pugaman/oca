package com.oca.test.chapter4.pond.goose;

import com.oca.test.chapter4.pond.bird.Bird;

public class Gosling extends Bird {
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
}
