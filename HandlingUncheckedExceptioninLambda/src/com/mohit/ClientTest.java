package com.mohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(0,12,
				4,
				4,
				10,
				0);
		List<Double> d = new ArrayList<Double>();
		lst.forEach(consumerWrapper( n-> {
				System.out.println(50/n);
				d.add((double) (50/n));
			
		},ArithmeticException.class));
		System.out.println("--------------");
		

//		d.forEach(System.out::println);
		
		
	}
	
//	private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
//		return i -> {
//			try {
//				consumer.accept(i);
//			} catch (ArithmeticException e) {
//				System.out.println("ArithmeticException: "+e.getMessage());
//			}
//		};
//		
//	}
	


	private static <T,E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer,
			Class<E> clazz){
				return i -> {
					try {
						consumer.accept(i);
					} catch (Exception e) {
						E exceptionCast = clazz.cast(e);
						System.out.println("Exception occured: "+exceptionCast.getMessage());
//						System.out.println(e.getMessage());
					}
				};
		
	}

}
