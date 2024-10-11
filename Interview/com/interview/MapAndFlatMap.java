package DataStructure.Interview.com.interview;

import java.util.ArrayList;
import java.util.List;

public class MapAndFlatMap {

	public static void main(String[] args) {
		List<Student> stList = List.of(new Student(1, "Suman", List.of(1, 2, 3)),
				new Student(12, "Ashish", List.of(5, 5, 11)));
		mapExample(stList);
		flatMap(stList);

	}

	private static void mapExample(List<Student> stList) {
		System.out.println("Map example..");
		stList.stream().map(x -> x.numList).forEach(System.out::println);
	}

	private static void flatMap(List<Student> stList) {
		System.out.println("\nFlat map..");
		stList.stream().flatMap(x -> x.numList.stream()).forEach(System.out::println);
	}

}

class Student {

	// Instance variables
	public int id;
	public String name;
	List<Integer> numList; // = new ArrayList<>();

	public Student(int id, String name, List<Integer> list) {
		this.id = id;
		this.name = name;
		numList = new ArrayList<>();
		numList.addAll(list);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	// Getter and setter methods for id and name
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}