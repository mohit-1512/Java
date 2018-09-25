package com.mohit.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//Method reference
		executorService.execute(ClientTest::myRun);
	}
	
	private static void myRun() {
		System.out.println("Mytask");
	}

}
