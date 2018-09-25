package com.mohit.test;

import java.util.function.BiFunction;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, String> biFunction=
				(i ,j)-> "res:"+(i+j);
				
		System.out.println(biFunction.apply(1, 2));
	}

}
