package com.mohit.interfaces;
@FunctionalInterface
public interface ThrowingConsumer <T, E extends Exception>{
	void accept(T t) throws Exception;
}
