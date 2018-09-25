package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Student;


public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Mohit",24));
		students.add(new Student("Cohit",22));
		students.add(new Student("Rohit",25));
		students.add(new Student("Sohit",27));
		
		Stream<Student> filter = students.stream().filter(s->s.getAge()>25);
		filter.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		System.out.println(students.stream().allMatch(s -> s.getName().contains("t")));
		System.out.println("-----------------------------");
		
		System.out.println(students.stream().anyMatch(s-> s.getAge() > 55));
		System.out.println("-----------------------------");
		
		System.out.println(students.stream().noneMatch(s->s.getName().contains("w")));
		
		
	}

	

}
