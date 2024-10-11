import java.util.List;
import java.util.stream.Collectors;

public class Vorizoit {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,9,8,6,5,3,4,2,7);
List<Integer> sortedList= list.stream().sorted().collect(Collectors.toList());
sortedList.forEach(System.out::print);
        //int sum=list.stream().filter(e->e%2==0).map(e->e*e).mapToInt(e->(Integer)e).sum();
       // System.out.println("Sum of squares number "+sum);
        
    }
}
