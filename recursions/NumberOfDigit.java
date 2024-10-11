package DataStructure.recursions;

public class NumberOfDigit {

	public static void main(String[] args) {
		System.out.println(numberOfDigits(1234567890));

	}

	private static int numberOfDigits(int n) {
		// base case
		if (n == 0) {
			return 0;
		}

		// recursive call
		int smallAnswer = numberOfDigits(n / 10);
		// calculations
		return 1 + smallAnswer;

	}

}
