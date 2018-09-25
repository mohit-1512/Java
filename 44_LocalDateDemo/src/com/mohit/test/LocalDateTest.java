package com.mohit.test;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {

	public static void main(String[] args) {
//		getLocalDateDemo();
		DayOfWeek dayOfWeek = LocalDate.parse("2018-01-01").getDayOfWeek();
		System.out.println(dayOfWeek.toString());
		
		System.out.println(LocalDate.parse("2018-01-01").getDayOfMonth());
		
		System.out.println(LocalDate.now().isLeapYear());
		
		System.out.println(LocalDate.now().minusYears(1).isLeapYear());
		System.out.println(LocalDate.now().minusYears(1).getYear());
		System.out.println(LocalDate.parse("2017-02-01").isBefore(LocalDate.now()));
		
		System.out.println(LocalDate.parse("2017-02-01").isAfter(LocalDate.now()));
		
		LocalDateTime atStartOfDay = LocalDate.parse("2017-02-01").atStartOfDay();
		
		System.out.println(atStartOfDay);
		
		System.out.println(LocalDate.parse("2017-02-10").with(TemporalAdjusters.firstDayOfMonth()));

		
		
		
		
	}

	private static void getLocalDateDemo() {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		
		ZoneId id= ZoneId.of("America/Chicago");
		LocalDate localDate3 = LocalDate.now(id);
		System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.of(2017, 1, 12);
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2018-04-22");
		System.out.println(localDate5);
		
		LocalDate plusDays = localDate5.plusDays(2);
		System.out.println(plusDays);
		
		LocalDate minus = plusDays.minus(2, ChronoUnit.DAYS);
		System.out.println(minus);
	}
	

}
