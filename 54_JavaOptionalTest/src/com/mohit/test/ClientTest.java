package com.mohit.test;

import java.util.Optional;

public class ClientTest {

	public static void main(String[] args) {
		Integer val1 = null;
		Integer val2 = new Integer(10);
		Optional<Integer> a = Optional.ofNullable(val1);
		Optional<Integer> b = Optional.of(val2);
		System.out.println(sum(a,b));
		
		
	}

	private static int sum(Optional<Integer> a, Optional<Integer> b) {
		// TODO Auto-generated method stub
		System.out.println("Prest 1-"+a.isPresent());
		System.out.println("Prest 2-"+b.isPresent());
		
		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();
		return value1+value2;
	}

}
