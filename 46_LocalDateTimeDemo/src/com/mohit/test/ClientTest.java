package com.mohit.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime plus = now.plus(1, ChronoUnit.HOURS);
		System.out.println(now);
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
		LocalDateTime parse = LocalDateTime.parse("2018-08-12T14:18:16.000");
		System.out.println(parse.toLocalDate());
		System.out.println(parse.toLocalTime());
		System.out.println(parse.MAX);
	}

}
