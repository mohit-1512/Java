package com.mohit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ClientTest2 {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(0,12,
				4,
				4,
				10,
				0);

		lst.forEach(i->
		{
			try {
				writeToFile(i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		});
	}



	private static Object writeToFile(Integer i) throws IOException{
		// TODO Auto-generated method stub
		return null;
	}
	@FunctionalInterface
	interface ECon<T>{
		void accept(T t) throws IOException;
	}

}