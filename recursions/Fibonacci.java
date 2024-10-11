package DataStructure.recursions;

/***
 * 
 * @author sumankumar
 *
 *         implemented Fibonacci using recurssion and Iteration
 */
public class Fibonacci {
	private static Integer store[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	public static void main(String[] args) {
		System.out.println("Sum of Fibbonacii Series using Recurssion...");

		int rFibSum = getFibbonacciSumUsingRecurssion(5);
		System.out.println(rFibSum);

		System.out.println("Sum of Fibbonacii Series using Itteration...");

		int iFibSum = getFibbonacciSumUsingLoop(5);
		System.out.println(iFibSum);
		/**
		 * Memoization is techniques to improve the performance of successive
		 * recurssion(recurssion caaling more than one :Order(2 power n)) by storing the
		 * already computed values into array in our case store and order of growth
		 * become (Order(O(n)))
		 */
		System.out.println("Memoizationed: Sum of Fibbonacii Series...");

		int memoizationFib = getMemoizationFib(5);
		System.out.println(memoizationFib);

	}

	private static int getFibbonacciSumUsingLoop(int n) {

		int firstTerm = 0;
		int secondTerm = 1;
		int sum;
		for (int i = 2; i < n - 1; i++) {
			sum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm += sum;

		}

		return secondTerm;
	}

	private static int getMemoizationFib(int n) {

		if (n <= 1) {
			return store[n] = n;
		}
		if (store[n - 2] == -1) {
			store[n - 2] = getMemoizationFib(n - 2);

		}
		if (store[n - 1] == -1) {
			store[n - 1] = getMemoizationFib(n - 1);

		}

		return store[n] = store[n - 2] + store[n - 1];
	}

	private static int getFibbonacciSumUsingRecurssion(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getFibbonacciSumUsingRecurssion(n - 2) + getFibbonacciSumUsingRecurssion(n - 1);
		}
	}

}
