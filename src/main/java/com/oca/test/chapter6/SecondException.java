package com.oca.test.chapter6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SecondException {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("src/main/java/com/oca/test/chapter1/Chick.java");
			System.out.println("Reader is created");
//			reader.read();
			throw new IOException("outer");
//			System.out.println("Reader is read");
		} catch (IOException e) {
			System.out.println("Exception is caught");
			e.printStackTrace();

			try {
				if (reader != null) {
//					reader.close();
//					System.out.println("Reader is closed");
					throw new IOException("inner");
				}
			} catch (IOException inner) {
				System.out.println("Close reader exception");
				inner.printStackTrace();
				Arrays.stream(inner.getSuppressed()).forEach(t -> t.printStackTrace());
			}
		}
	}

}
