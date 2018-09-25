package com.mohit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> iterate = Stream.iterate(0, i -> i-2);
		iterate.limit(10).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
