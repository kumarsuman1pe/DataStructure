package DataStructure.Interview.com.interview;

public class CheckIfTwoStringConatinsSameValue {
	/*
	 * asked in Applied Materials 2nd round
	 * 
	 * a	097		A	065	
	 * 
	 */
	public static void main(String[] args) {
		// coast | coats
		// true
		// coast | coatr
		// FALSE
		String input1 = "coats";
		String input2 = "coast";
		System.out.println(
				checkIfStringsContainsSameValue(input1, input2) ? "Strings are equals " : "Strings are not eqauls ");

	}

	private static boolean checkIfStringsContainsSameValue(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}
		int[] temp = new int[26];
		for (int i = 0; i < input1.length(); i++) {
			temp[input1.charAt(i) - 97]++;
		}

		for (int i = 0; i < input2.length(); i++) {
			temp[input2.charAt(i) - 97]--;
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
