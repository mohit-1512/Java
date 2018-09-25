package com.mohit.test;

import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("1abc","5abc","4abc","3abc");
		of.forEach(System.out::println);
		System.out.println("--------------------");
		
		System.out.println(Stream.of("1abc","5abc","4abc","3abc").skip(1).sorted((a,b)->a.compareToIgnoreCase(b)).count());
	}

}
