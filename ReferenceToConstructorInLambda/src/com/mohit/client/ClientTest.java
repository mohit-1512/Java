package com.mohit.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClientTest {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(4, 9 ,16, 100);
		
		num.forEach(System.out::print);
		System.out.println("------");
		//Reference to constructor Integer::new
//		List<Double> findSq = ClientTest.findSq(num, Integer::new);
		List<Double> findSq1 = ClientTest.findSq1(num, Integer::new, Math::sqrt);
//		findSq.forEach(System.out::print);
		findSq1.forEach(System.out::println);

	}

	private static List<Double> findSq1(List<Integer> num, Function<Integer, Integer> f1, Function<Integer, Double> f2) {
		List<Double> findSq1 = new ArrayList<>();
		num.forEach(n -> findSq1.add(f2.apply(f1.apply(n))));
		return findSq1;
	}

	private static List<Double> findSq(List<Integer> num, Function<Integer, Integer> f) {
		List<Double> results = new  ArrayList<>();
		num.forEach(x -> results.add(Math.sqrt(f.apply(x))));
		return results;
		
	}

}
