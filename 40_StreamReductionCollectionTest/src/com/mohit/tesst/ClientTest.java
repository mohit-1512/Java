package com.mohit.tesst;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.mohit.model.Product;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> lst = Arrays.asList(
				new Product(1, "1qwe"),
				new Product(2, "2qwe"),
				new Product(2, "2qwe"),
				new Product(4, "4qwe"));

		List<String> collect = lst.stream().map(Product::getName).collect(Collectors.toList());
		//Reduce to collection
		collect.forEach(System.out::println);

		System.out.println("=-=============================");

		//Reduce to String
		String collect2 = lst.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect2);

		System.out.println("=-=============================");
		//Reduce to Avg
		Double collect3 = lst.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(collect3);


		//Reduce to Sum
		Integer collect4 = lst.stream().collect(Collectors.summingInt(Product::getPrice));
		System.out.println(collect4);

		//Reduce to Summarizaing
		IntSummaryStatistics collect5 = lst.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect5);

		
		//collectors groupby
		Map<String, List<Product>> collect6 = lst.stream().collect(Collectors.groupingBy(Product::getName));
		collect6.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		System.out.println("--------------------7");
		//Dividing Stream elements into groups as per some predicate
		Map<Boolean, List<Product>> collect7 = lst.stream().collect(Collectors.partitioningBy(p->p.getPrice()>=2));
		collect7.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		System.out.println("--------------------8");

		//Pushing the collector to perform additional transformation
		Set<Product> collect8 = lst.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect8.add(new Product(2,"sa"));
		collect8.forEach(a->{
			a.setName("sf");
			System.out.println(a);
		});
	}

}
