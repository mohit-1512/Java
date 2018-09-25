package com.mohit.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mohit.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		Map<Integer, Employee> map= new HashMap<>();
		map.put(1,  new Employee("mohit", "mohit@gmail.com", 35435643));
		map.put(2,  new Employee("rohit", "rohit@gmail.com", 3142));
		map.put(3,  new Employee("cohit", "cohit@gmail.com", 3224));
		
		
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		for (Entry<Integer, Employee> e: map.entrySet()) {
			System.out.println(e.getValue());
		}
		
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
			System.out.println(map.get(integer));
		}
		
		
		map.forEach((key,value) -> {
			System.out.println(key);
			System.out.println(value);
		});
		
	}

}
