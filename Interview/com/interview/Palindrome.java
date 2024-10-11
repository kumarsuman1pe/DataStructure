package DataStructure.Interview.com.interview;

public class Palindrome {
	/***
	 * HPE
	 * 
	 * [11:07 AM] Kini, Akshay Ganesh ((IoT Ops))
	 * 
	 * Palindrome without using inbuilt equals/reverse method (or reverse shortcut).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Suman";
		if (isPalin(input.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}

	}

	private static boolean isPalin(String input) {
		boolean isPalin = true;
		for (int i = 0, j = input.length() - 1; i <= j; i++, j--) {

			if (input.charAt(i) != input.charAt(j)) {
				isPalin = false;
				break;
			}
		}
		return isPalin;
	}

}
