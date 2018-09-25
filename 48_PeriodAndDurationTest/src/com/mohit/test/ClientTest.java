package com.mohit.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ClientTest {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plus(Period.ofDays(5));
		
		System.out.println(Period.between(date1, date2).getDays());
		System.out.println(ChronoUnit.DAYS.between(date1, date2));
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime plusMinutes = localTime1.plusMinutes(5);
		System.out.println(Duration.between(localTime1, plusMinutes).getSeconds());
		System.out.println(ChronoUnit.MINUTES.between(localTime1, plusMinutes));
	}

}
