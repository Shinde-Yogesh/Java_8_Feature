package com.multithread_for_Odd_Even_Num;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class odd_Even_Print {
	private static Object object = new Object();

	private static IntPredicate evenCondition = e -> e % 2 == 0;
	private static IntPredicate oddCondition = e -> e % 2 != 0;
	
	public static void main(String[] args) throws InterruptedException {
		CompletableFuture.runAsync(() -> odd_Even_Print.printResult(oddCondition));
		CompletableFuture.runAsync(() -> odd_Even_Print.printResult(evenCondition));
		Thread.sleep(1000);
	}

	public static void printResult(IntPredicate condition) {
		IntStream.rangeClosed(1, 10).filter(condition).forEach(odd_Even_Print::execute);

	}

	public static void execute(int i) {
		synchronized (object) {
			try {
				System.out.println("Thread Name : " + Thread.currentThread().getName() + " value : " + i);
				object.notify();

				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
