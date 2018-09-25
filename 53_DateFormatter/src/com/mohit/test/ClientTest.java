package com.mohit.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ClientTest {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		String format = localDateTime.format(DateTimeFormatter.ISO_TIME);
		System.out.println(format);

		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
		System.out.println(format2);
		
		String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.));
		
		System.out.println(format3);
	}

}
