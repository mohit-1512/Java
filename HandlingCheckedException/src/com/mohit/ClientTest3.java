package com.mohit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.mohit.interfaces.ThrowingConsumer;

public class ClientTest3 {

	public static void main(String[] args) throws IOException {
		ClientTest3 ct = new ClientTest3();
		try {
			ct.test();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of c");
		
	}

	private void test() throws Exception{
		List<Integer> lst = Arrays.asList(0,12,
				4,
				4,
				10,
				0);

		lst.forEach(handlingConsumerWrapper(i->writeToFile(i), IOException.class));
		System.out.println("rest of code");

	}
	private static <T, E extends Exception> Consumer<T> handlingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer,
			Class<E> exceptionClass) {
		return i->{
			try {
				throwingConsumer.accept(i);
			} catch (Exception e) {
				try {
					E exCast = exceptionClass.cast(e);
					System.err.println("Exception occured:"+ exCast.getMessage());
				}catch (ClassCastException ccEx) {
					throw new RuntimeException(ccEx);
				}
				
			}
		};
	}

	private static Object writeToFile(Integer i) throws IOException{
		// TODO Auto-generated method stub
		throw new IOException();
//		return null;
	}
	

}