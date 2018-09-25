package com.mohit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[] {"32",
				"32",
				"rfsd"};
		
		Stream<String> stream = Arrays.stream(arr);
		
		stream.forEach(System.out::println);
		
		Stream<String> stream1 = Stream.of("32",
				"32",
				"rfsd");
		
		stream1.forEach(System.out::println);
		
		List<String> names = Arrays.asList("32",
				"32",
				"rfsd");
		Stream<String> stream3 = names.stream();
		System.out.println("------------------");
		stream3.forEach(System.out::println);
		System.out.println("------------------");
		names.parallelStream().forEach(System.out::println);
		
	}	

}
