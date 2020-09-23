package peekAndSkip;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkip {

	public static void main(String args[]) {

		Stream.of("Aditya", "Rahul", "Raj", "Vikash", "Ajay").filter(name -> name.contains("a"))
				.peek(name -> System.out.println("Peek : " + name)).forEach(name -> System.out.println(name));

		IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(2).filter(num -> num > 5).forEach(num -> System.out.println(num));

	}

}
