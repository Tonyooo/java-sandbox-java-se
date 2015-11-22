package sandbox.java8.optional;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		final Optional<String> optionalNotNull = Optional.ofNullable("foo");
		final Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Filter = " + optionalNotNull.filter(s -> s.equals("foo")));
		System.out.println("Flat map = " + optionalNotNull.flatMap(s -> Optional.of(s += "bar")));
		System.out.println("Map = " + optionalNotNull.map(s -> s += "bar"));
		System.out.println("OrElse (with null optional) = " + optionalNull.orElse("alternative value"));
	}
}
