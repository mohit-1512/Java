package com.mohit.tst;

import java.util.Arrays;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList("str1",
				"str3",
				"str3",
				"str4");
		System.out.println(lst.stream().distinct().count());
		
		System.out.println(lst.stream().anyMatch(s ->{
		return s.contains("r4") && s.contains("s");
		}));
	}

}
