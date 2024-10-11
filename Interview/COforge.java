import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class COforge {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList( 5, 2, 9, 1, 6);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
		System.out.println();
		String input = "helLo wOrld";
		input.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		forEach((e,v)->{
			System.out.print(e);
			System.out.print(" "+v);
			System.out.println();
		});
		System.out.println();
		String s="hello";
		s.chars().mapToObj(e->(char)e).sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::print);
		System.out.println();
		String str="suman";
		
		String reversedString = str.chars() // Stream of character codes (int)
                .mapToObj(c -> (char) c) // Convert codes to characters
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString(); // Convert StringBuilder to String (reversed)
System.out.println(reversedString);
	}
	


}
