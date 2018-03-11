package com.uday.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {
	
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable runnableTask = () -> {
			try {
				TimeUnit.MILLISECONDS.sleep(300);
				System.out.println("printing runnable task");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Callable<String> callableTask = () -> {
			TimeUnit.MILLISECONDS.sleep(300);
			System.out.println("Printing callable task");
			return "Task's execution";
		};
		
		List<Callable<String>> callableTasks = new ArrayList<>();
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);
		
//		executorService.execute(runnableTask);
		
		Future<String> future = executorService.submit(callableTask);
		String result = null;
		try {
			result = future.get();
		} catch(InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}
}
