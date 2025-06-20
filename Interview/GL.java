package DataStructure.Interview;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GL {
        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            String input="suman";
            Map<Character,Long> result=input.chars().mapToObj( e->(char)e).collect(Collectors.groupingBy( Function.identity(),Collectors.counting()));

            result.entrySet().stream().forEach( (e)->{
                System.out.print(e.getKey());
                System.out.println(" "+e.getValue());

            } );

            int arr[] = {12, 19, 20, 88, 00, 9};

            // Use Arrays.stream() for primitive arrays
            IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
            IntSummaryStatistics stats1 = Stream.of(arr).summaryStatistics();

            int max = stats.getMax();
            System.out.println("Max value: " + max);


        }
    }

