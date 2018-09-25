package com.mohit.test;

import java.util.function.Supplier;

public class ClientTest {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> {
			return (int)(Math.random()*100);
		};
		
		for(int i =0; i <= 12; i++) {
			System.out.println(supplier.get());
		}
	}

}
