package com.mohit;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ClientTest {
	public static void main(String[] args) {
		Builder<String> add = Stream.<String>builder().add("3s").add("3s").add("3s").add("3s");
		Stream<String> build = add.build();
		build.forEach(System.out::println);
		
		Stream<String> limit = Stream.generate(()->new String("s")).limit(10);
		limit.forEach(System.out::print);
		System.out.println("=========================");
		
		IntStream.range(1,5).forEach(System.out::println);
		IntStream.rangeClosed(1,5).forEach(System.out::println);
		
		Random r = new Random();
		DoubleStream doubles = r.doubles(4);
		doubles.forEach(System.out::println);
		
		IntStream chars = "abc".chars();
		chars.forEach(System.out::println);
		//can be use with patterns
		Stream<String> splitAsStream = Pattern.compile(",").splitAsStream("a,sa,saa,as");
	}
}
