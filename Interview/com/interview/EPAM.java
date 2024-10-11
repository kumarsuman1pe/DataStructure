package DataStructure.Interview.com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class EPAM {
	/*
	 * In: {1, 6, 4, 10, 2, 5} 
	 * Out: {_, 1, 1, 4, 1, 2}
	 */

//	  input:   abdc
//	  output:  3210
//	

	public static void main(String[] args) {
		int input[] = { 1, 6, 4, 10, 2, 5 };
		List<String> output = prepareNearestSmallerToLeft(input);
		System.out.println(output.stream().collect(Collectors.joining(",")));
		// output.stream().forEach(ele -> System.out.println(ele));

	}

	private static List<String> prepareNearestSmallerToLeft(int[] input) {
		Stack<String> stack = new Stack<String>();
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			if (stack.isEmpty()) {
				output.add("_");
			} else {
				while (!stack.isEmpty()) {
					if (Integer.valueOf(stack.peek()) < (Integer.valueOf(input[i]))) {
						output.add(stack.peek());
						break;
					} else {
						stack.pop();
					}
				}
			}
			stack.add(String.valueOf(input[i]));
		}
		return output;
	}

}
