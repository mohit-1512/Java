package com.mohit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> operator = i -> i*i;
		
		List<Integer> integers = Arrays.asList(1,
				3,
				5);
		System.out.println(unaryMeth(operator, integers));
		integers.stream()
		.map(operator)
		.forEach(System.out::println);
	}

	private static List<Integer> unaryMeth(UnaryOperator<Integer> operator, List<Integer> integers) {
		// TODO Auto-generated method stub
		List<Integer> integers2 = new ArrayList<Integer>();
		integers.forEach(i->integers2.add(operator.apply(i)));
		return integers2;
		
	} 

}
