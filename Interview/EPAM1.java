package DataStructure.Interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

class EPAM1 {
    public static void main(String[] args) {

        Integer[] input = { 1, 2, 3, 1, 2, 4, 5 };
        Map<Integer, Long> countMap = Stream.of(input)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countMap.entrySet().stream().forEach((e) -> {

            if (e.getValue() % 2 != 0) {
                System.out.println(e.getKey());
            }
        });
    }
}