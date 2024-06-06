package DataStructure.Java8;


import java.util.*;
import java.util.stream.Collectors;

public class StudentMarksAndAvg {
    private Integer id;
    private String name;
    private Double score;
public StudentMarksAndAvg(Integer id, String name, Double score) {
    this.id = id;
    this.name = name;
    this.score = score;
}

    @Override
    public String toString() {
        return "StudentMarksAndAvg{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    // Constructor, getters, and setters omitted for brevity

    public static void main(String[] args) {
        List<StudentMarksAndAvg> students = new ArrayList<>();
        // Add student data...
        students.add(new StudentMarksAndAvg(1, "Alice", 85.0));
        students.add(new StudentMarksAndAvg(2, "Bob", 92.0));
        students.add(new StudentMarksAndAvg(3, "Charlie", 78.0));
        students.add(new StudentMarksAndAvg(4, "David", 88.0));


        StudentMarksAndAvg topStudent = findTopStudent(students);
        double averageScore = calculateAverageScore(students);
        List<String> belowAverageStudents = findStudentsBelowAverage(students, averageScore);

        System.out.println("Top Student: " + topStudent);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Students Below Average: " + belowAverageStudents);
    }

    public static StudentMarksAndAvg findTopStudent(List<StudentMarksAndAvg> students) {
     return students.stream().max(Comparator.comparingDouble(StudentMarksAndAvg::getScore)).orElseGet(null);
    }

    public static double calculateAverageScore(List<StudentMarksAndAvg> students) {
      return students.stream().mapToDouble(StudentMarksAndAvg::getScore).average().orElse(0.0);
           }

    public static List<String> findStudentsBelowAverage(List<StudentMarksAndAvg> students, double averageScore) {
    return students.stream().filter(e->e.getScore()<=averageScore).map(StudentMarksAndAvg::getName).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}

