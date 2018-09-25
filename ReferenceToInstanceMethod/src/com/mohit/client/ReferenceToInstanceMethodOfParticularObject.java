package com.mohit.client;

import java.util.Arrays;
import java.util.List;

public class ReferenceToInstanceMethodOfParticularObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Mohit",
				"Cohit",
				"rohit",
				"tohit");
		names.forEach(System.out::println);
	}

}
