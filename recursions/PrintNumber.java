package DataStructure.recursions;

public class PrintNumber {

	public static void main(String[] args) {
		printNumber(5);
		System.out.println();
		printNumberInReverse(5);
	}

	private static void printNumber(int n) {

		// base case
		if (n == 0) {
			return;
		}
		// recursive call
		printNumber(n - 1);
		// calculation
		System.out.print(" " + n);
	}

	private static void printNumberInReverse(int n) {

		// base case
		if (n == 0) {
			return;
		}
		// calculation
		System.out.print(" " + n);
		// recursive call
		printNumberInReverse(n - 1);

	}
}
