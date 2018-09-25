package com.mohit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		createThreadUsingAnnonymousClass();
//		createThreadUsingLambda();
		
		List<String> nameList = new ArrayList<>();
		nameList.add("mohit");
		nameList.add("Cohit");
		nameList.add("Rohit");
		
		
		//Instance by Lambda
		nameList.forEach((name) -> System.out.println(name));
		
		//Instance by Method reference
		nameList.forEach(System.out::print);
	}

	private static void createThreadUsingLambda() {
		// TODO Auto-generated method stub
		Runnable r =() -> System.out.println("My Task");
		Thread th = new Thread(r);
		th.start();
	}

	private static void createThreadUsingAnnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("My Task");
			}
		};
		Thread th = new Thread(r);
		th.start();
	}

}
