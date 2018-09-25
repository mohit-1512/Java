package com.mohit.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList("/mf.txt",
				"/mf2.txt",
				"/mf3.txt",
				"/mf4.txt",
				"/mf5.txt");
		Stream<Path> map = lst.stream().map( url -> Paths.get(url));
		map.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		
		List<Details> details = new  ArrayList<>();
		Details d1 = new Details(1, Arrays.asList("Part1", "Part2"));
		details.add(d1);
		Details d2 = new Details(2, Arrays.asList("Part1", "Part2","Part3", "Part4"));
		details.add(d2);
		
		Stream<String> flatMapParts = details.stream().flatMap(detail -> detail.getParts().stream());
		
		flatMapParts.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
