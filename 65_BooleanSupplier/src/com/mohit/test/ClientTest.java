package com.mohit.test;

import java.util.function.BooleanSupplier;

public class ClientTest {
	public static void main(String[] args) {
		int x = 10;
		int y = 21;
		BooleanSupplier bs = () ->{return x>y;};

		
		System.out.println(bs.getAsBoolean());	
	}
	
	
}
	