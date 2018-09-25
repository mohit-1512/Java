package com.mohit.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mohit.model.Student;

public class ClientTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("mohit", 21));
		studentList.add(new Student("cohit", 22));
		studentList.add(new Student("rohit", 23));
		
		studentList.forEach(System.out::println);
	}
}

//class MyConsumer implements Consumer<Student>{
//
//	@Override
//	public void accept(Student t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//	
//}
