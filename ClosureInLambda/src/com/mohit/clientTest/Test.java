package com.mohit.clientTest;

import com.mohit.MyClass;
import com.mohit.Operation;

public class Test {
	void test()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		int z = 20;
		Test t = new Test();
		t.test();
		
//		doOperate(x, new Operation() {
//			private void init() {
//				// TODO Auto-generated method stub
//				int y = 10;
//			}
//			@Override
//			public void operate(int n) {
//				// TODO Auto-generated method stub
//				System.out.println(n+y);
//			}
//		});
		
		
		
		MyClass m =new MyClass() {
			
			@Override
			public void t1() {
				// TODO Auto-generated method stub
				System.out.println(this);
			}
		};
		doOperate(x,m);
	}

	private static void doOperate(int i, Operation o) {
		
		o.operate(i);
		
	}
}
