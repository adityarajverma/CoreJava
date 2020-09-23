package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String args[]) {

		List<String> names = Arrays.asList("Aditya", "Rahul", "Ajeet", "sharukh", "Verma");
		names.stream().filter(name -> !name.equals("Aditya")).map(name -> new User(name))
				.forEach(user -> System.out.println(user));

		// map have consume Function<T,R>
		// Function have only one unimplemented method
		// R apply(T t);

		// Now if we want to collect the Stream instead of printing or doing any
		// terminal operation which end in printing it.
		// It simply means we want to persisit the data in any collection for further
		// uses.

		List<User> userList = names.stream().filter(name -> !name.equals("Aditya")).map(name -> new User(name))
				.collect(Collectors.toList());

		System.out.println("Printed after collectors");
		System.out.println(userList);

	}

}

class User {
	private String name;
	private Integer age = 30;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
