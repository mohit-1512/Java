package com.mohit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.mohit.interfaces.ThrowingConsumer;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		ClientTest ct = new ClientTest();
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

		lst.forEach(throwingConsumerWrapper(i->writeToFile(i)));
		System.out.println("rest of code");

	}
	private static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {
		return i->{
			try {
				throwingConsumer.accept(i);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

	private static Object writeToFile(Integer i) throws IOException{
		// TODO Auto-generated method stub
		throw new IOException();
//		return null;
	}
	

}