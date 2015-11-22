package sandbox.java8.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class DateTimeTest {

	public static void main(String[] args) {
		// Clock
		System.out.println("Clock (using UTC) : " + Clock.systemUTC().instant());
		
		System.out.println("ZonedDateTime (using default) : " + Clock.systemDefaultZone().instant().atZone(ZoneId.of("UTC+2")));
	}
}
