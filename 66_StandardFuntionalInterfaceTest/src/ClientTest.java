import java.util.function.Function;

public class ClientTest {
	public static void main(String[] args) {
////		Foo f = p -> "test"+p;
//		UseFoo useFoo = new UseFoo();
//		System.out.println(useFoo.method("t", f));
		
		Function<String, String> fn = p -> p +":test";
		UseFoo u = new UseFoo();
		System.out.println(u.method("3raf", fn));
		
		Runnable r = ()-> System.out.println("test");
		Thread thread = new Thread(r);
		thread.start();
		
	}
}
