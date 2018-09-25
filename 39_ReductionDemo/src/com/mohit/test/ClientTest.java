package com.mohit.test;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalInt reduce = IntStream.range(1, 5).reduce((a,b)-> a+b);
		System.out.println(reduce.getAsInt());
		
		int reduce1 = IntStream.range(1, 5).reduce(10,(a,b)-> a+b);
		System.out.println(reduce1);
		

		Integer reduce2 = Arrays.asList(1,2,3).parallelStream().reduce(10, Integer::sum,
				(a,b) ->{
					int x = a-b;
					System.out.println("saf"+x);
					return x;
				});
		//11, 12, 13
		System.out.println(reduce2);
	}

}
