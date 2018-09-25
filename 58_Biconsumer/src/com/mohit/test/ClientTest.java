package com.mohit.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import com.mohit.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Test");
		map.put(2, "Test1");
		map.put(3, "Test2");
		
//		BiConsumer<Integer, String> biConsumer = (k,v)->{
//			System.out.println(k+"\t"+v);
//		};
//		
		map.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		
		Map<Integer, Student> map2 = new HashMap<>();
		
		map2.put(1, new Student("Mohit", 124));
		map2.put(2, new Student("Mohit1", 1241));
		map2.put(3, new Student("Mohit2", 1242));
		
		
		map2.forEach((k, v) ->{
			System.out.println(k +"\t"+v);
		});
	}

}
