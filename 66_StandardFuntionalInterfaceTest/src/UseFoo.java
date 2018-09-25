import java.util.function.Function;

public class UseFoo {
//	public String method(String s, Foo f) {
//		return f.method(s);
//	}
	
	public String method(String s, Function<String, String> f) {
		return f.apply(s);
	}

}
