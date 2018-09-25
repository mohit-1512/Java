package com.mohit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1,3,5,6,6);
		lst.stream().distinct().forEach(System.out::println);
		System.out.println(lst.stream().reduce(100, Integer::sum ));
		System.out.println("----------------------");
		
		List<String> names = Arrays.asList("Mohit",
				"3ohit",
				"cohit");
		
		List<String> nameLst = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		Stream<String> map = names.stream().map(String::toUpperCase);
		nameLst.forEach(System.out::println);
		map.forEach(System.out::println);
	}

}
