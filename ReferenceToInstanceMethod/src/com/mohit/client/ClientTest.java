package com.mohit.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.mohit.model.Person;

public class ClientTest {
	public static void main(String[] args) {
		List<Person> listPersons = new ArrayList<>();
		
		listPersons.add(new Person("mohit", 32));
		listPersons.add(new Person("qohit", 32));
		listPersons.add(new Person("rohit", 32));
		listPersons.add(new Person("fohit", 32));
		
		List<String> namess = ClientTest.getNames(listPersons,Person::getName);
		namess.forEach(System.out::println);
	}


	private static <T> List<String> getNames(List<Person> listPersons, Function<Person, String> f) {
		// TODO Auto-generated method stub
		List<String> results = new ArrayList<>();
//		listPersons.forEach(x -> results.add(f.apply(x)));
//		listPersons.forEach(new Consumer<Person>() {
//
//			@Override
//			public void accept(Person t) {
//				// TODO Auto-generated method stub
//				results.add(f.apply(t));
//			}
//		});
		listPersons.forEach(p -> results.add(f.apply(p)));
		return results;
		
	}

	
}
