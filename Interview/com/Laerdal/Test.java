package DataStructure.Interview.com.Laerdal;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> marks = List.of(1, 2, 3, 4, 5);
        int sum = calculateSum(marks);
        System.out.println(sum);

        int sum1 = calculateSumV1(marks);
        System.out.println(sum1);
    }

    private static Integer calculateSumV1(List<Integer> marks) {
         return marks.stream().mapToInt(x->(Integer)x).sum();
    }

    private static int calculateSum(List<Integer> marks) {
        return marks.stream().reduce(0, Integer::sum);
    }
}
