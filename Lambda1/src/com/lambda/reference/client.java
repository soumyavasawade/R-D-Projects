package com.lambda.reference;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		Runnable command=client::myRun;
		executorService.execute(command);
		
	}
	private static void myRun() {
		System.out.println("My task is running");
	}
}
