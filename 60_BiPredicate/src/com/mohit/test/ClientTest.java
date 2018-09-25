package com.mohit.test;

import java.util.function.BiPredicate;

public class ClientTest {
	public static void main(String[] args) {
		BiPredicate< Integer, String> biPredicate=
				(i, str) -> i>20 && str.startsWith("Mo");
				
		System.out.println(biPredicate.test(40, "hit"));
	}
}
