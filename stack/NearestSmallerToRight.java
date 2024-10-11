package DataStructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToRight {

	public static void main(String[] args) {
		int[] input = { 2, 3, 1, 7, 5 };
		// output: [1 1 - 5 -]
		List<String> list = findNearestSmallerToRIght(input);
		System.out.println("Nearest Element to its Right....");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(" " + list.get(i));
		}
	}

	private static List<String> findNearestSmallerToRIght(int[] input) {
		List<String> output = new ArrayList<String>(input.length);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = input.length - 1; i >= 0; i--) {

			while (!stack.isEmpty()) {
				if (Integer.valueOf(stack.peek()) < input[i]) {
					output.add(String.valueOf(stack.peek()));
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				output.add("_");
			}

			stack.add(input[i]);
		}

		return output;
	}

}
