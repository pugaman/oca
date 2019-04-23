package com.oca.test.chapter5;

interface Herbivore {
	public int eatPlants();

	public default double getTemperature() {
		return 10.0;
	}
}
interface Omnivore {
	public void eatPlants();
}

public class BearTwo implements Herbivore{
	public int eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}
//	public void eatPlants() { // DOES NOT COMPILE
//		System.out.println("Eating plants");
//	}
}
