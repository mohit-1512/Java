package com.mohit.tesst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mohit.model.Product;

public class ParalletStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> lst = Arrays.asList(
				new Product(1, "1qwe"),
				new Product(2, "2qwe"),
				new Product(2, "2qwe"),
				new Product(4, "4qwe"));
		
		Stream<Product> parallelStream = lst.parallelStream();
		System.out.println(parallelStream.isParallel());
		
		IntStream parallel = IntStream.range(1, 10).parallel();
		System.out.println(parallel.isParallel());
		
		IntStream sequential = parallel.sequential();
		System.out.println(sequential.isParallel());
	}

}
