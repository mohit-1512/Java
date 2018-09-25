package com.mohit.test;

import com.mohit.model.Mythread;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		createThreadWithClass();
		Runnable r =()->System.out.println("test thread");
		Thread th = new Thread(r);
		th.start();
	}

	private static void createThreadWithClass() {
		Mythread mythread = new Mythread();
		Thread th = new Thread(mythread);
		th.start();
	}

}
