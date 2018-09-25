package com.mohit.test;

import com.mohit.interfaces.MyComparator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparator myComparator = (n1,n2) -> n1>n2;
		System.out.println(myComparator.compare(1, 2));
	}

}
