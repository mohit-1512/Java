package com.mohit.test;

import java.util.ArrayList;
import java.util.List;

import com.mohit.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohit",24));
		students.add(new Student("Cohit",22));
		students.add(new Student("Rohit",25));
		students.add(new Student("Sohit",27));
		students.parallelStream().forEach(ClientTest::doProcess);
		
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}
