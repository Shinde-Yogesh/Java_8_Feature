package com.practice;

public class Odd_Even_Using_Multithreading implements Runnable {

	static int count = 1;
	Object object;

	public Odd_Even_Using_Multithreading(Object object) {
		this.object = object;
	}

	@Override
	public void run() {
		while (count <= 10) {
			if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread Name : " + Thread.currentThread().getName() + " value : " + count);
					count++;

					try {
						object.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}

			// for the odd
			if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println("Thread Name : " + Thread.currentThread().getName() + " value : " + count);
					count++;

					object.notify();
				}
			}
		}

	}

	public static void main(String[] args) {
		Object lock = new Object();
		Runnable r1 = new Odd_Even_Using_Multithreading(lock);
		Runnable r2 = new Odd_Even_Using_Multithreading(lock);

		new Thread(r1, "even").start();
		new Thread(r2, "odd").start();
	}

}
