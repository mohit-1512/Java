package com.mohit.client;

import java.util.ArrayList;
import java.util.List;

import com.mohit.interfaceImpl.MyClass;
import com.mohit.interfaces.MyInterface;
import com.mohit.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface myInterface = new MyClass();
		
		List<Integer> intList = new ArrayList<>();
		List<Student> studentList = new ArrayList<>();
		Student st1 = new Student("Mohit", 21);
		studentList.add(st1);
		intList.add(st1.getAge());
		
		
		Student st2 = new Student("Rohit", 22);
		studentList.add(st2);
		intList.add(st2.getAge());
		
		Student st3 = new Student("Cohit", 23);
		studentList.add(st3);
		intList.add(st3.getAge());
		
		printAllStudent(studentList);
		System.out.println("---------------------------------");
		myInterface.sortStudents(studentList);

		printAllStudent(studentList);
		
		System.out.println(myInterface.getMax(intList));
		
		System.out.println("---------------------------------");		
		
		MyInterface.greet("Mohit");
	}

	private static void printAllStudent(List<Student> studentList) {
		// TODO Auto-generated method stub
		for (Student student : studentList) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}
	}

	

}
