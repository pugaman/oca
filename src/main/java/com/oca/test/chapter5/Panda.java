package com.oca.test.chapter5;

class Bear<T extends BearTwo> {

//	public T setAmount(int amount) {
//		this.amount = amount;
////		return self();
//	}

//	protected T self(){
//		return (T) this;
//	}

	private int amount;

	public static void eat() {
		System.out.println("Bear is eating");
	}

	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}

	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

//public class Panda extends BearTwo<Panda> {
//	public static void eat() {
//		System.out.println("Panda bear is chewing");
//	}
//
//	@Override
//	protected Panda self() {
//		return this;
//	}
//
//	//
////	public void sneeze() { // DOES NOT COMPILE
////		System.out.println("Panda bear sneezes quietly");
////	}
////
////	public static void hibernate() { // DOES NOT COMPILE
////		System.out.println("Panda bear is going to sleep");
////	}
//
//	public static void main(String[] args) {
//		Panda.eat();
//		Panda panda = new Panda();
//		Panda panda2 = panda.setAmount(2);
//	}
//}
