package DataStructure.recursions;

public class SumOfArray_Lacture_24 {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(calculateSumOfArray(array, array.length - 1));

	}

	private static int calculateSumOfArray(int[] array, int n) {
		// base case
		if (n == 0) {
			return array[0];
		}
		// recurssive case
		// System.err.println("Phale... "+array[n]);
		int calSmallArraySum = calculateSumOfArray(array, n - 1);
		// System.err.println("bad mn... "+array[n]);

		// calculation
		return calSmallArraySum += array[n];
	}

}
