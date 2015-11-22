package sandbox.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import sandbox.java8.streams.StreamsTest.Task.Status;

public class StreamsTest {

	public static void main(String[] args) {
		final Collection< Task > tasks = Arrays.asList(
			    new Task( Status.OPEN, 5 ),
			    new Task( Status.OPEN, 13 ),
			    new Task( Status.CLOSED, 8 ) 
			);
		
		System.out.println("Filter + count: " + tasks.stream().filter(t -> t.getStatus() == Status.OPEN).count());
		System.out.println("Collect (groupBy status): " + tasks.stream().collect(Collectors.groupingBy(Task::getStatus)));
		
	}

	public static final class Task {
		private final Status status;
		private final Integer points;

		public Task(final Status status, final Integer points) {
			this.status = status;
			this.points = points;
		}

		public Integer getPoints() {
			return points;
		}

		public Status getStatus() {
			return status;
		}

		@Override
		public String toString() {
			return String.format("[%s, %d]", status, points);
		}

		public static enum Status {
			OPEN, CLOSED
		};
	}
}
