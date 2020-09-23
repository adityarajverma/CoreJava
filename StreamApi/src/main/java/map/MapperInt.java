package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperInt {

	public static void main(String args[]) {

		List<String> names = Arrays.asList("Aditya", "Rahul", "Ajeet", "sharukh", "Verma");
		List<User> userList = names.stream().filter(name -> !name.equals("Aditya")).map(name -> new User(name))
				.collect(Collectors.toList());

		int total = userList.stream().mapToInt(user -> user.getAge()).sum();
		System.out.println(total);

	}

}
