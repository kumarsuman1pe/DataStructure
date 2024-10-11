package DataStructure.recursions;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2, 5));

	}

	private static int power(int x, int n) {
		// base case
		if (n == 0) {
			return 1;
		}
		// recurssive call
		int smallAnswer = power(x, n - 1);
		// calculation

		return x * smallAnswer;
	}

}
