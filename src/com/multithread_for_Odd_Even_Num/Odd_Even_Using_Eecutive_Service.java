package com.multithread_for_Odd_Even_Num;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Odd_Even_Using_Eecutive_Service {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		IntStream.rangeClosed(1, 10)
		.forEach(num ->
		{
			CompletableFuture<Integer> oddcompletedFuture = CompletableFuture.completedFuture(num)
				.thenApplyAsync(x ->
				{
					if(x%2 != 0)
					{
						System.out.println("Thread Name : "+Thread.currentThread().getName()+" value : "+x);
					}
					return num;
				}, executorService);
		oddcompletedFuture.join();
		
		CompletableFuture<Integer> evencompletedFuture = CompletableFuture.completedFuture(num)
				.thenApplyAsync(x ->
				{
					if(x%2 == 0)
					{
						System.out.println("Thread Name : "+Thread.currentThread().getName()+" value : "+x);
					}
					return num;
				}, executorService);
		evencompletedFuture.join();
		});
		
		executorService.shutdown();
	}
}
