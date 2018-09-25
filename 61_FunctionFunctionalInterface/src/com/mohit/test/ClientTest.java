package com.mohit.test;

import java.util.Arrays;
import java.util.List;

import com.mohit.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> lst = Arrays.asList(
				new Student("Nmohit",12),
				new Student("Nmoh1it",122),
				new Student("Nmohit1",124),
				new Student("Nmohi1t",12));
		
		lst.forEach(s -> 
		System.out.println(s.customShow(stud->stud.getName())));
	}

}
