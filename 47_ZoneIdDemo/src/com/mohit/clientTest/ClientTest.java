package com.mohit.clientTest;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		ZoneId of = ZoneId.of("Asia/Kolkata");
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(availableZoneIds);
		System.out.println(LocalDateTime.now());
		ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.now(), of);
		System.out.println(of2);
		
		LocalDateTime of3 = LocalDateTime.of(2018,Month.DECEMBER, 12, 03, 22, 2);
		System.out.println(of3);
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime of4 = OffsetDateTime.of(of3, offset);
		System.out.println(of4);
		
	}

}
