package com.mohit.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
//		Stream<String> of = Stream.of("abc","abc1","abc3")
//				.filter(e->e.contains("3"));
//		Optional<String> findAny = of.findAny();
//		System.out.println(findAny.get());
//		Optional<String> findFirst = of.findFirst();

		List<String> collect = Stream.of("abc","3abc1","abc3")
				.filter(e->e.contains("3")).collect(Collectors.toList());
		
		Optional<String> findNY= collect.stream().findAny();
		System.out.println(findNY.get());
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}
}
