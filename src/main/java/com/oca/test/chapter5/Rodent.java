package com.oca.test.chapter5;

public class Rodent {
	protected Number chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}
class Beaver extends Rodent {
	public Integer chew() throws RuntimeException {
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}