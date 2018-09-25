package com.mohit;

public class ThisReferenceInLambda {

	public void test() {
		doOperate(10,  n -> {
			// TODO Auto-generated method stub
			System.out.println(n);
			System.out.println(this);
		}
	);
		
		
		doOperate(10, new Operation() {
			
			@Override
			public void operate(int n) {
				// TODO Auto-generated method stub
				System.out.println(n);
				System.out.println(this);
			}
		});
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReferenceInLambda t = new ThisReferenceInLambda();
		t.test();
		
//		doOperate(x, n -> System.out.println(n));
//		doOperate(x, new Operation() {
//			
//			@Override
//			public void operate(int n) {
//				// TODO Auto-generated method stub
//				System.out.println(n);
//				System.out.println(this);
//			}
//		});
		
		
	}
	
	static void doOperate(int x, Operation o) {
		o.operate(x);
	}
}