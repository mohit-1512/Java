package com.mohit.client;

import com.mohit.interfaces.MyInterface;

public class ClientTest {
	public static void main(String[] args) {
		MyInterface interface1 = (i1, i2) -> i1>i2;
		System.out.println(interface1.method(4,  8));
	}
}
