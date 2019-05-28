package com.oca.test.chapter6;

public class ExceptionInThread {

	public static void main(String[] args) {
		Thread child = new Thread(()->{
			throw new RuntimeException("Child thread exception");
		});
		child.setName("Child thread");
		child.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Uncaught");
				System.out.println(t.getName());
				e.printStackTrace();
			}
		});
		child.start();

		try {
			System.out.println("Main thread end going to sleep");
			Thread.sleep(2000);
			System.out.println("Main thread woke up");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread end");
	}

}
