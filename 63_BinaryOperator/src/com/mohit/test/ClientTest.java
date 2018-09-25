package com.mohit.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("Z", "C");
		map.put("Y", "B");
		map.put("X", "A");
		
		BinaryOperator<String> binaryOperator=
				(str1, str2) -> str1.concat(":"+str2);
		
		System.out.println(BinaryOptFunc(binaryOperator, map));
		
		
		
	}

	private static List<String> BinaryOptFunc(BinaryOperator<String> binaryOperator, Map<String, String> map) {
		// TODO Auto-generated method stub
		List<String> op = new ArrayList<>();
		map.forEach((a, b) ->{
			op.add(binaryOperator.apply(a, b));
		});
		return op;
	}

}
