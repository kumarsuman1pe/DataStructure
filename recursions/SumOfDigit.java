package DataStructure.recursions;

public class SumOfDigit {

	public static void main(String[] args) {
		System.out.println(sum(1234));
	}

	private static int sum(int n) {
		// base case
		if (n == 0) {
			return 0;
		}
		// recursive call
		int smallAnswer = sum(n / 10);
		int lastDigit = n % 10;
		// calculation
		return lastDigit + smallAnswer;
	}

}
