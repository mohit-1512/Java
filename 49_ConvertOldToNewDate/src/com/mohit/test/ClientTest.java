package com.mohit.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		LocalDateTime ofInstant = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(ofInstant);
		System.out.println(ofInstant.toLocalDate());
		System.out.println(ofInstant.toLocalTime());
		
		Calendar instance = Calendar.getInstance();
		System.out.println(instance);
		
		System.out.println(LocalDateTime.ofInstant(instance.toInstant(), ZoneId.systemDefault()));
		
	}

}
