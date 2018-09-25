package com.mohit.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mohit.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		List<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee("mohit", "mohit@gmail.com", 35435643));
		emplList.add(new Employee("rohit", "rohit@gmail.com", 3142));
		emplList.add(new Employee("cohit", "cohit@gmail.com", 3224));
		emplList.forEach(System.out::println);

//		Collections.sort(emplList, new EmployeeNameSorter());
		Collections.sort(emplList,(a,b) -> a.getName().compareTo(b.getName()));
		
		emplList.forEach(System.out::println);
	}

}

class EmployeeNameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
