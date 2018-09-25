package com.mohit.interfaces;

import java.util.Collections;
import java.util.List;

import com.mohit.model.Student;

public interface MyInterface {
	
	public default List<Student> sortStudents(List<Student> studentList){
		Collections.sort(studentList, (st1, st2) -> {
			return st1.getName().compareTo(st2.getName());
		});
		return studentList;	
	}
	
	
	 public static void greet(String name) {
		System.out.println("Wel "+name);
	}
	 
	 public abstract Integer getMax(List<Integer> intList);

//	 cannot override object class methods as implementing class gets confused what to override 
	 //	 public default String toString() {
//		 return "Mohit";
//	 }
}
