package com.mohit.interfaceImpl;

import java.util.Collections;
import java.util.List;

import com.mohit.interfaces.MyInterface;

public class MyClass implements MyInterface{

	@Override
	public Integer getMax(List<Integer> intList) {
		return Collections.max(intList);
	}

	
}
