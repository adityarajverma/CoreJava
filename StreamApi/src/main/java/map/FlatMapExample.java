package map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapExample {

	public static void main(String args[]) {

		List<Employee> employees = Arrays.asList(

				new Employee("Aditya", "Noida", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Rahul", "Bhangel", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Verma", "Surat", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Ajeet", "Patna", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Shukla", "Delhi", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Gandhi", "Gurgaon", 31, Arrays.asList(1, 2, 3, 4)),
				new Employee("Raj", "Faridabad", 31, Arrays.asList(1, 2, 3, 4)));

		Optional<Integer> optionalResult = employees.stream().map(employee -> employee.getPhoneCodes().stream())
				.flatMap(employeeStream -> employeeStream.filter(phone -> !phone.equals(4))).findAny();
		optionalResult.ifPresent(value -> System.out.println(value));

		// https://www.baeldung.com/java-difference-map-and-flatmap

	}

}

class Employee {
	private String name;
	private String city;
	private Integer age;
	private List<Integer> phoneCodes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Integer> getPhoneCodes() {
		return phoneCodes;
	}

	public void setPhoneCodes(List<Integer> phoneCodes) {
		this.phoneCodes = phoneCodes;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + ", phoneCodes=" + phoneCodes + "]";
	}

	public Employee(String name, String city, Integer age, List<Integer> phoneCodes) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.phoneCodes = phoneCodes;
	}

}