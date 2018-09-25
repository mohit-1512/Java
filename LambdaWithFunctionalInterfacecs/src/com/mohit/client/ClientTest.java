package com.mohit.client;

import com.mohit.interfaces.MyInterface1;
import com.mohit.interfaces.MyInterface2;
import com.mohit.interfaces.MyInterface3;

public class ClientTest {
	public static void main(String[] args) {
		MyInterface1 myInterface=() -> System.out.println("test");
		
		myInterface.method1();
		
		
		System.out.println("-------------");
		MyInterface2 myinterface2 = name-> System.out.println(name);
		
		myinterface2.method("Name");
		System.out.println("-------------");
		MyInterface3 myInterface3 = (name, age) -> {
							System.out.println("name:" +name );
							System.out.println("age : "+ age);
							};
							
		myInterface3.method3("mohit", 25);
													
													
	}
}
