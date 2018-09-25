package com.mohit;

public abstract class MyClass implements Operation{
	public int y;
	@Override
	public void operate(int n) {
		// TODO Auto-generated method stub
		System.out.println(n+y);
		t1();
	}
	public abstract void t1();
//	public MyClass() {
//		// TODO Auto-generated constructor stub
//		
//	}
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//	

}
