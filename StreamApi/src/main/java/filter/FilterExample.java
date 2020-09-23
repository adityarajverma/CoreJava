package filter;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Aditya", "Rahul", "Khanna", "Sam", "Jatin");
		names.stream().filter(name -> !name.equals("Aditya")).forEach(name -> System.out.println(name));

	}

}
