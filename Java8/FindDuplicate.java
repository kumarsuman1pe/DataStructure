package DataStructure.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    //Given Input : [1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 8]
    // Output : [2, 3, 8]
    public static void main( String[] args ) {
        Set<Integer> hs=new HashSet<>();
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 8  );
        List<Integer> duplicates= list.stream().filter( e->!hs.add(e) ).collect( Collectors.toList() ) ;
        System.out.println("1st approach... "+duplicates);
       List<Integer> duplicates2= list.stream().collect(
           Collectors.groupingBy( Function.identity(),Collectors.counting() )).
            entrySet().stream().filter( e->e.getValue()>1 ).map( e->e.getKey() ).collect( Collectors.toList() );

        System.out.println("2nd approach... "+duplicates2);
    }
}
