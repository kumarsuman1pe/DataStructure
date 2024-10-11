package DataStructure.strings;

import java.util.Iterator;
import java.util.Stack;

public class RemoveAdjacentDuplicate {

	public static void main(String[] args) {
		String s = "abbbabaaba";
		System.out.println(removeDuplicates(s));

	}

	public static String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				if (s.charAt(i) != stack.peek()) {
					stack.push(s.charAt(i));
				} else {
					stack.pop();
				}
			}
		}

		StringBuilder temp = new StringBuilder();
		
		while(!stack.isEmpty()) {
			
			temp.append(stack.pop());
			
			
		}
		return temp.reverse().toString();
	}
}
