package com.oca.test.chapter4.pond.swan;

import com.oca.test.chapter4.pond.bird.Bird;

public class Swan extends Bird {
	public void swim() {
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
	}

	public void helpOtherBirdSwim() {
		Bird other = new Bird();
//		other.floatInWater(); // DOES NOT COMPILE
//		System.out.println(other.text); // DOES NOT COMPILE
	}
}
