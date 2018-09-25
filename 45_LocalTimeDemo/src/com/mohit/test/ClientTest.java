package com.mohit.test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.parse("09:34"));
		System.out.println(LocalTime.of(9,34).plus(1, ChronoUnit.HOURS));
		
		System.out.println(LocalTime.parse("10:21").isBefore(LocalTime.parse("11:23")));
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
	}

}
 