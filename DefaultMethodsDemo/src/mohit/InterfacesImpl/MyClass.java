package mohit.InterfacesImpl;

import com.mohit.int1.Interface1;
import com.mohit.int2.Interface2;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		Interface2.super.method();
	}
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method();
	}

}
