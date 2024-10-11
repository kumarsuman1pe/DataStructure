package DataStructure.Interview.com.interview;

import java.util.List;

public class StreamAndParallelStream {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = List.of(11, 2, 1, 5, 15);

        // Call the useOfStream method with the integer list
        useOfStream(list);

        // Create a list of Employee objects
        List<Employee> empList = List.of(new Employee(1, "Suman"), new Employee(2, "Ashish"));

        // Call the useOfParallelMap method with the Employee list
        useOfParallelMap(empList);
    }

    // Method to demonstrate the use of Stream
    private static void useOfStream(List<Integer> list) {
        // Using a stream, multiply each integer by 2 and print the result
        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    // Method to demonstrate the use of ParallelStream with map and forEachOrdered
    private static void useOfParallelMap(List<Employee> list) {
        // Using a parallel stream, extract and print the IDs of Employee objects
        // forEachOrdered ensures ordered processing even in parallel execution
        list.parallelStream().map(x -> x.id).forEachOrdered(System.out::print);
    }
}

// Employee class to represent an employee with an ID and a name
class Employee {
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    // Instance variables
    public int id;
    public String name;
}
